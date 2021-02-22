package com.example.cataract;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

        private static int SPLASH_SCREEN = 5000;
        Animation topAnim;
        ImageView imageView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
            setContentView(R.layout.activity_main);
            topAnim= AnimationUtils.loadAnimation(this,R.anim.top_animation);

            imageView=findViewById(R.id.image);
            imageView.setAnimation(topAnim);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(MainActivity.this,Home.class);
                    startActivity(intent);
                    finish();
                }
            },SPLASH_SCREEN);
        }
    }
