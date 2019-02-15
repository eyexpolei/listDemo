import { Component } from '@angular/core';
import { isDefined } from '@angular/compiler/src/util';
import { callCordovaPlugin } from '@ionic-native/core/decorators/common';
import { from } from 'rxjs';



@Component({
  selector: 'app-tab2',
  templateUrl: 'tab2.page.html',
  styleUrls: ['tab2.page.scss']
})
export class Tab2Page {
  toNative(){
    cordova.exec(this.success,this.fail,"MyPlugin","toNative",["1234"])
  }

   success(str:String) {
     alert("receive data:"+str)
    
  }

   fail(params:String) {
    
  }
  getPicture(){
    // var cameraOptions= {
    //   quality : 75,
    //   destinationType : Camera.DestinationType.DATA_URL,
    //   sourceType : Camera.PictureSourceType.SAVEDPHOTOALBUM,    //相册类型
    //   allowEdit : true,
    //   encodingType : Camera.EncodingType.JPEG,
    //   targetWdith : 100,
    //   targetHeight : 100,}
      // navigator.camera.getPicture(this.onCameraSuccess,this.onCamerafail,null)

      alert(device.uuid+"")

  }

  onCameraSuccess(url){

  }
  onCamerafail(url){

  }

}
