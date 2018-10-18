import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LoginWarehouseComponent } from './login-warehouse.component';

describe('LoginWarehouseComponent', () => {
  let component: LoginWarehouseComponent;
  let fixture: ComponentFixture<LoginWarehouseComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LoginWarehouseComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LoginWarehouseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
