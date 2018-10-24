import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import {BillWarehouseComponent} from '../bill-warehouse/bill-warehouse.component';
import  { ProductWarehouseComponent } from '../product-warehouse/product-warehouse.component';
import  { SelectWarehouseComponent } from '../select-warehouse/select-warehouse.component';

import {LoginUserComponent} from '../loginuser/loginuser.component';
import {DeliveryComponent} from '../delivery/delivery.component';
import  { HomeComponent } from '../home/home.component';
import  { DeliveryListComponent } from '../delivery-list/delivery-list.component';

import { from } from 'rxjs';

const routes: Routes = [
  //JOHN
  {path:'product',component:ProductWarehouseComponent},
  {path:'select',component:SelectWarehouseComponent},
  {path:'bill',component:BillWarehouseComponent},
 
  //PECK

  {path:'select',component:SelectWarehouseComponent},
  {path:'home',component:HomeComponent},
  {path:'',component:DeliveryListComponent},
  {path:'delivery',component:DeliveryComponent},
 
  {path:'dddd',component:LoginUserComponent},
  
];

@NgModule({
  exports: [ RouterModule ],
  imports: [ RouterModule.forRoot(routes) ]
})
export class RoutingMainModule { }