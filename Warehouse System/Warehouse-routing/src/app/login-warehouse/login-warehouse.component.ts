import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login-warehouse',
  templateUrl: './login-warehouse.component.html',
  styleUrls: ['./login-warehouse.component.css'],
 

})
export class LoginWarehouseComponent implements OnInit {
  data:any={}
 
  constructor() { }

  ngOnInit() {
  }
   SubmitdData(){
    console.log(this.data)
  }

}


