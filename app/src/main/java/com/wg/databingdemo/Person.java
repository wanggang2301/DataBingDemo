package com.wg.databingdemo;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableField;

/**
 * @author: Wangg
 * @Name：Person
 * @Description:
 * @Created on:2016/11/10  10:05.
 */

public class Person {

    private String displayName;


    //private String name;

    public final ObservableField<String> name = new ObservableField<>();  //使用Observable可以实现双向绑定，不需要代码去更新


    public ObservableArrayMap<String, Object> user = new ObservableArrayMap<>();

    public ObservableArrayList<Object> list = new ObservableArrayList<>();

    private String age;

    private boolean isMale;

    public Person(String displayName, String age, boolean isMale) {
        this.displayName = displayName;
        this.age = age;
        this.isMale = isMale;
    }


    public String getDisplayName() {

        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;

    }


    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }


    public void setAge(String age) {
        this.age = age;
    }


    public String getAge() {
        return age;
    }


}
