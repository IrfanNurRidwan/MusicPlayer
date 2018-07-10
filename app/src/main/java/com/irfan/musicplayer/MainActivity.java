package com.irfan.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;

import android.widget.Toast;

import com.irfan.musicplayer.R;

public class MainActivity extends AppCompatActivity {

    private static final String isPlaying = "media is playing";

    MediaPlayer player;

    Button btn1,btn2,btn3,btn4;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.button);

        btn1.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick (View arg0){

                playSound(1);

            }

        });

        btn2 = (Button)findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick (View arg0){

                playSound(2);

            }

        });

        btn3 = (Button)findViewById(R.id.button3);

        btn3.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick (View arg0){

                playSound(3);

            }

        });

        btn4 = (Button)findViewById(R.id.button4);

        btn4.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick (View arg0){

                playSound(4);

            }

        });

    }

    public void onPause(){

        try{

            super.onPause();

            player.pause();

        }catch (Exception e){

        }

    }

    private void playSound(int arg){

        try{

            if (player.isPlaying()){

                player.stop();

                player.release();

            }

        }catch (Exception e){

            Toast.makeText(this, "Masuk Lagu", Toast.LENGTH_LONG).show();

        }

        if (arg ==1){

            Toast.makeText(this, isPlaying+ "PlayList 1", Toast.LENGTH_LONG).show();

            player = MediaPlayer.create(this, R.raw.lagu1);

        }else if (arg ==2){

            Toast.makeText(this, isPlaying+ "PlayList 2", Toast.LENGTH_LONG).show();

            player = MediaPlayer.create(this, R.raw.lagu2);

        }else if (arg ==3){

            Toast.makeText(this, isPlaying+ "PlayList 3", Toast.LENGTH_LONG).show();

            player = MediaPlayer.create(this, R.raw.lagu3);

        }else if (arg ==4){

            Toast.makeText(this, isPlaying+ "PlayList 4", Toast.LENGTH_LONG).show();

            player = MediaPlayer.create(this, R.raw.lagu4);


        }

        player.setLooping(true);

        player.start();

    }

}
