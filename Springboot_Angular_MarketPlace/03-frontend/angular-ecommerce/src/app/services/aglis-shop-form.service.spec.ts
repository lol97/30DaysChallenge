import { TestBed } from '@angular/core/testing';

import { AglisShopFormService } from './aglis-shop-form.service';

describe('AglisShopFormService', () => {
  let service: AglisShopFormService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AglisShopFormService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
