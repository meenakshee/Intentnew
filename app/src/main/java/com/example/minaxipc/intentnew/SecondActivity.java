package com.example.minaxipc.intentnew;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    EditText met1,met2,met3;
    Button Login;
    Context context;
    UserDbHelper userDbHelper;
    SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        met1=(EditText)findViewById(R.id.et1);
        met2=(EditText)findViewById(R.id.et2);
        met3=(EditText)findViewById(R.id.et3);
        Login=(Button)findViewById(R.id.btn2);
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

    public  void addContact(View view){
        String name= met1.getText().toString();
        String mob= met2.getText().toString();
        String email= met3.getText().toString();
        userDbHelper=new UserDbHelper(context);
        sqLiteDatabase=userDbHelper.getWritableDatabase();
        userDbHelper.addInformation(name,mob,email,sqLiteDatabase);
        Toast.makeText(getBaseContext(),"Data inserted",Toast.LENGTH_LONG).show();
        userDbHelper.close();
    }


}