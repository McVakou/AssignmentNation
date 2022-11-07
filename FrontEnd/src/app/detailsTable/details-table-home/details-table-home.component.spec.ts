import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailsTableHomeComponent } from './details-table-home.component';

describe('AnalyticTableHomeComponent', () => {
  let component: DetailsTableHomeComponent;
  let fixture: ComponentFixture<DetailsTableHomeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DetailsTableHomeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DetailsTableHomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
