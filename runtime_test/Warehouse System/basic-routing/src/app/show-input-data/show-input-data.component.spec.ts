import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowInputDataComponent } from './show-input-data.component';

describe('ShowInputDataComponent', () => {
  let component: ShowInputDataComponent;
  let fixture: ComponentFixture<ShowInputDataComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ShowInputDataComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowInputDataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
