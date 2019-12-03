import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateRequirmentComponent } from './update-requirment.component';

describe('UpdateRequirmentComponent', () => {
  let component: UpdateRequirmentComponent;
  let fixture: ComponentFixture<UpdateRequirmentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdateRequirmentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateRequirmentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
