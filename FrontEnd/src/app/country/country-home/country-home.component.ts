import { Component, OnDestroy, OnInit } from '@angular/core';
import { Country } from "../../shared/models/country";
import { CountryService } from "../services/country.service";
import { map } from "rxjs/operators";
import { Router } from "@angular/router";

@Component({
  selector: 'app-country-home',
  templateUrl: './country-home.component.html',
  styleUrls: ['./country-home.component.css']
})

export class CountryHomeComponent implements OnInit, OnDestroy {

  countries: Country[] = [];
  // p: number=1
  constructor(private countryService: CountryService,
    private router: Router) {
  }

  fetchTableData = () => {
    this.countryService.getAll()
      .pipe(
        map(actions =>
          actions.map(action => {
            return action as Country;
          }
          )))
      .subscribe(countries => this.countries = countries);
  }

  onRowClick = (country: Country) => {
    console.log(country);
    this.router.navigate(['./language/' + country.countryId]);
    sessionStorage.setItem("selectedCountry", country.name);
  }

  ngOnInit(): void {
    this.fetchTableData();
  }

  ngOnDestroy(): void {
  }

}
