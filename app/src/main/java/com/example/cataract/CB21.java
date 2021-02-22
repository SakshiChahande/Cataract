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
import android.widget.TextView;

public class CB21 extends AppCompatActivity {
    ImageView imageView;
    EditText ET;
    TextView tv;
    String result;
    Button button,back2home;
    int COUNT_CORRECT;
    String number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_b21);
        COUNT_CORRECT= (getIntent().getIntExtra("COUNT_CORRECT",COUNT_CORRECT));
        imageView=findViewById(R.id.imageView21);
        ET=findViewById(R.id.text21);
        button=findViewById(R.id.next21);
        tv=findViewById(R.id.result);
        back2home=findViewById(R.id.back2home);
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
                if(!number.equals("73")){
                    COUNT_CORRECT=COUNT_CORRECT+1;
                }

                if(COUNT_CORRECT>=17){
                    tv.setText("Normal Vision");
                }
                else if ((COUNT_CORRECT>=14) && (COUNT_CORRECT <=16)){
                    tv.setText("Please visit an ophthalmologist");
                }
                else if(COUNT_CORRECT<=13){
                    tv.setText("Colourblind");
                }
                Log.e("COUNT21", String.valueOf(COUNT_CORRECT));
            }
        });

        back2home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CB21.this,Home.class);
                startActivity(intent);
            }
        });
    }
}