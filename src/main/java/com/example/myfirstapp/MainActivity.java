package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Chamado quando o usuário toca no botão Send */

    public void sendMessage(View view) {

        Intent intent = new Intent(this, DisplayMessageActivity.class);

        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        EditText editText3 = (EditText) findViewById(R.id.editText3);

        String teste1 = editText.getText().toString();
        String teste2 = editText2.getText().toString();
        String teste3 = editText3.getText().toString();

        intent.putExtra("valor1", teste1);
        intent.putExtra("valor2", teste2);
        intent.putExtra("valor3", teste3);

        startActivity(intent);
    }
}
