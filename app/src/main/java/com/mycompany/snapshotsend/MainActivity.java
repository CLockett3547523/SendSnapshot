package com.mycompany.snapshotsend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SnapshotClick(View view) {// function named in OnClick
        startActivity(new Intent(MainActivity.this, SnapshotSendActivity.class));
        // come back via onResume() event.
    }
}
