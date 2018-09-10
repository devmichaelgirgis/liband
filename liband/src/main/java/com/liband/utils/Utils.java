package com.liband.utils;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.liband.App;

import java.util.Objects;

public class Utils {

    /**
     * Converting dp to pixel
     */
    public static int dpToPx(int dp) {
        Resources r = App.getApp().getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }

    public static void reflectVisibilityOfView(View view) {
        view.setVisibility(view.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
    }

    public static String getDeviceName() {
        String manufacturer = Build.MANUFACTURER;
        String model = Build.MODEL;
        if (model.startsWith(manufacturer)) {
            return model.toUpperCase();
        } else {
            return manufacturer.toUpperCase() + " " + model;
        }
    }

    public void hideSoftKeyboard(Context mActivity) {
        if (mActivity != null && !((AppCompatActivity) mActivity).isFinishing()) {
            final InputMethodManager inputMethodManager = (InputMethodManager) mActivity.getSystemService(AppCompatActivity.INPUT_METHOD_SERVICE);
            if (Objects.requireNonNull(inputMethodManager).isActive()) {
                if (((AppCompatActivity) mActivity).getCurrentFocus() != null) {
                    inputMethodManager.hideSoftInputFromWindow(Objects.requireNonNull(((AppCompatActivity) mActivity).getCurrentFocus()).getWindowToken(), 0);
                }
            }
        }
    }

}
