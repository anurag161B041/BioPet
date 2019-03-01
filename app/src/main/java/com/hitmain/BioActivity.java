package com.hitmain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.hitmain.biopet.R;


public class BioActivity extends AppCompatActivity {
    private ImageView petImageview;
    private TextView petName;
    private TextView petBio;
    private Bundle extras;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);
        petImageview = (ImageView) findViewById(R.id.PetImageViewId);
        petName = (TextView) findViewById(R.id.nameId);
        petBio = (TextView) findViewById(R.id.biotextId);

        extras = getIntent().getExtras();

        if (extras != null) {
            String name = extras.getString("name");
            String bio = extras.getString("bio");

            setUp(name,bio);

        }
    }
    public void setUp(String name,String bio){

        if(name.equals("Fluffy")){
            petImageview.setImageDrawable(getResources().getDrawable(R.drawable.puppy));
            petName.setText(name);
            petBio.setText(bio);

        }
         else if(name.equals("Jarvis")){
            petImageview.setImageDrawable(getResources().getDrawable(R.drawable.minnie));
            petName.setText(name);
            petBio.setText(bio);


        }
        }


}
