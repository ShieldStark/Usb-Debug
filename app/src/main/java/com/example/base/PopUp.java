package com.example.base;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PopUp extends AppCompatActivity {

    private EditText password;
    private Button ok;
    private Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up);
        password=findViewById(R.id.editTextTextPassword);
        ok=findViewById(R.id.button2);
        cancel=findViewById(R.id.button3);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(password.getText().toString().equals("password"))
                    Toast.makeText(PopUp.this,"password",Toast.LENGTH_SHORT).show();
                else{

                    Toast.makeText(PopUp.this,"Incorrect password",Toast.LENGTH_SHORT).show();
                }

            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(PopUp.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}