import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';

import {BillWarehouseComponent} from '../bill-warehouse/bill-warehouse.component';
import { LoginWarehouseComponent } from '../login-warehouse/login-warehouse.component';
import  { ProductWarehouseComponent } from '../product-warehouse/product-warehouse.component';
import  { SelectWarehouseComponent } from '../select-warehouse/select-warehouse.component';


const routes: Routes = [
  {path:'',component:LoginWarehouseComponent},
  {path:'product',component:ProductWarehouseComponent},
  {path:'select',component:SelectWarehouseComponent},
  {path:'bill',component:BillWarehouseComponent}
  

  
];
@NgModule({
  exports: [ RouterModule ],
  imports: [ RouterModule.forRoot(routes) ]
})
export class RoutingMainModule { }