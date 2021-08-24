package com.buzz_ht.splashactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edittext1,edittext2;
    private Button button;
    private TextView text,textcount;
    int count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        count=5;
        textcount.setText("Attempts remaining = " + count);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1= edittext1.getText().toString();
                String s2= edittext2.getText().toString();
                if(s1.equals("admin") && s2.equals("123")){


                    Intent i = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(i);

                }else{
                    count--;
                    textcount.setText("Attempts remaining " + count);
                    if(count==0){
                        button.setVisibility(View.GONE);
                    }
                }
            }
        });






    }

    private void init() {
        edittext1 = findViewById(R.id.edituser);
        edittext2= findViewById(R.id.editpass);
        button = findViewById(R.id.buttonlogin);
        text = findViewById(R.id.textdetails);
        textcount=findViewById(R.id.textcount);
    }
}