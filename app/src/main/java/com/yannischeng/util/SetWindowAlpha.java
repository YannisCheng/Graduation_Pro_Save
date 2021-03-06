package com.yannischeng.util;

import android.app.Activity;
import android.view.WindowManager;

/**
 * 设置背景透明度
 *
 * Created by 程文佳 on 2016/12/2.
 */

public class SetWindowAlpha {

    public static void setAlpha(float i, Activity activity) {
        WindowManager.LayoutParams layoutParams = activity.getWindow().getAttributes();
        layoutParams.alpha = i;
        activity.getWindow().setAttributes(layoutParams);
    }

}
