import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
@Injectable()

export class DeliveryListService {
  public API = '//localhost:8080';
  deliverylist: any;
  constructor(private http: HttpClient) {}

  getdata(deliverylist,id,callback){
    this.http.get(this.API + '/Delivery/'+id).subscribe(data =>{
      this.deliverylist = data;
      return callback && callback();
    })

  }

}
