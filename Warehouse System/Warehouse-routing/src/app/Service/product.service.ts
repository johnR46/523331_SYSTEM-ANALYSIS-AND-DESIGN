import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable()
export class ProductService {
  public API = '//localhost:8081';
  // public MAP = this.API +'/mapdata/'

  public Bill_path = this.API + '/Bill_of_lading-insert/'
  public product_path = this.API + '/Product-insert/'
  public typeproduct_path = this.API + '/TypeProduct-insert/'
  public user_path = this.API + '/User-insert/'

  bill_of_lading: any = {}

  constructor(private http: HttpClient) {

  }

  submitBillLading(billId: number): Observable<any> {
    

    return this.http.post(this.Bill_path + billId, {});


  }

  sumbitproduct(productId: number, nameproduct: string, price: number, qty: number): Observable<any> {
    console.log('price = ')
    console.log(price)
    console.log(this.product_path + productId + '/name/' + nameproduct + '/price/' + price + '/qty/' + qty)
    return this.http.post(this.product_path + productId + '/name/' + nameproduct + '/price/' + price + '/qty/' + qty, {});
  }

  sumbittyproduct(typeproductId: number, nametype: string): Observable<any> {
    console.log('nametype = ')
    console.log(nametype)
    console.log(this.typeproduct_path + typeproductId + '/nametype/' + nametype)
    return this.http.post(this.typeproduct_path + typeproductId + '/nametype/' + nametype, {});
  }
  sumbittuser(userId: number, username: string, password: string): Observable<any> {
    console.log('user = ')
    console.log(username)
    console.log('pass = ')
    console.log(password)
    return this.http.post(this.user_path + userId + '/username/' + username +'/password/' + password,{});
    

  }

  /*
  sumbituser(billId: String, product: object): Observable<any> {

    return this.http.post(this.SUBMIT + billId + '/Product/' + product, {});

  }
*/
  getdata(bill, callback) {
    this.http.get(this.API + '/Bill_of_lading-list').subscribe(data => {
      this.bill_of_lading = data;
      return callback && callback();
    })

  }

}
