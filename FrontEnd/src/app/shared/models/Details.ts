export class Details {

  constructor(private _continentsName?: string,
    private _regionsName?: string,
    private _countriesName?: string,
    private _year?: number,
    private _gdp?: number,
    private _population?: number) {
  }


  get continentsName(): string {
    return this._continentsName;
  }

  set continentsName(value: string) {
    this._continentsName = value;
  }

  get regionsName(): string {
    return this._regionsName;
  }

  set regionsName(value: string) {
    this._regionsName = value;
  }

  get countriesName(): string {
    return this._countriesName;
  }

  set countriesName(value: string) {
    this._countriesName = value;
  }

  get year(): number {
    return this._year;
  }

  set year(value: number) {
    this._year = value;
  }

  get gdp(): number {
    return this._gdp;
  }

  set gdp(value: number) {
    this._gdp = value;
  }

  get population(): number {
    return this._population;
  }

  set population(value: number) {
    this._population = value;
  }
}
