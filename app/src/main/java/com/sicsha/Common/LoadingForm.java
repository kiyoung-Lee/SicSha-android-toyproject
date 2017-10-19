package com.sicsha.Common;

import android.app.Activity;
import android.app.Application;
import android.app.ProgressDialog;
import android.content.Context;

import static android.support.v4.util.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by User on 2016-04-28.
 */
public class LoadingForm extends Application {

    private static ProgressDialog progressDialog;

    //Unit Test : getProgressDialog_NullTest();
    public static ProgressDialog getProgressDialog(Context context) {
        checkNotNull(context, "Context Is Null");
        progressDialog = new ProgressDialog(context);
        return progressDialog;
    }

    //Unit Test : LoadingForm_Show_NullTest();
    public static void show(Context context){
        checkNotNull(context, "Context Is Null");
        if(!((Activity)context).isFinishing()) {
            progressDialog = new ProgressDialog(context);
            progressDialog.setMessage("잠시만 기다려주세요");
            progressDialog.setIndeterminate(true);
            progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progressDialog.setCancelable(false);
            progressDialog.show();
        }
    }

    //Unit Test : LoadingForm_Dismiss_Test();
    public static void dismiss(){
        if(progressDialog != null) {
            if (progressDialog.isShowing())
                progressDialog.dismiss();
        }
    }
}
