package com.example.cokro.materi26;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;

public class Materi26 extends AppCompatActivity {

    FloatingActionButton menu1, menu2, menu3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi26);
        menu1 = (FloatingActionButton)findViewById(R.id.subFloatingMenu1);
        menu2 = (FloatingActionButton)findViewById(R.id.subFloatingMenu2);
        menu3 = (FloatingActionButton)findViewById(R.id.subFloatingMenu3);

        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Materi26.this, "Alarm Icon Chicked", Toast.LENGTH_LONG).show();
            }
        });

        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Materi26.this, "back up", Toast.LENGTH_LONG).show();

            }
        });

        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Materi26.this, "settings", Toast.LENGTH_LONG).show();

            }
        });
    }
}
