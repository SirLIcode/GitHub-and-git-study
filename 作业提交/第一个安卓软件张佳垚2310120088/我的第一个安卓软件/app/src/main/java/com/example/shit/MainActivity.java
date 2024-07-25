package com.example.shit;
import android.graphics.Color;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.view.LayoutInflater;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
/*        button.setTextColor(Color.BLACK);*/

       //button.setBackgroundColor(Color.BLACK);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "我的第一个APP", Toast.LENGTH_SHORT).show();
            }
        });



    }
}