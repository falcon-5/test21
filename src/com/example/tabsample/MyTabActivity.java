package com.example.tabsample;

import android.app.TabActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MyTabActivity extends TabActivity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //TabHostインスタンスを取得
        TabHost tabHost = getTabHost();

        //LayoutInflaterインスタンスを取得
        LayoutInflater inflater = getLayoutInflater();

        //tabHostを取得してsample1.xmlレイアウト読み込み
        inflater.inflate(R.layout.sample1, tabHost.getTabContentView(), true);

        //tabHostを親としてsample2.xmlレイアウトを読み込み
        inflater.inflate(R.layout.sample2, tabHost.getTabContentView(), true);

        //tabHostを親としてsample3.xmlレイアウトを読み込み
        inflater.inflate(R.layout.sample3, tabHost.getTabContentView(), true);

        //1つめのタブを生成
        TabSpec tab1 = tabHost.newTabSpec("tab1");

        //1つめのタブのラベルを設定
        tab1.setIndicator("tab1 Label");

        //選択時にはsample1.xmlにあるR.id.tab1の内容を表示
        tab1.setContent(R.id.tab1);

        //2つめのタブを生成
        TabSpec tab2 = tabHost.newTabSpec("tab2");

        //2つめのタブのラベルを設定
        tab2.setIndicator("tab2 Label");

        //選択時にはsample2.xmlにあるR.id.tab2の内容を表示
        tab2.setContent(R.id.tab2);

        //3つめのタブを生成
        TabSpec tab3 = tabHost.newTabSpec("tab3");

        //3つめのタブのラベルとアイコンを設定
        tab3.setIndicator("tab3 Label", getResources().getDrawable(R.drawable.icon));

        //選択時にはsample3.xmlにあるR.id.tab3の内容を表示
        tab3.setContent(R.id.tab3);

        //tabHostに生成したタブを追加
        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);
    }
}