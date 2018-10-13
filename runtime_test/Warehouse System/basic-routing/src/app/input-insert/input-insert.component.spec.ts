import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InputInsertComponent } from './input-insert.component';

describe('InputInsertComponent', () => {
  let component: InputInsertComponent;
  let fixture: ComponentFixture<InputInsertComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InputInsertComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InputInsertComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
