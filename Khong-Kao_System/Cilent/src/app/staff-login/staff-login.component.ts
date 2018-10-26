import { Component, OnInit } from '@angular/core';
import { LoginStaffService } from '../Service/login-staff.service';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-staff-login',
  templateUrl: './staff-login.component.html',
  styleUrls: ['./staff-login.component.css']
})
export class StaffLoginComponent implements OnInit {

  credentials = {username: '', password: ''};
  constructor(private app:LoginStaffService ,private router: Router, private http: HttpClient) {}


  ngOnInit() {
  }

  Autention(){
    console.log(this.credentials)

    if((this.credentials.username === "" || this.credentials.password ===  "" )){
      alert('enter  User or pass  ')
    }
     else {
      this.app.authenticate(this.credentials,()=>{
        if(this.app.authenticated){
       
         this.router.navigate(['select',this.credentials])
        }else{
        alert('No User ')
        }
      })
     
    }

    
  }

}
