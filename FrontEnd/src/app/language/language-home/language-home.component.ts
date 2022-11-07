import { Component, OnDestroy, OnInit } from '@angular/core';
import { ActivatedRoute } from "@angular/router";
import { LanguageService } from "../services/language.service";
import { Language } from "../../shared/models/Language";
import { map } from "rxjs/operators";
import { Country } from "../../shared/models/country";

@Component({
  selector: 'app-language-home',
  templateUrl: './language-home.component.html',
  styleUrls: ['./language-home.component.css']
})
export class LanguageHomeComponent implements OnInit, OnDestroy {

  countryId: number;
  countryName: string;
  country: Country = new Country();
  languages: Language[];

  constructor(private languageService: LanguageService,
    private route: ActivatedRoute) { }

  ngOnInit(): void {
    console.log(this.route)
    this.countryId = +this.route.snapshot.paramMap.get('id');
    if (this.countryId) {
      this.fetchTableData(this.countryId);
      this.countryName = sessionStorage.getItem("selectedCountry");
    }
  }

  fetchTableData = (countryId: number) => {

    this.languageService.getByCountryId(countryId)
      .pipe(
        map(actions =>
          actions.map(action => {
            return action as Language;
          }
          )))
      .subscribe(languages => this.languages = languages);
  }

  ngOnDestroy(): void {
  }

}
