import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { BillWarehouseComponent } from '../bill-warehouse/bill-warehouse.component';
import { ProductWarehouseComponent } from '../product-warehouse/product-warehouse.component';
import { SelectWarehouseComponent } from '../select-warehouse/select-warehouse.component';

import { LoginUserComponent } from '../loginuser/loginuser.component';
import { DeliveryComponent } from '../delivery/delivery.component';
import { HomeComponent } from '../home/home.component';
import { DeliveryListComponent } from '../delivery-list/delivery-list.component';
import { StaffLoginComponent } from '../staff-login/staff-login.component';

import { RegisterComponent } from '../register/register.component';
import { RegisterShowComponent } from '../register-show/register-show.component';
import { StaffDeliveryLoginComponent } from '../staffDelivery-login/staffDelivery-login.component';
import { from } from 'rxjs';

const routes: Routes = [
  //JOHN
  { path: 'product', component: ProductWarehouseComponent },
  { path: 'select', component: SelectWarehouseComponent },
  { path: 'bill', component: BillWarehouseComponent },

  //PECK
  { path: 'staffDeliveryLogin', component: StaffDeliveryLoginComponent },
  { path: 'select', component: SelectWarehouseComponent },
  { path: 'home', component: HomeComponent },
  { path: 'delivery-list', component: DeliveryListComponent },
  { path: 'delivery', component: DeliveryComponent },
  { path: '', component: LoginUserComponent },
  { path: 'stafflogin', component: StaffLoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'register-show', component: RegisterShowComponent },
];

@NgModule({
  exports: [RouterModule],
  imports: [RouterModule.forRoot(routes)]
})
export class RoutingMainModule { }