package com.techstudios.myapplication2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
     ImageView img;
     TextView factText;
     Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        img = (ImageView) findViewById(R.id.imageView);
        factText = (TextView) findViewById(R.id.textView);
        Drawable factimgs[] = new Drawable[3];
        String arr1[] = new String[3];
        Resources resFolder = getResources();
        factimgs[0] = resFolder.getDrawable(R.drawable.img1);
        factimgs[1] = resFolder.getDrawable(R.drawable.img2);
        factimgs[2] = resFolder.getDrawable(R.drawable.img3);
        arr1[0] = resFolder.getString(R.string.fact3);
        arr1[1] = resFolder.getString(R.string.fact2);
        arr1[2] = resFolder.getString(R.string.fact1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rng = new Random();
                int random = rng.nextInt(3-0)+0;
                img.setImageDrawable(factimgs[random]);
                factText.setText(arr1[random]);
            }
        });
    }
}