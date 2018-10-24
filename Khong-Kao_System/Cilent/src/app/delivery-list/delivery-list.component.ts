import { Component, OnInit } from '@angular/core';
import { DeliveryService } from '../Service/delivery.service';

@Component({
  selector: 'app-delivery-list',
  templateUrl: './delivery-list.component.html',
  styleUrls: ['./delivery-list.component.css']
})
export class DeliveryListComponent implements OnInit {
  data: any = {}
  deliveryData = {deliveryId:'',deliveryDate:'',trackId:''}
  constructor(private app:DeliveryService) {

  }
  pushBillId() {
    if (this.data.id == undefined || this.data.id == null) {
      alert('Out of range')
    } else if (this.data.id != undefined && this.data.id != null) {
      this.app.getdata(this.deliveryData, this.data.id, () => {
        this.deliveryData = this.app.deliveryData
        console.log(this.deliveryData);
        if (this.deliveryData == null) {
          alert('Out of range')
        }
      })
    }
    console.log(this.data)

  }

  ngOnInit(){
   
   
  }
}
