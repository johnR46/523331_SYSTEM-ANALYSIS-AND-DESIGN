import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DeliveryService {

  public API = '//localhost:8080';
  deliveryData: any;
  constructor(private http: HttpClient) {
  }

  getdata(bill,id,callback){
    this.http.get(this.API + '/delivery/'+id).subscribe(data =>{
      this.deliveryData = data;
      return callback && callback();
    })

  }

  
}
