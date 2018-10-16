import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-bill-warehouse',
  templateUrl: './bill-warehouse.component.html',
  styleUrls: ['./bill-warehouse.component.css']
})
export class BillWarehouseComponent implements OnInit {
  data:any={}
  constructor(private route:ActivatedRoute) { }

  ngOnInit() {
      this.route.params.subscribe(prams=>{
        this.data = prams
        console.log(prams)
      })
  }

  
  

}
