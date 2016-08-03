package com.example.jhonty.rsaproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class More extends AppCompatActivity {
    Button bPro,bR,bCs,bLa,bA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        bPro=(Button)findViewById(R.id.b1);
        bR=(Button)findViewById(R.id.b2);
        bCs=(Button)findViewById(R.id.b3);
        bLa=(Button)findViewById(R.id.b4);
        bA=(Button)findViewById(R.id.b5);
        bPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Profile.class);
                startActivity(i);
            }
        });

        bR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),RoadAsst.class);
                startActivity(i);
            }
        });

        bCs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),RaCustomerServ.class);
                startActivity(i);
            }
        });

        bLa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),LicenseAgreement.class);
                startActivity(i);
            }
        });

        bA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),RsaAbout.class);
                startActivity(i);
            }
        });
    }
}
