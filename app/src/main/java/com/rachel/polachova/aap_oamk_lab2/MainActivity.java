package com.rachel.polachova.aap_oamk_lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupUI();
    }

    private void setupUI() {
        setupGameButton();
    }

    private void setupGameButton() {
        final Button gameButton = new Button(this);
        gameButton.setText("I am the button");
        setContentView(gameButton);
        gameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter ++;
                gameButton.setText("You have pressed button for " + counter + " times.");
            }
        });
    }
}
