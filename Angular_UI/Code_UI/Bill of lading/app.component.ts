import { Component} from '@angular/core';
import {SelectionModel} from '@angular/cdk/collections';
import {FlatTreeControl} from '@angular/cdk/tree';

import {MatTreeFlatDataSource, MatTreeFlattener} from '@angular/material/tree';
import {BehaviorSubject} from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'export,import';
  displayedColumns: string[] = ['position', 'name', 'weight', 'symbol','type'];
  dataSource = ELEMENT_DATA;
}


export interface PeriodicElement {
  name: string;
  position: number;
  weight: number;
  symbol: string;
  type: string;
}

const ELEMENT_DATA: PeriodicElement[] = [
  {position: 1, name: 'Hydrogen', weight: 1.0079, symbol: 'H',type:'export'},
  {position: 2, name: 'Helium', weight: 4.0026, symbol: 'He',type:'export'},
  {position: 3, name: 'Lithium', weight: 6.941, symbol: 'Li',type:'export'},
  {position: 4, name: 'Beryllium', weight: 9.0122, symbol: 'Be',type:'export'},
  {position: 5, name: 'Boron', weight: 10.811, symbol: 'B',type:'export'},
  {position: 6, name: 'Carbon', weight: 12.0107, symbol: 'C',type:'export'},
  {position: 7, name: 'Nitrogen', weight: 14.0067, symbol: 'N',type:'export'},
  {position: 8, name: 'Oxygen', weight: 15.9994, symbol: 'O',type:'export'},
  {position: 9, name: 'Fluorine', weight: 18.9984, symbol: 'F',type:'export'},
  {position: 10, name: 'Neon', weight: 20.1797, symbol: 'Ne',type:'export'},
];



