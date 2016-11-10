package com.wg.databingdemo;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.wg.databingdemo.databinding.ActivitySencondBinding;
import com.wg.databingdemo.model.A;

public class SencondActivity extends Activity {


    ActivitySencondBinding binding2;
    A a = new A();

    A.B b = new A.B();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding2 = DataBindingUtil.setContentView(this, R.layout.activity_sencond);


        b.setFirstName("军事");
        b.setLastName("房产");

        a.setB(b);


        binding2.setA(a);

        binding2.setPresenter(new Presenter());

    }


    public class Presenter {

        public void onclick4(View view) {

            b.setFirstName("娱乐");

        }
    }
}
