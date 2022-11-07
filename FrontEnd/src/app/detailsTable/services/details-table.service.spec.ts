import { TestBed } from '@angular/core/testing';

import { DetailsTableService } from './details-table.service';

describe('AnalyticTableService', () => {
  let service: DetailsTableService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DetailsTableService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
