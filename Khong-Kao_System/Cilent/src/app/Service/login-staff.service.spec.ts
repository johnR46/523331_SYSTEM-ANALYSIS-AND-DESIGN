import { TestBed } from '@angular/core/testing';

import { LoginStaffService } from './login-staff.service';

describe('LoginStaffService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: LoginStaffService = TestBed.get(LoginStaffService);
    expect(service).toBeTruthy();
  });
});
