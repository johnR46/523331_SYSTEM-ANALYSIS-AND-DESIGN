import { TestBed } from '@angular/core/testing';

import { AddDeliveryService } from './add-delivery.service';

describe('AddDeliveryService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AddDeliveryService = TestBed.get(AddDeliveryService);
    expect(service).toBeTruthy();
  });
});
