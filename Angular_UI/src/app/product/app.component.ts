import { Component} from '@angular/core';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],


})
export class AppComponent {
  step = 0;
  name = "";
  price = '';
  Qty = '';
  Date = '';

  setStep(index: number) {
    this.step = index;
  }

  public AAA(){
alert(this.name);

  }
  nextStep() {
    this.step++;
  }

  prevStep() {
    this.step--;
  }

}






