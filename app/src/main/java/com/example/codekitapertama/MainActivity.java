package com.example.codekitapertama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView applogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //medampatkan id
        applogo = findViewById(R.id.applogo);

        //memberikan event kepada applogo
       applogo.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               //jalankan menuju halaman lain
               Intent getStarted = new Intent(MainActivity.this,GetStartedAct.class);
               startActivity(getStarted);
               finish();
           }
       });
    }
}
