package com.example.memoryleak;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new DownloadTask(this).start();
        // changes done
        // changes done
        // changes done
        // changes done


    }

    private class DownloadTask extends Thread {

        Activity activity;

        public DownloadTask(Activity activity) {
            this.activity = activity;
        }

        @Override
        public void run() {
            SystemClock.sleep(2000 * 10);
        }
    }

}