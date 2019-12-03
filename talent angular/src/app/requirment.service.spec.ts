import { TestBed } from '@angular/core/testing';

import { RequirmentService } from './requirment.service';

describe('RequirmentService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: RequirmentService = TestBed.get(RequirmentService);
    expect(service).toBeTruthy();
  });
});
