package org.rubikamp.colortype;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import org.rubikamp.colortype.detailspages.BlueActivity;
import org.rubikamp.colortype.detailspages.RedActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private AppCompatButton buttonRed, buttonBlue, buttomYellow, buttonGreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonRed = findViewById(R.id.button_red);
        buttonBlue = findViewById(R.id.button_blue);
        buttomYellow = findViewById(R.id.button_yellow);
        buttonGreen = findViewById(R.id.button_green);

        buttonRed.setOnClickListener(this);
        buttonBlue.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.button_red:
                startActivity(new Intent(MainActivity.this, RedActivity.class));
                break;

            case R.id.button_blue:
                startActivity(new Intent(MainActivity.this, BlueActivity.class));
                break;
        }

    }
}