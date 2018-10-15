import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { LoginWarehouseComponent } from './login-warehouse/login-warehouse.component';
import { SelectWarehouseComponent } from './select-warehouse/select-warehouse.component';
import { ProductWarehouseComponent } from './product-warehouse/product-warehouse.component';
import { BillWarehouseComponent } from './bill-warehouse/bill-warehouse.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginWarehouseComponent,
    SelectWarehouseComponent,
    ProductWarehouseComponent,
    BillWarehouseComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
