package com.example.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button mBtn;
    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getString(R.string.hello_evgenia);

        mBtn = findViewById(R.id.btn);
        final TextView mText = findViewById(R.id.tv);
        final String newString = getString(R.string.text_new);

        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mText.setText(newString);

            }
        });

        
        Toast.makeText(MainActivity.this, "la-la-la", Toast.LENGTH_LONG).show();
    }
}
