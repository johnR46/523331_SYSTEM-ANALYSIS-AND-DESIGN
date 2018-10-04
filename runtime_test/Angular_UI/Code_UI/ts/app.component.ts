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
  title = 'a,b,c,d,e';
  

}
export class SelectValueBindingExample {
  selected = '';
}
export class ButtonOverviewExample {}

export class CheckboxOverviewExample {
 
}