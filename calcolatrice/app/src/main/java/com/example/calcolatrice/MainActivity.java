package com.example.calcolatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Button somma=(Button) findViewById(R.id.button);
    EditText v1=(EditText) findViewById(R.id.editTextTextPersonName);
    EditText v2=(EditText) findViewById(R.id.editTextTextPersonName2;
    TextView tot=(TextView) findViewById(R.id.textView2);
    somma.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
            int totale=0;
            totale=Integer.valueOf(v1.getText().toString()) + Integer.valueOf(v2.getText().toString());
            tot.setText(""+totale);
        }
    });
}