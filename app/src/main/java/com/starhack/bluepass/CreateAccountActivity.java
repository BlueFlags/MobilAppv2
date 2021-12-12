package com.starhack.bluepass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CreateAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
    }
    public void createaccount(View view) {
        Intent intent = new Intent(CreateAccountActivity.this, AddCarActivity.class);
        startActivity(intent);
    }
}