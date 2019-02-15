import { Component } from '@angular/core';
import {InfoPage} from'../info/info.page'
import { from } from 'rxjs';
import { NavController } from '@ionic/angular';

@Component({
  selector: 'app-tab3',
  templateUrl: 'tab3.page.html',
  styleUrls: ['tab3.page.scss']
})
export class Tab3Page {
  constructor(public navCtrl: NavController) {
  }
  toInfo(){
    this.navCtrl.navigateForward("info")
  }
}
