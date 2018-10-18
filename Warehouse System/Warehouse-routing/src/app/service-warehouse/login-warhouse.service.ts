import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

export class LoginWarhouseService {
  public API = '//localhost:8080';
  authenticated = false;
  user : any;
  public name: any =''
  public auth : boolean
  constructor(private http: HttpClient) {
    //   this.auth = false
  }
  authenticate(credentials, callback){
    // /member-list/{username}/pass/{pass}
      this.http.post(this.API+'//User-list/'+credentials.username+'/pass/'+credentials.password,{}).subscribe(data=>{
          if(data['success']){
              this.authenticated = true
              this.user = data['username']
              this.name = data['username'].name
            //   console.log(this.name)
            //   console.log(data['member'])
            //   this.setUser(data['member'])
          }else{
              this.authenticated = false
          }
          return callback && callback();
      })
     
       
    }
    getUser():any{
     return this.user;
    }
    setUser(user:any){
        this.user = user;
    }
    setAuth(auth : boolean){
        this.auth = auth
    }
    getAuth(): boolean{
       return this.auth
    }
  

}
