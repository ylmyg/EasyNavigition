package com.next.easynavigitiondemo.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.next.easynavigition.view.EasyNavigitionBar;
import com.next.easynavigitiondemo.R;
import com.next.easynavigitiondemo.ui.normal.AFragment;
import com.next.easynavigitiondemo.ui.normal.BFragment;
import com.next.easynavigitiondemo.ui.normal.CFragment;
import com.next.easynavigitiondemo.ui.normal.DFragment;

import java.util.ArrayList;
import java.util.List;

public class NormalActivity extends AppCompatActivity {

    private EasyNavigitionBar navigitionBar;

    private String[] tabText = {"首页", "发现", "消息", "我的"};
    //未选中icon
    private int[] normalIcon = {R.mipmap.index, R.mipmap.find, R.mipmap.message, R.mipmap.me};
    //选中时icon
    private int[] selectIcon = {R.mipmap.index1, R.mipmap.find1, R.mipmap.message1, R.mipmap.me1};

    private List<android.support.v4.app.Fragment> fragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noadd);

        navigitionBar = findViewById(R.id.navigitionBar);

        fragments.add(new AFragment());
        fragments.add(new BFragment());
        fragments.add(new CFragment());
        fragments.add(new DFragment());

        navigitionBar.titleItems(tabText)
                .normalIconItems(normalIcon)
                .selectIconItems(selectIcon)
                .fragmentList(fragments)
                .fragmentManager(getSupportFragmentManager())
                .canScroll(true)
                .build();
    }

    public EasyNavigitionBar getNavigitionBar() {
        return navigitionBar;
    }

}
