package com.longjian.sendgift;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;

/**
 * Created by longjian on 2015/12/18.
 */
public abstract class BaseActivity extends Activity implements View.OnClickListener{
    public RelativeLayout rl_top_view;
    private RelativeLayout rl_center_view;
    private View topView;
    private View centerView;
    public abstract View getTopView();
    public abstract View getCenterView();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_layout);
        rl_top_view = (RelativeLayout) findViewById(R.id.ll_top_view);
        rl_center_view = (RelativeLayout) findViewById(R.id.ll_center_view);
        topView = getTopView();
        centerView = getCenterView();
        initView();
    }

    private void initView() {
        if(topView == null){
            rl_top_view.setVisibility(View.GONE);
        }else{
            rl_top_view.removeAllViews();
            rl_top_view.addView(topView);
        }
        if(centerView==null){
            rl_center_view.setVisibility(View.GONE);
        }else{
            rl_center_view.removeAllViews();
            rl_center_view.addView(centerView);
        }
    }
//    public void getTopView(){
//
//    }
//    public void getCenterView(){
//
//    }
}
