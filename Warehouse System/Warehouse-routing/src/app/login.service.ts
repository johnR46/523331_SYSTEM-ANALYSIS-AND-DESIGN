import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { LoginWarehouseComponent } from './login-warehouse/login-warehouse.component';
@Injectable({
  providedIn: 'root'
}),
const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};


export class LoginService {
  private Userurl = 'http://localhost:8081/User-list';
  constructor(private http: HttpClient)   { }
  getUser (): Observable<LoginWarehouseComponent[]> {
    return this.http.get<LoginWarehouseComponent[]>(this.Userurl)
  }
  
  
}
