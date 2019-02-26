package com.example.myapplication;

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

    public void onMainLogin(View view) {
        switch (view.getId()) {
            case R.id.playerLogin:
                Intent pLog = new Intent(this, PlayerLogin.class);
                startActivity(pLog);
                break;

            case R.id.teamLogin:
                Intent tLog = new Intent(this, TeamLogin.class);
                startActivity(tLog);
                break;

            default:
                throw new IllegalArgumentException("idk how you messed up button pressing");
        }
    }

}
