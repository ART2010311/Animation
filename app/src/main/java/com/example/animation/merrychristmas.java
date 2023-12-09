package com.example.animation;
import android.view.View;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class merrychristmas extends AppCompatActivity {
    LottieAnimationView anime;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.merry_christmas);
        anime=findViewById(R.id.mc);
        anime.setVisibility(View.VISIBLE);
        anime.setOnClickListener(view-> Toast.makeText(this,"MerryChristmas",Toast.LENGTH_LONG).show()
        );
    }

}
