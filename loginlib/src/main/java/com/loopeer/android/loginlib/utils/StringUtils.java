package com.loopeer.android.loginlib.utils;

import android.text.TextUtils;

/**
 * 策略模式，可以替换自己的判断方式，参考Retrofit setAdapter
 */
public class StringUtils {

    public final static boolean isValidEmail(CharSequence target) {
        if (TextUtils.isEmpty(target)) {
            return false;
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
        }
    }

    public static final boolean isValidPhoneNumber(CharSequence target) {
        if (TextUtils.isEmpty(target)) {
            return false;
        } else {
            return android.util.Patterns.PHONE.matcher(target).matches();
        }
    }

    public static final boolean isValidPassword(CharSequence target) {
        if (TextUtils.isEmpty(target)) {
            return false;
        } else {
            return target.length() >= 6;
        }
    }

    public static final boolean isValidCaptcha(CharSequence target) {
        return isValidPassword(target);
    }
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
