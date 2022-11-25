package com.example.activitecomm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=findViewById(R.id.textView);
        Bundle extras=getIntent().getExtras();
        if(extras!=null){
            String message=extras.getString("byebye" );
            //String message=extras.getString("message1" );
            textView.setText(message);
        }
    }
}