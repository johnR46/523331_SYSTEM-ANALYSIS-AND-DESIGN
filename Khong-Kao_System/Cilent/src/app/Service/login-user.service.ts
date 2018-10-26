import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LoginUserService {
  public API = '//localhost:8080';
  authenticated = false;
  user : any;
  public name: any =''
  public auth : boolean
  constructor(private http: HttpClient) {

  }
  
  authenticate(credentials, callback){
    this.http.post(this.API+'/Customer/customeruserID/'+ credentials.username +'/customerPassword/' + credentials.password ,{}).subscribe(data=>{
        if(data['success']){
            this.authenticated = true
      
        }else{
            this.authenticated = false
        }
        return callback && callback();  
    })
  }
}
