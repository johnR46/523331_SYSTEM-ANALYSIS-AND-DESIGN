import { TestBed } from '@angular/core/testing';

import { StaffDeliveryLoginService } from './staff-delivery-login.service';

describe('StaffDeliveryLoginService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: StaffDeliveryLoginService = TestBed.get(StaffDeliveryLoginService);
    expect(service).toBeTruthy();
  });
});
