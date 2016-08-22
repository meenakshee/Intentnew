package com.example.minaxipc.intentnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText metdata=(EditText)findViewById(R.id.editText);
        final EditText metdata1=(EditText)findViewById(R.id.editText1);
        Button mbtpass=(Button)findViewById(R.id.btnpass);
        mbtpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
                intent.putExtra("data",metdata.getText().toString());
                int age = Integer.parseInt(metdata1.getText().toString());
                intent.putExtra("age",age);
                startActivity(intent);
            }
        });
    }
}
