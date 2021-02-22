package com.example.cataract;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class ColourBlindness extends AppCompatActivity {
ImageView imageView;
EditText ET1;
Button button;
int COUNT_CORRECT=0;
String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour_blindness);
        imageView=findViewById(R.id.imageView1);
        ET1=findViewById(R.id.text1);
        button=findViewById(R.id.next1);
        //num=Integer.parseInt(number);
        new CountDownTimer(10000,1000){

            @Override
            public void onTick(long l) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setEnabled(true);

            }

            @Override
            public void onFinish() {
                imageView.setVisibility(View.INVISIBLE);
                imageView.setEnabled(false);
            }
        }.start();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number=ET1.getText().toString().trim();
                if(number.equals("12")){
                    COUNT_CORRECT=COUNT_CORRECT+1;
                }
                Log.e("COUNT1", String.valueOf(COUNT_CORRECT));
                Intent intent = new Intent(ColourBlindness.this,CB2.class);
                intent.putExtra("COUNT_CORRECT",COUNT_CORRECT);
                startActivity(intent);
            }
        });


    }
}