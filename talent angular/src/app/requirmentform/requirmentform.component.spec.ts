import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RequirmentformComponent } from './requirmentform.component';

describe('RequirmentformComponent', () => {
  let component: RequirmentformComponent;
  let fixture: ComponentFixture<RequirmentformComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RequirmentformComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RequirmentformComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
