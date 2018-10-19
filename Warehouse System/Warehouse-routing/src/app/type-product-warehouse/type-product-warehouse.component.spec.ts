import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TypeProductWarehouseComponent } from './type-product-warehouse.component';

describe('TypeProductWarehouseComponent', () => {
  let component: TypeProductWarehouseComponent;
  let fixture: ComponentFixture<TypeProductWarehouseComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TypeProductWarehouseComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TypeProductWarehouseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
