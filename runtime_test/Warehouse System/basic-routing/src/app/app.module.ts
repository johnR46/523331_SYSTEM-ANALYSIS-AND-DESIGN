import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { InputInsertComponent } from './input-insert/input-insert.component';
import { ShowInputDataComponent } from './show-input-data/show-input-data.component';

import { MatButtonModule, MatCardModule, MatInputModule, MatListModule, MatToolbarModule } from '@angular/material';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { RoutingMainModule } from "./routing-main/routing-main.module";



@NgModule({
  declarations: [
    AppComponent,
    InputInsertComponent,
    ShowInputDataComponent

  ],
  imports: [
  
    BrowserModule,
    RoutingMainModule,
    BrowserModule,
    FormsModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatCardModule,
    MatInputModule,
    MatListModule,
    MatToolbarModule,
  
  ],
  providers: [ ],
  
  bootstrap: [AppComponent]
})
export class AppModule { }

