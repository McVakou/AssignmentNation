import { Component, OnDestroy, OnInit } from '@angular/core';
import { Details } from "../../shared/models/details";
import { map } from "rxjs/operators";
import { RegionService } from "../services/region.service";
import { Region } from "../../shared/models/Region";
import { DetailsTableService } from '../services/details-table.service';

@Component({
  selector: 'app-details-table-home',
  templateUrl: './details-table-home.component.html',
  styleUrls: ['./details-table-home.component.css']
})
export class DetailsTableHomeComponent implements OnInit, OnDestroy {

  details: Details[]
  regions: Region[];
  minYear: number = 0;
  maxYear: number = new Date().getFullYear();
  regionFilter: string = '-1';
  detailsFilteredByRegion: Details[]
  constructor(private detailsService: DetailsTableService,
    private regionService: RegionService) {
  }

  fetchRegions = () => {
    this.regionService.getAll()
      .pipe(
        map(actions =>
          actions.map(action => {
            return action as Region;
          }
          )))
      .subscribe(regions => this.regions = regions);
  }

  fetchTableData = () => {
    this.detailsService.getDetails()
      .pipe(
        map(actions =>
          actions.map(action => {
            return action as Details;
          }
          )))
      .subscribe(details => {
        this.details = details
        this.filterByRegionAndYear();
        this.minYear = this.findMinYear(details);
      });
  }

  filterByRegionAndYear = () => {
    this.detailsFilteredByRegion = this.details.filter((detail: Details) => {
      const validYear = detail.year >= this.minYear && detail.year <= this.maxYear;
      if (this.regionFilter === '-1') {
        return validYear
      }
      return detail.regionsName === this.regionFilter && validYear
    }
    );
  }

  isButtonDisabled = () => {
    return typeof this.minYear === 'number' && typeof this.maxYear === 'number'
  }

  findMinYear = (details: Details[]) => {
    const detailWithMinYear = details.reduce(function(prev, curr) {
      return prev.year < curr.year ? prev : curr;
  })
  return detailWithMinYear.year
  }

  ngOnInit(): void {
    this.fetchRegions();
    this.fetchTableData();
  }

  ngOnDestroy(): void {
  }

}
