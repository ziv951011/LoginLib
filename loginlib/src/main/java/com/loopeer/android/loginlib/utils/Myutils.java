package com.loopeer.android.loginlib.utils;

import android.text.TextUtils;

public class Myutils {


    /**
     * 验证手机号格式
     *
     * @param str
     * @return
     */
    public static boolean isPhoneNumber(String str) {
        if (TextUtils.isEmpty(str))
            return false;
        String telRegex = "^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\\d{8}$";
        return str.matches(telRegex);
    }


}
