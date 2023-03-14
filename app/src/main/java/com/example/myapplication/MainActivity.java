package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
EditText editTextNumberSigned10;
Button button7;
TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    editTextNumberSigned10 = (EditText) findViewById(R.id.editTextNumberSigned10);
    button7 = (Button) findViewById(R.id.button7);
    textView= (TextView) findViewById(R.id.textView);

    button7.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
           textView.setText(fibonacci (Integer.parseInt(editTextNumberSigned10.getText().toString())));
        }
    }
    );
    }
    private String fibonacci (int n)
    {
        String  text="";
        ArrayList <BigInteger> fib = new ArrayList<>();
        BigInteger first = new BigInteger("0");
        BigInteger second = new BigInteger("1");
        fib.add(first);
        fib.add(second);
        for (int i=1; i<n; i++)
        {
       fib.add(fib.get(i).add(fib.get(i-1)));
        }
        for (int i=1; i<=n; i++)
        {
            text = text + i + "." + fib.get(i) + "\n";
        }
        return text;
  }
}