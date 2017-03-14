package com.wg.databingdemo.presenter;

import android.view.View;

import com.wg.databingdemo.iview.IThirdView;

/**
 * @author: Wangg
 * @Name：ThirdPresenter
 * @Description:
 * @Created on:2017/3/14  11:52.
 */

public class ThirdPresenter {

    private IThirdView iThirdView;

    public ThirdPresenter(IThirdView iThirdView) {
        this.iThirdView = iThirdView;
    }

    public void onClickAdd(View view) {
        iThirdView.itemAdd(view);

    }


    public void onClickDelete(View view) {

        iThirdView.itemDelete(view);


    }
}
