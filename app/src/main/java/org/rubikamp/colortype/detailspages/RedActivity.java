package org.rubikamp.colortype.detailspages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import org.rubikamp.colortype.R;

public class RedActivity extends AppCompatActivity {

    private AppCompatTextView textTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red);
        textTitle = findViewById(R.id.textview_title);

        textTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Red")));
            }
        });
    }
}