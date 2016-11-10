package com.wg.databingdemo.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;

/**
 * @author: Wangg
 * @Name：A
 * @Description:
 * @Created on:2016/11/10  15:51.
 */

public class A {

    private String Type;

    private B b;

    public A() {
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public static class B extends BaseObservable {

        private String firstName;

        private String lastName;

        public B(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public B() {
        }

        @Bindable
        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
            notifyPropertyChanged(BR.firstName);
        }

        @Bindable
        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
            notifyPropertyChanged(BR.lastName);
        }
    }

}
