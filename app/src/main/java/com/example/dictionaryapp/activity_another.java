package com.example.dictionaryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class activity_another extends AppCompatActivity {
    private TextView vtText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        TextView vtText = findViewById(R.id.vtText);

        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
            String message = bundle.getString("myMessage");
            vtText.setText(message);
        }
        else
        {
            Toast.makeText(this, "No Message", Toast.LENGTH_SHORT).show();
        }
    }
}
