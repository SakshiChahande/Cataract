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

public class CB9 extends AppCompatActivity {
    ImageView imageView;
    EditText ET;
    Button button;
    int COUNT_CORRECT;
    String number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_b9);
        COUNT_CORRECT= (getIntent().getIntExtra("COUNT_CORRECT",COUNT_CORRECT));
        imageView=findViewById(R.id.imageView9);
        ET=findViewById(R.id.text9);
        button=findViewById(R.id.next9);
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
                number=ET.getText().toString().trim();
                if(number.equals("74")){
                    COUNT_CORRECT=COUNT_CORRECT+1;
                }
                Log.e("COUNT9", String.valueOf(COUNT_CORRECT));
                Intent intent = new Intent(CB9.this,CB10.class);
                intent.putExtra("COUNT_CORRECT",COUNT_CORRECT);
                startActivity(intent);
            }
        });
    }
}