package com.example.uniapp.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.uniapp.R;
import com.example.uniapp.model.User;

public class ProfileActivity extends AppCompatActivity {
    TextView txtProfile1, txtProfile2;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        // back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        User user = intent.getParcelableExtra("Example Item");

        String name = user.getName();
        String help = user.getHelp();
        int image = user.getImage();

        txtProfile1 = findViewById(R.id.txtProfile1);
        txtProfile1.setText(name);
        txtProfile2 = findViewById(R.id.txtProfile2);
        txtProfile2.setText(help);

        imageView = findViewById(R.id.imgProfile);
        imageView.setImageResource(image);







    }
}