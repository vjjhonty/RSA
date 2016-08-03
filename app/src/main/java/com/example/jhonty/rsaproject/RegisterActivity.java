package com.example.jhonty.rsaproject;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5;
    Button b;

    String Name,Address,Email,Phone,Password;
    SQLiteDatabase sld;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        e1=(EditText)findViewById(R.id.name);
        e2=(EditText)findViewById(R.id.address);
        e3=(EditText)findViewById(R.id.email);
        e4=(EditText)findViewById(R.id.phone);
        e5=(EditText)findViewById(R.id.password);
        b=(Button)findViewById(R.id.signUp);

        Database d= new Database(getApplicationContext(),"Vivek",null,3);
        sld=d.getWritableDatabase();

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Name=e1.getText().toString();
                Address=e2.getText().toString();
                Email=e3.getText().toString();
                Phone=e4.getText().toString();
                Password=e5.getText().toString();
                if(Name.equals("")|Address.equals("")|Email.equals("")|Phone.equals("")|Password.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Fill All The Blanks", Toast.LENGTH_LONG).show();
                }
                else
                {
                    sld.execSQL("insert into reg(Name,Address,Email,Phone,Password)values('"+Name+"','"+Address+"','"+Email+"','"+Phone+"','"+Password+"')");
                    e1.setText("");
                    e2.setText("");
                    e3.setText("");
                    e4.setText("");
                    e5.setText("");
                    Toast.makeText(getApplicationContext(), "Welcome", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(getApplication(),LoginActivity.class);
                    startActivity(i);
                }

            }
        });
    }
}
