package com.example.jhonty.rsaproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ServiceCenters extends AppCompatActivity {
Button near,code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_centers);
        near=(Button)findViewById(R.id.b1);
        code=(Button)findViewById(R.id.b2);
        near.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplication(),MapsActivity.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Sign Up",Toast.LENGTH_SHORT).show();
            }
        });
        code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplication(),MapsActivity.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Sign Up",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
