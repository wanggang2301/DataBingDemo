package com.wg.databingdemo;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Toast;

import com.wg.databingdemo.databinding.ActivityThirdBinding;
import com.wg.databingdemo.iview.IThirdView;
import com.wg.databingdemo.presenter.ThirdPresenter;

public class ThirdActivity extends Activity implements IThirdView {

    ActivityThirdBinding mBingding;

    private ThirdPresenter thirdPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_third);

        mBingding = DataBindingUtil.setContentView(this, R.layout.activity_third);

        thirdPresenter = new ThirdPresenter(this);
        mBingding.setPresenter(thirdPresenter);
        mBingding.recyclerview.setLayoutManager(new LinearLayoutManager(this));


    }

    @Override
    public void itemAdd(View view) {
        Toast.makeText(getApplicationContext(), "增加", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void itemDelete(View view) {
        Toast.makeText(getApplicationContext(), "删除", Toast.LENGTH_SHORT).show();

    }
}
