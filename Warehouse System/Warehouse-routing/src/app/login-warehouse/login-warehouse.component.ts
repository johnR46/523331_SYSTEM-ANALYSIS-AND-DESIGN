import { Component, OnInit } from '@angular/core';
import { LoginWarhouseService } from '../service-warehouse/login-warhouse.service';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login-warehouse',
  templateUrl: './login-warehouse.component.html',
  styleUrls: ['./login-warehouse.component.css'],
 

})
export class LoginWarehouseComponent implements OnInit {
  credentials = {username: '', password: ''};
  constructor(private app: LoginWarhouseService, private http: HttpClient, private router: Router,public data) {
  }

  ngOnInit() {
  }

  LoginSubmit(){
    this.app.authenticate(this.credentials,()=>{
      if(this.app.authenticated){
       this.router.navigate(['select']);
      }else{
        console.log(this.data);
       //  
      }
     //  console.log(this.app.authenticated)
     // this.router.navigate(['home']);
    })
   
}

}


