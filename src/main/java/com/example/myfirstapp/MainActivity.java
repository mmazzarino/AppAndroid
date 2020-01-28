package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Chamado quando o usuário toca no botão Send */

    public void sendMessage(View view) {
        // Do something in response to button
    }
}
