package com.example.minaxipc.intentnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    public static final int REQUEST_CODE_FUNCTION = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.tv1);
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
                startActivityForResult(intent,REQUEST_CODE_FUNCTION);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode==REQUEST_CODE_FUNCTION)
        {
            if (requestCode==RESULT_OK) {
                int roll_no = data.getIntExtra("roll no", -1);
                if (-1 == roll_no) {
                    textView.setText("My roll_no" + roll_no + ".");
                }
            }
        }
            super.onActivityResult(requestCode, resultCode, data);
    }
}


