import { TestBed } from '@angular/core/testing';

import { DeliveryListService } from './delivery-list.service';

describe('DeliveryListService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: DeliveryListService = TestBed.get(DeliveryListService);
    expect(service).toBeTruthy();
  });
});
