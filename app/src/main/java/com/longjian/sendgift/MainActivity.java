package com.longjian.sendgift;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * 试试提交
 */
public class MainActivity extends BaseActivity {
    private View view_home;
    private View view_two;
    private View view_three;
    private View view_four;
    private RelativeLayout rl_center_view;
    private LinearLayout ll_one;
    private LinearLayout ll_two;
    private LinearLayout ll_three;
    private LinearLayout ll_four;

    @Override
    public View getTopView() {
        View topView = getLayoutInflater().inflate(R.layout.base_title, null);
        initTopView(topView);
        return topView;
    }

    private void initTopView(View topView) {

    }

    @Override
    public View getCenterView() {
        View centerView = getLayoutInflater().inflate(R.layout.activity_home_center, null);
        initCenterView(centerView);
        return centerView;
    }

    private void initCenterView(View centerView) {
        rl_center_view = (RelativeLayout) centerView.findViewById(R.id.rl_center_view);
        ll_one = (LinearLayout) centerView.findViewById(R.id.ll_one);
        ll_two = (LinearLayout) centerView.findViewById(R.id.ll_two);
        ll_three = (LinearLayout) centerView.findViewById(R.id.ll_three);
        ll_four = (LinearLayout) centerView.findViewById(R.id.ll_four);
        view_home = getLayoutInflater().inflate(R.layout.view_home, null);
        view_two = getLayoutInflater().inflate(R.layout.view_two, null);
        view_three = getLayoutInflater().inflate(R.layout.view_three, null);
        view_four = getLayoutInflater().inflate(R.layout.view_four, null);
        setOnClick();
    }

    private void setOnClick() {
        ll_one.setOnClickListener(this);
        ll_two.setOnClickListener(this);
        ll_three.setOnClickListener(this);
        ll_four.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    switch (v.getId()){
        case R.id.ll_one:
            setChooseView(1);
            break;
        case R.id.ll_two:
            setChooseView(2);
            break;
        case R.id.ll_three:
            setChooseView(3);
            break;
        case R.id.ll_four:
            setChooseView(4);
            break;
    }

    }

    private void setChooseView(int type) {
        switch (type) {
            case 1:
            setCeneteView(view_home);
                break;
            case 2:
                setCeneteView(view_two);
                break;
            case 3:
                setCeneteView(view_three);
                break;
            case 4:
                setCeneteView(view_four);
                break;
        }
    }

    private void setCeneteView(View view) {
        if (rl_center_view != null && rl_center_view.getChildCount() > 0) {
            rl_center_view.removeAllViews();
        }
        rl_center_view.addView(view);
    }
}
