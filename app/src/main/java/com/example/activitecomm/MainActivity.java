package com.example.activitecomm;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button monbouton;
    private final int REQUEST_CODE=2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        monbouton=findViewById(R.id.monbouton);
        monbouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);

                intent.putExtra("message1", "salut");
                intent.putExtra("byebye","au revoir");
               // startActivity(intent);
                startActivityForResult(intent,REQUEST_CODE);

            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==REQUEST_CODE){
            if (resultCode == RESULT_OK) {

                String result =data.getStringExtra("returndata");
                Toast.makeText(MainActivity.this, result,Toast.LENGTH_LONG).show();
            }
        }
    }
}