import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-select-warehouse',
  templateUrl: './select-warehouse.component.html',
  styleUrls: ['./select-warehouse.component.css']
})
export class SelectWarehouseComponent implements OnInit {
  data:any={}


  ngOnInit() {
  }
  constructor(private router:Router) { }
 
  Bill(){
    console.log(this.data)
    this.router.navigate(['bill'])
  }

  Saveproduct(){
    console.log(this.data)
    this.router.navigate(['product'])
  }
  logout(){
    console.log(this.data)
    this.router.navigate([''])
  }
  

}
