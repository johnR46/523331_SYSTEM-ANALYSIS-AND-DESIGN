import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product-warehouse',
  templateUrl: './product-warehouse.component.html',
  styleUrls: ['./product-warehouse.component.css']
})
export class ProductWarehouseComponent implements OnInit {
  step = 0;
  data:any ={}
 

  setStep(index: number) {
    this.step = index;
  }

  public AAA(){
  console.log(this.data)

  }
  nextStep() {
    this.step++;
  }

  prevStep() {
    this.step--;
  }

  constructor(private router:Router) { }

  SubmitdData(){
    console.log(this.data)
    const data  = this.data
    this.router.navigate(['bill',{name:data.name,price:data.price,typeProduct:data.typeProduct,Qty:data.Qty,date:data.date}])
  }


  ngOnInit() {
  }

}
