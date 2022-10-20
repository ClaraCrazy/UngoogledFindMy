package com.xfarrow.locatemydevice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class RingerActivity extends AppCompatActivity {

    private Ringtone ringtoneManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ringer);
        showOnLockscreen();
        setViews();
        startRinging();
    }

    // https://stackoverflow.com/questions/35356848/android-how-to-launch-activity-over-lock-screen
    @SuppressLint("ObsoleteSdkInt")
    private void showOnLockscreen(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O_MR1)
        {
            setShowWhenLocked(true);
            setTurnScreenOn(true);
        }
        else
        {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED |
                    WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON);
        }
    }

    private void setViews(){
        Button stopButton = findViewById(R.id.stopButton);

        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopRinging();
            }
        });
    }

    private void startRinging(){
        Uri ringtone = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE);
        ringtoneManager = RingtoneManager.getRingtone(this, ringtone);
        ringtoneManager.setVolume(1f);
        ringtoneManager.play();
    }

    private void stopRinging(){
        ringtoneManager.stop();
        finishAffinity();
    }

    @Override
    public void onBackPressed(){
        stopRinging();
    }
}