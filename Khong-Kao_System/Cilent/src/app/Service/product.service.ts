import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable()
export class ProductService {
  public API = '//localhost:8080';
  public Bill_path = this.API + '/Bill_of_lading-insert/'
  public Item_path = this.API + '/Item-insert/'
  public TypeItem_path = this.API + '/TypeItem-insert/'
  public Staff_path = this.API + '/Staffs-insert/'
  
userID :any = {}
  bill_of_lading: any = {}

  constructor(private http: HttpClient) {

  }

  submitBillLading(billId: number,staffId:number): Observable<any> {
    

    return this.http.post(this.Bill_path + billId + '/staffId/' + staffId , {});


  } 

  sumbitproduct(productId: number, nameproduct: string, price: number, qty: number,itemdescripton:String): Observable<any> {
    console.log('price = ')
    console.log(price)
    console.log(this.Item_path + productId + '/name/' + nameproduct + '/price/' + price + '/qty/' + qty + '/itemdescripton/') 
    return this.http.post(this.Item_path + productId + '/name/' + nameproduct + '/price/' + price + '/qty/' + qty +'/itemdescripton/' + itemdescripton, {});
  }

  sumbittyproduct(typeproductId: number, nametype: string): Observable<any> {
    console.log('nametype = ')
    console.log(nametype)
    console.log(this.TypeItem_path + typeproductId + '/nametype/' + nametype)
    return this.http.post(this.TypeItem_path + typeproductId + '/nametype/' + nametype, {});
  }

  sumbittuser(userId: number, username: string, password: string): Observable<any> {
    console.log('user = ')
    console.log(username)
    console.log('pass = ')
    console.log(password)
    return this.http.post(this.Staff_path + userId + '/username/' + username +'/password/' + password,{});
  
  }
  getdata(bill, callback) {
    this.http.get(this.API + '/Bill_of_lading-list').subscribe(data => {
      this.bill_of_lading = data;
      return callback && callback();
    })

  }


  getuser(user, callback) {
    this.http.get(this.API + '/Staffs-list').subscribe(data => {
      this.userID = data;
      return callback && callback();
    })

  }

}
