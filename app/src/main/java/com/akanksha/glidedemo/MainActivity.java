package com.akanksha.glidedemo;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img1=(ImageView) findViewById(R.id.img1);
        ImageView img2=(ImageView) findViewById(R.id.img2);

        String[] urls={
                    "https://cdn.pixabay.com/photo/2017/04/16/20/42/brain-2235771__340.png",
                    "https://cdn.pixabay.com/photo/2017/04/16/20/42/light-bulb-2235770__340.png"
                };
        Glide.with(this).load(urls[0]).into(img1);
        Glide.with(this).load(urls[1]).into(img2);
    }
}
