package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //write nonsense to log
        Log.e("LOG", "barfoo");
        Log.e("LOG", "barfoo");
        
        Toast.makeText(this, "Madness", Toast.LENGTH_LONG).show();

    }
}
