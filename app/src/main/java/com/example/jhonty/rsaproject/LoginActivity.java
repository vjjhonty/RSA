package com.example.jhonty.rsaproject;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText t1,t2;
    Button bs,br,bg;
    SQLiteDatabase db;
    String mobile,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        t1=(EditText)findViewById(R.id.phone);
        t2=(EditText)findViewById(R.id.password);
        bs=(Button)findViewById(R.id.sign);
        bg=(Button)findViewById(R.id.guest);
        br=(Button)findViewById(R.id.reg);

        Database d1 = new Database(getApplicationContext(),"Vivek", null, 3);
        db = d1.getWritableDatabase();
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                mobile = t1.getText().toString();
                password = t2.getText().toString();
                if (mobile.equals("") || password.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Fill All Blanks", Toast.LENGTH_LONG).show();
                } else
                {

                    Cursor c = db.rawQuery("select Phone,Password from reg where Phone='" + mobile + "'", null);

                    if (c.moveToNext())
                    {
                        String s2 = c.getString(0);
                        String s3 = c.getString(1);
                        if (password.equals(s3))
                        {
                            Toast.makeText(getApplicationContext(), "Successfully Login!", Toast.LENGTH_LONG).show();
                            Intent i = new Intent(getApplicationContext(),DashBoardActivity.class);
                            startActivity(i);
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(), "Wrong Password!", Toast.LENGTH_LONG).show();
                        }
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), " Not Registered!", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
        bg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplication(),DashBoardActivity.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Welcome Guest",Toast.LENGTH_SHORT).show();
            }
        });


        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplication(),RegisterActivity.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Sign Up",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
