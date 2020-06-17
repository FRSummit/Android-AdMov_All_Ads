package com.example.coronavirus_howlongdoesittaketorecover;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {
    TextView title_main, bottom_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title_main = (TextView) findViewById(R.id.title_main);
        bottom_text = (TextView) findViewById(R.id.bottom_text);

        title_main.setText("COVID 19 RECOVER");
        bottom_text.setText("Let us Know how to recover from COVID 19");

        secondActivityAsIntent();
    }

    public void secondActivityAsIntent() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Chapter1.class);
                startActivity(intent);
                finishscreen();
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, 1000);
    }

    private void finishscreen() {
        this.finish();
    }
}
