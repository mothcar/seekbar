package com.example.paul.myseekbartestapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    SeekBar seekBar1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar1=(SeekBar)findViewById(R.id.seekBar1);
        seekBar1.setOnSeekBarChangeListener(this);
        seekBar1.setRotation(180);
        seekBar1.setProgress(0);

    }
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//        Toast.makeText(getApplicationContext(),"seekbar progress: "+ fromUser, Toast.LENGTH_SHORT).show();
        if(progress >= 0 && progress < 20){
            seekBar.setProgress(0);
        } else if(progress >= 20 && progress < 30){
            seekBar.setProgress(25);
        } else if(progress >= 30 && progress < 60){
            seekBar.setProgress(50);
        } else if(progress >= 60 && progress < 80){
            seekBar.setProgress(75);
        } else if(progress >= 80 && progress <= 100){
            seekBar.setProgress(100);
        }
    }
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
//        Toast.makeText(getApplicationContext(),"seekbar touch started!", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        String position = "";
        if(seekBar.getProgress() == 0){
            position = "면동";
        } else if(seekBar.getProgress() == 25){
            position = "구군";
        } else if(seekBar.getProgress() == 50){
            position = "시도";
        } else if(seekBar.getProgress() == 75){
            position = "전국";
        } else if(seekBar.getProgress() == 100){
            position = "세계";
        }
        Toast.makeText(getApplicationContext(),"seekbar touch stopped at : " + position, Toast.LENGTH_SHORT).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}