package com.wg.databingdemo.presenter;

import android.view.View;

import com.wg.databingdemo.IMainView;

/**
 * @author: Wangg
 * @Name：Presenter
 * @Description:
 * @Created on:2016/11/10  11:08.
 */

public class MainPresenter {
    private IMainView iMainView;

    public MainPresenter(IMainView iMainView) {
        this.iMainView = iMainView;
    }

    public void onChangeClick2(View view) {
        iMainView.onClickDemo2(view);
    }

    public void onChangeClick3(View view) {
        iMainView.onClickDemo3(view);
    }
}
