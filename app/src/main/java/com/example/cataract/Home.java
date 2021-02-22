package com.example.cataract;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
Button im,cb,ast,cat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        im=findViewById(R.id.CaptureImage);
        cb=findViewById(R.id.ColourBlindness);
        ast=findViewById(R.id.Astigmatism);
        cat=findViewById(R.id.DetectCataract);

        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Home.this,CaptureImage.class);
                startActivity(intent);
            }
        });

        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Home.this,ColourBlindness.class);
                startActivity(intent);
            }
        });

        ast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent=new Intent(Home.this,Astigmatism.class);
                //startActivity(intent);
            }
        });
        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent=new Intent(Home.this,CataractDetection.class);
                //startActivity(intent);
            }
        });
    }
}