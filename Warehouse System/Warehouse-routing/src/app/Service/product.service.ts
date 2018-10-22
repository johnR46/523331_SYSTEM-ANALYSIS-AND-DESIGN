import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable()
export class ProductService {
  public API = '//localhost:8081';
 // public MAP = this.API +'/mapdata/'
  public SUBMIT = this.API+'/Bill_of_lading-insert/'
  bill_of_lading:any ={}
  constructor(private http  : HttpClient) { 

  }

  submitBillLading(BillId:String,product:object,typeproduct:object,user:object ):Observable<any>{
    console.log(product)
    console.log(typeproduct)
    console.log(user)
    return this.http.post(this.SUBMIT+BillId+'/Product/'+product + '/TypeProduct/' + typeproduct + '/User/' +user,{});
  }

  sumbbitproduct(billId:String , product:object):Observable<any>{
    
    return this.http.post(this.SUBMIT+billId+'/Product/'+product ,{});

  }

  getdata(bill,callback){
    this.http.get(this.API + '/Bill_of_lading-list').subscribe(data =>{
      this.bill_of_lading = data;
      return callback && callback();
    })

  }

}
