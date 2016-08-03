package com.example.jhonty.rsaproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class DashBoardActivity extends AppCompatActivity {
    ImageButton bi1,bi2,bi3,bi4,bi5,bi6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        bi1=(ImageButton)findViewById(R.id.imgB1);
        bi2=(ImageButton)findViewById(R.id.imgB2);
        bi3=(ImageButton)findViewById(R.id.imgB3);
        bi4=(ImageButton)findViewById(R.id.imgB4);
        bi5=(ImageButton)findViewById(R.id.imgB5);
        bi6=(ImageButton)findViewById(R.id.imgB6);

        bi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                Intent i = new Intent(getApplication(),RequestAsst.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Ready To Help",Toast.LENGTH_SHORT).show();
            }
        });
        bi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplication(),Emergency.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Emergency",Toast.LENGTH_SHORT).show();
            }
        });
        bi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplication(),ServiceCenters.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Service Centers",Toast.LENGTH_SHORT).show();
            }
        });
        bi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplication(),Vehhicles.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Vehicles Details",Toast.LENGTH_SHORT).show();
            }
        });
        bi5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplication(),MapsActivity.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"My Location",Toast.LENGTH_SHORT).show();
            }
        });
        bi6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplication(),More.class);
                startActivity(i);
            }
        });
    }
}
