package com.firstapp.app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button3);

  button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          Toast.makeText(getApplicationContext(),"Hi supreet",
                  Toast.LENGTH_LONG).show();

          Intent intent = new Intent(MainActivity.this, SignupActivity.class);
          startActivity(intent);
      }
  });
        EditText text = (EditText) findViewById(R.id.email);
        String email = text.getText().toString();
        Button button2= (Button) findViewById(R.id.button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),email,
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, profile.class);
                startActivity(intent);
            }
        });
    }
}