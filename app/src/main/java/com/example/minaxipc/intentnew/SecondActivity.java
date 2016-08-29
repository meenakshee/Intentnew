package com.example.minaxipc.intentnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button mbtn=(Button)findViewById(R.id.btn1);
        TextView mtv = (TextView) findViewById(R.id.tv1);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String data = bundle.getString("data");
            int age= bundle.getInt("age",0);
            mtv.setText(data +"  Age is:  "+age);
        }

    mbtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent();
            intent.putExtra("roll_no.",123);
            setResult(RESULT_OK,intent);
            finish();

        }
    });
    }

}