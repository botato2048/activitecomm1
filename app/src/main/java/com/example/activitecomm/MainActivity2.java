package com.example.activitecomm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView textView;
    private Button bretour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=findViewById(R.id.textView);
        bretour=findViewById(R.id.bretour);

        Bundle extras=getIntent().getExtras();
        if(extras!=null){
            String message=extras.getString("byebye" );
            //String message=extras.getString("message1" );
            textView.setText(message);
        }
        bretour.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent returnIntent= getIntent();
                returnIntent.putExtra("returndata", "test");
                setResult(RESULT_OK,returnIntent);
                finish();

            }

    });
    }
}