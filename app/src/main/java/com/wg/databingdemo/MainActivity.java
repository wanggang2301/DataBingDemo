package com.wg.databingdemo;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.wg.databingdemo.databinding.ActivityMainBinding;
import com.wg.databingdemo.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements IMainView {


    private ActivityMainBinding binding;

    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        /**
         * 事件绑定
         */
        mainPresenter = new MainPresenter(this);
        binding.setMainPresenter(mainPresenter);

        /**
         * 变量绑定
         * 支持三目运算符
         */
        final Person person = new Person("赵六", "20", true);
        person.name.set("兵马俑");


        person.user.put("item1", "Google");
        person.user.put("item2", "baidu");
        person.user.put("item3", "tencent");
        person.user.put("item4", "ali");

        person.list.add("新闻");
        person.list.add("科技");
        person.list.add("教育");
        person.list.add("房产");


        //下面两句代码都可以完成绑定效果
        binding.setPerson(person);
        //binding.setVariable(BR.person, person);
        binding.btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                person.setDisplayName(null); //displayname为空时显示第二个name
                person.name.set("大雁塔");
                person.setMale(false);

                //使用Observable可以实现双向绑定，不需要代码去更新 ,下面可以不需要
                // binding.setPerson(person);
            }
        });
    }


    @Override
    public void onClickDemo2(View view) {
        Toast.makeText(getApplicationContext(), "onClickDemo2", Toast.LENGTH_SHORT).show();

        startActivity(new Intent(MainActivity.this, SencondActivity.class));
    }

    @Override
    public void onClickDemo3(View view) {
        Toast.makeText(getApplicationContext(), "onClickDemo3", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, ThirdActivity.class));
    }
}
