package com.example.jhonty.rsaproject;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.but);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                Intent i = new Intent(getApplication(),LoginActivity.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Welcome!!",Toast.LENGTH_SHORT).show();
            }
        });

        img=(ImageView)findViewById(R.id.img1);
        android.view.animation.Animation a1= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        img.setAnimation(a1);

        Handler hd = new Handler();
        hd.postDelayed
                (new Runnable() {

                    public void run() {

                        Intent i = new Intent(getApplicationContext(),LoginActivity.class);
                        startActivity(i);

                    }
                }, 4000);
    }
}
