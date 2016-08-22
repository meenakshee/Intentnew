package com.example.minaxipc.intentnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView mtv = (TextView) findViewById(R.id.tv1);
        TextView mtv1 = (TextView) findViewById(R.id.tv1);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String data = bundle.getString("data");
            int age= bundle.getInt("age",0);
            mtv.setText(data +"  Age is:  "+age);
        }
    }
}