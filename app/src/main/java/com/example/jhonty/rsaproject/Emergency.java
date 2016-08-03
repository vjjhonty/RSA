package com.example.jhonty.rsaproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Emergency extends AppCompatActivity {
    Button save,cop,fire,med;
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);
        e1=(EditText) findViewById(R.id.phone);
        save=(Button)findViewById(R.id.save);
        cop=(Button)findViewById(R.id.callCop);
        fire=(Button)findViewById(R.id.callFire);
        med=(Button)findViewById(R.id.callMed);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                sendSMS();
            }
        });

        cop.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                call();
                Toast.makeText(getApplicationContext(),"Dialing 100 ...",Toast.LENGTH_SHORT).show();
            }
        });
        fire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Dialing 101 ...",Toast.LENGTH_SHORT).show();
            }
        });
        med.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Dialing 102 ...",Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void call() {
        Intent in=new Intent(Intent.ACTION_CALL,Uri.parse("9000000000"));
        try
        {
            startActivity(in);
        }
        catch (android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(),"yourActivity is not founded",Toast.LENGTH_SHORT).show();
        }
    }

    protected void sendSMS()
    {
        Log.i("Send SMS","");
        String ph=e1.getText().toString();
        try
        {
            SmsManager smsMan= SmsManager.getDefault();
            smsMan.sendTextMessage(ph,null,"Your Contact Has been saved as an Emergency Contact",null,null);
            Toast.makeText(getApplicationContext(),"Contact Saved & SMS Send",Toast.LENGTH_SHORT).show();
        }
        catch(Exception e)
        {
            Toast.makeText(getApplicationContext(), "SMS Failed,please try again", Toast.LENGTH_LONG).show();
        }
    }
}
