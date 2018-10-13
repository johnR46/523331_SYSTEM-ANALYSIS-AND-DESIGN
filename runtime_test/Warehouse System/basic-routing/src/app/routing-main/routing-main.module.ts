import { NgModule} from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import {InputInsertComponent} from '../input-insert/input-insert.component'
import {ShowInputDataComponent} from '../show-input-data/show-input-data.component'
const routes: Routes = [
   {path:'',component:InputInsertComponent},
   {path:'show',component:ShowInputDataComponent}
];
@NgModule({
  exports: [ RouterModule ],
  imports: [ RouterModule.forRoot(routes) ]
})
export class RoutingMainModule { }