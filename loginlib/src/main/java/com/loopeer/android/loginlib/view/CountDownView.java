package com.loopeer.android.loginlib.view;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.loopeer.android.loginlib.utils.LoginLoader;
import com.loopeer.android.loginlib.utils.Myutils;
import com.loopeer.android.loginlib.utils.ToastUtils;
import com.loopeer.android.loginlib.utils.VerifyUserLogImpl;

public class CountDownView extends android.support.v7.widget.AppCompatButton implements View.OnClickListener {

    private MyCountTimer mMyCountTimer;
    private static int DEFAULT_COUNT_DOWN_TIME = 60;

    public CountDownView(Context context) {
        this(context, null);
    }

    public CountDownView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CountDownView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setOnClickListener(this);
    }

    private String mUser;

    public void setUserEdit(EditText edUser) {
        edUser.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                mUser = s.toString();
            }
        });
    }

    public static void setCountDownTime(int defaultCountDownTime) {
        DEFAULT_COUNT_DOWN_TIME = defaultCountDownTime;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }


    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (mMyCountTimer != null) {
            mMyCountTimer.cancel();
        }
    }

    @Override
    public void onClick(View v) {
        if (!checkUser()) return;
        if (mMyCountTimer == null) {
            mMyCountTimer = new MyCountTimer(DEFAULT_COUNT_DOWN_TIME * 1000, 1000);
        }
        mMyCountTimer.start();
        onPre();
    }

    /**
     * 校验机制 用户不用判断手机号码是否符合要求 内部执行处理
     *
     * @return
     */
    public boolean checkUser() {
        if (TextUtils.isEmpty(mUser)) {
            ToastUtils.show(getContext(), "手机号码不能为空");
            return false;
        }

        if (Myutils.isPhoneNumber(mUser)) {
            return true;
        } else {
            ToastUtils.show(getContext(), "手机号码格式不正确！");
            return false;
        }
    }

    class MyCountTimer extends CountDownTimer {

        public MyCountTimer(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long s) {
            setText(s / 1000 + "秒重新发送");
        }

        @Override
        public void onFinish() {
            setText("重新发送");
            CountDownView.this.onComplete(mUser);
        }
    }

    private LoginLoader.CaptchaListener mCaptchaListener;

    public void setCaptchaListener(LoginLoader.CaptchaListener captchaListener) {
        mCaptchaListener = captchaListener;
    }

    public void onPre() {
        if (mCaptchaListener != null) {
            mCaptchaListener.onPre();
            setEnabled(false);
        }
    }

    public void onComplete(String user) {
        if (mCaptchaListener != null) {
            mCaptchaListener.onComplete(user);
            setEnabled(true);
        }
    }
}
