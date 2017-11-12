package com.membattle.NewNavigation;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.graphics.Color;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.imangazaliev.circlemenu.CircleMenu;
import com.imangazaliev.circlemenu.CircleMenuButton;
import com.membattle.R;

public class MainActivity extends Activity {
    ModesFragment mModesFragment;
    CircleMenu circleMenu;
    static FragmentTransaction fTrans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mModesFragment = new ModesFragment();
        circleMenu = (CircleMenu) findViewById(R.id.circleMenu);
        circleMenu.setOnItemClickListener(new CircleMenu.OnItemClickListener() {
            @Override
            public void onItemClick(CircleMenuButton menuButton) {
                String hintText = menuButton.getHintText();
                fTrans = getFragmentManager().beginTransaction();
                switch (hintText) {
                    case "игра" :
                        fTrans.replace(R.id.main_cont, mModesFragment);
                }
                fTrans.commit();
            }
        });
        circleMenu.setStateUpdateListener(new CircleMenu.OnStateUpdateListener() {
            @Override
            public void onMenuExpanded() {

            }

            @Override
            public void onMenuCollapsed() {

            }
        });
    }
}