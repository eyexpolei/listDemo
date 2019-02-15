package com.demo.plugin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MyPlugin extends CordovaPlugin {


    CallbackContext callBack;

    public void goToActivity() {
//        Toast.makeText(this.cordova.getContext(), "dfafdafa", Toast.LENGTH_SHORT).show();
        this.cordova.startActivityForResult(this,new Intent(this.cordova.getActivity(), NativeActivity.class), 1);


    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("toNative")) {
            Toast.makeText(this.cordova.getContext(),args.optString(0), Toast.LENGTH_SHORT).show();
            goToActivity();
//            callbackContext.success();
            callBack=callbackContext;
            return true;

        } else {
            callbackContext.error("error");
            return false;
        }

    }

    @Override
    public boolean execute(String action, CordovaArgs args, CallbackContext callbackContext) throws JSONException {
        return super.execute(action, args, callbackContext);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == 1) {
                callBack.success(intent.getStringExtra("data"));

            }
        }
    }

    @Override
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override
    public void onRestoreStateForActivityResult(Bundle state, CallbackContext callbackContext) {
        super.onRestoreStateForActivityResult(state, callbackContext);
    }
}
