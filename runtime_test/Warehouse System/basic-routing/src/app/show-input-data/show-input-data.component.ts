import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from "@angular/router";
@Component({
  selector: 'app-show-input-data',
  templateUrl: './show-input-data.component.html',
  styleUrls: ['./show-input-data.component.css']
})
export class ShowInputDataComponent implements OnInit {
  data:any={}
  constructor(private route:ActivatedRoute) { }

  ngOnInit() {
      this.route.params.subscribe(prams=>{
        this.data = prams
        console.log(prams)
      })
  }

}