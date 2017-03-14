package com.wg.databingdemo.adapter;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * @author: Wangg
 * @Name：Employee
 * @Description:
 * @Created on:2017/3/14  12:18.
 */

public class EmployeeAdpter extends RecyclerView.Adapter<EmployeeAdpter.BindingViewHolder> {

    private static final int ITEM_VIEW_TYPE_ON = 1;
    private static final int ITEM_VIEW_TYPE_OFF = 0;

    @Override
    public BindingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(BindingViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public static class BindingViewHolder<T extends ViewDataBinding> extends RecyclerView.ViewHolder {

        public T getmBinding() {
            return mBinding;
        }

        private T mBinding;

        public BindingViewHolder(T mBinding) {
            super(mBinding.getRoot());
            this.mBinding = mBinding;
        }
    }
}
