import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { AppserviceService } from '../service/appservice.service';
@Component({
  selector: 'app-login-warehouse',
  templateUrl: './login-warehouse.component.html',
  styleUrls: ['./login-warehouse.component.css'],


})

export class LoginWarehouseComponent implements OnInit {
  credentials = {username: '', password: ''};
  
   constructor(private app:AppserviceService ,private router: Router, private http: HttpClient) {}
  

  
  ngOnInit() {
}
  

LoginSubmit(){
  if(this.credentials.username === '' ||this.credentials.password ==='' ){
alert('please Enter usernaem or pass')
  }else{
    this.app.authenticate(this.credentials,()=>{
      if(this.app.authenticated){
       this.router.navigate(['select']);
      }else{
       //  alert('not user')
      alert('No User ')
      }
    })
  }
  
 
}


}



