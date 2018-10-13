import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
@Component({
  selector: 'app-input-insert',
  templateUrl: './input-insert.component.html',
  styleUrls: ['./input-insert.component.css']
})
export class InputInsertComponent implements OnInit {
  //defind value assign from input
  data:any={}

  constructor(private router:Router) { }

  ngOnInit() {
  }
  //defind function
  SubmitdData(){
    console.log(this.data)
    const data  = this.data
    this.router.navigate(['show',{first:data.first,last:data.last}])
  }

}