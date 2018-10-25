import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DeliveryLoginComponent } from './delivery-login.component';

describe('DeliveryLoginComponent', () => {
  let component: DeliveryLoginComponent;
  let fixture: ComponentFixture<DeliveryLoginComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DeliveryLoginComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DeliveryLoginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
