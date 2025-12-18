package com.vimal.panocam;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button btn = new Button(this);
        btn.setText("பின்னணியில் இயக்கு");
        btn.setOnClickListener(v -> {
            startService(new Intent(this, BackgroundService.class));
        });
        setContentView(btn);
    }
}
