import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StaffDeliveryLoginComponent } from './staffDelivery-login.component';

describe('StaffDeliveryLoginComponent', () => {
  let component: StaffDeliveryLoginComponent;
  let fixture: ComponentFixture<StaffDeliveryLoginComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StaffDeliveryLoginComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StaffDeliveryLoginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
