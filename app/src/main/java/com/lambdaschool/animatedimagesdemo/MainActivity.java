package com.lambdaschool.animatedimagesdemo;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    boolean playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageView = findViewById(R.id.animated_image_view);

        // Animated GIF
        /*try {
            Drawable drawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(getResources(), R.drawable.adaptive_playground));

            imageView.setImageDrawable(drawable);
            if(drawable instanceof AnimatedImageDrawable) {
                ((AnimatedImageDrawable) drawable).start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }*/

        // Static Image
//        imageView.setImageDrawable(getDrawable(R.drawable.adaptive_playground));

        // Series of frames in list
        /*imageView.setImageDrawable(getDrawable(R.drawable.adaptive_playground_animation_list));
        final Drawable drawable = imageView.getDrawable();
        if(drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).start();
        }*/

        // Animated Vector Drawable Button
        /*imageView.setImageDrawable(getDrawable(R.drawable.avd_anim_pause_play));
        playing = false;
        final Drawable drawable = (imageView).getDrawable();
        if(drawable instanceof Animatable) {
            ((Animatable)drawable).start();
        }

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!playing) {
                    imageView.setImageDrawable(getDrawable(R.drawable.avd_anim_play_pause));
                    playing = true;
                } else {
                    imageView.setImageDrawable(getDrawable(R.drawable.avd_anim_pause_play));
                    playing = false;
                }


                final Drawable drawable = imageView.getDrawable();
                if(drawable instanceof Animatable) {
                    ((Animatable)drawable).start();
                }
            }
        });*/

        // animation list
        /*imageView.setImageDrawable(getDrawable(R.drawable.adaptive_playground_animation_list));
        final Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).start();
        }*/

        imageView.setImageDrawable(getDrawable(R.drawable.avd_anim_lock_open_close));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Drawable drawable = imageView.getDrawable();
                if(drawable instanceof Animatable) {
                    ((Animatable) drawable).start();
                }
            }
        });
    }
}
