package com.example.base;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView mEnableDev;
    private Button devButton;
    private int count;
    private Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEnableDev=findViewById(R.id.imageView);
        devButton=findViewById(R.id.button);
        count=0;
        mEnableDev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count++;
                if(count>=10){
                    toast=Toast.makeText(MainActivity.this,"Enable Debug",Toast.LENGTH_SHORT);
                    int toastDuration=10000;
                    CountDownTimer toastCountdown;
                    toastCountdown=new CountDownTimer(toastDuration,1000) {
                        @Override
                        public void onTick(long l) {
                            toast.show();
                        }

                        @Override
                        public void onFinish() {
                            toast.cancel();
                            Intent intent=new Intent(MainActivity.this,PopUp.class);
                            startActivity(intent);

                        }
                    };
                    toast.show();
                    toastCountdown.start();
                    count=0;
                    devButton.setVisibility(View.VISIBLE);
                }
            }
        });
    }

}