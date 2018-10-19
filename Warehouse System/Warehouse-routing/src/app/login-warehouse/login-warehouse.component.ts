import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-login-warehouse',
  templateUrl: './login-warehouse.component.html',
  styleUrls: ['./login-warehouse.component.css'],
 

})

export class LoginWarehouseComponent implements OnInit {
  data:any={}
  id: number;
  username: string;
  password: string;
  constructor(private router:Router){}
  ngOnInit() {
  }

  LoginSubmit(){
    
   console.log(this.data)
    
      this.router.navigate(['select']);
   
   
}

}



 