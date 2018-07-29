package com.mirta.menuincolors;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.annotation.StringRes;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView text1;
    private ConstraintLayout mCl1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCl1 = (ConstraintLayout) findViewById(R.id.mCl1);
        text1 = (TextView) findViewById(R.id.text1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.black:
                mCl1.setBackgroundColor(ContextCompat.getColor(this,R.color.color_menu_black));
                text1.setText(R.string.menu_black);
                text1.setTextColor(ContextCompat.getColor(this,R.color.text_menu_black));
                return true;

            case R.id.white:
                mCl1.setBackgroundColor(ContextCompat.getColor(this,R.color.color_menu_white));
                text1.setText(R.string.menu_white);
                text1.setTextColor(ContextCompat.getColor(this,R.color.text_menu_white));
                return true;

            case R.id.green:
                mCl1.setBackgroundColor(ContextCompat.getColor(this,R.color.color_menu_green));
                text1.setText(R.string.menu_green);
                text1.setTextColor(ContextCompat.getColor(this,R.color.text_menu_green));
                return true;

            case R.id.blue:
                mCl1.setBackgroundColor(ContextCompat.getColor(this,R.color.color_menu_blue));
                text1.setText(R.string.menu_blue);
                text1.setTextColor(ContextCompat.getColor(this,R.color.text_menu_blue));
                return true;

            case R.id.red:
                mCl1.setBackgroundColor(ContextCompat.getColor(this,R.color.color_menu_red));
                text1.setText(R.string.menu_red);
                text1.setTextColor(ContextCompat.getColor(this,R.color.text_menu_red));
                return true;
        }

        return false;
    }


}
