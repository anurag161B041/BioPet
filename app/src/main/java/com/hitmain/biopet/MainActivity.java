package com.hitmain.biopet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.hitmain.BioActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView catview;
    private ImageView dogview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        catview=(ImageView)findViewById(R.id.cat);
        dogview=(ImageView)findViewById(R.id.dog);

        catview.setOnClickListener(this);
        dogview.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cat:
                Intent catIntent=new Intent(MainActivity.this, BioActivity.class);
                catIntent.putExtra("name","Jarvis");
                catIntent.putExtra("bio","Great cat.  Loves people and meows a lot!" );
                startActivity(catIntent);
                break;

            case R.id.dog:
                Intent dogIntent=new Intent(MainActivity.this, BioActivity.class);
                dogIntent.putExtra("name","Fluffy");
                dogIntent.putExtra("bio","Great dog.  Loves people and barks a lot!" );
                startActivity(dogIntent);
                break;

        }

    }
}
