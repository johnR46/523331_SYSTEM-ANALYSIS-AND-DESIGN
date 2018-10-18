import { TestBed, inject } from '@angular/core/testing';
import { LoginWarhouseService } from './login-warhouse.service';

describe('LoginWarhouseService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [LoginWarhouseService]
    });
  });

  it('should be created', inject([LoginWarhouseService], (service: LoginWarhouseService) => {
    expect(service).toBeTruthy();
  }));
});
