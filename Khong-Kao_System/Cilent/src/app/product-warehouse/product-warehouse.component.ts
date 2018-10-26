import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProductService } from '../Service/product.service';
import { ActivatedRoute, RouterLink } from "@angular/router";
@Component({
  selector: 'app-product-warehouse',
  templateUrl: './product-warehouse.component.html',
  styleUrls: ['./product-warehouse.component.css']
})
export class ProductWarehouseComponent implements OnInit {
  step = 0;
  data: any = {}
  idlast: any;
  staffId:any;
  staff : any = {}


  product = { productId: '', name: '', price: '', Qty: '' , itemdescripton:''}
  typeproduct = { typeId: '', nametype: '' }
  Users = { userId: '', username: '', password: '' }
  user: any = {}

  date = { date: '' }
  bill_of_lading: any = {};

  setStep(index: number) {
    this.step = index;
  }
  nextStep() {
    this.step++;
  }

  prevStep() {
    this.step--;
  }

  constructor(private router: Router, private route: ActivatedRoute, private app: ProductService) { }


  SubmitDB() {
    this.product = { productId: this.idlast, name: this.data.name, price: this.data.price, Qty: this.data.Qty , itemdescripton: this.data.itemdescripton}
    this.typeproduct = { typeId: this.idlast, nametype: this.data.typeProduct }
    this.Users = { userId: this.idlast, username: this.user.name, password: this.user.pass }
  //  console.log('price')
    //console.log(this.product.price);
    this.app.sumbitproduct(Number(this.product.productId),this.product.name,Number(this.product.price),Number(this.product.Qty),String(this.data.itemdescripton)).subscribe(data=>{
    console.log(data);
    if(data.status == "save"){
      alert('save product ok')
    } else{
      alert('save product faild')
    }
    })

  this.app.sumbittyproduct(Number(this.typeproduct.typeId),this.typeproduct.nametype).subscribe(data=>{
      console.log(data);
      if(data.status == "save"){
        alert('save typeproduct ok')
      } else{
        alert('save typeproduct faild')
      }
    })




   
  this.app.submitBillLading(this.idlast,this.staffId).subscribe(data => {
    if(data.status == "save"){
      alert('save Bill of lading  ok')
    } else{
      alert('save bill of lading faild')
    }


    })


  }
  gotobill(){

    this.router.navigate(['bill'],{})
  }

  showDB() {
    //console.log(this.data.name)
    this.product = { productId: this.idlast, name: this.data.name, price: this.data.price, Qty: this.data.Qty , itemdescripton: this.data.itemdescripton}
    console.log(this.product);
    this.typeproduct = { typeId: this.idlast, nametype: this.data.typeProduct }
    console.log(this.typeproduct);
    this.Users = { userId: this.idlast, username: this.user.name, password: this.user.pass }
    console.log(this.user);


  }

  ngOnInit() {
    this.route.params.subscribe(prams => {
      //this.user = prams
      this.user = prams;
       console.log(this.user)
    })

    this.app.getdata(this.bill_of_lading, () => {
      this.bill_of_lading = this.app.bill_of_lading;
      // console.log(this.bill_of_lading.length)
      this.idlast = this.bill_of_lading.length + 1;
    })

    this.app.getuser(this.staff, () => {
      this.staff = this.app.userID;
     
      this.staffId = this.app.userID.length;
      console.log( this.staffId)
    })





  }
  

}
