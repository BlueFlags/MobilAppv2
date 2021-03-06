package com.starhack.bluepass;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.starhack.bluepass.databinding.ActivityAddCarBinding;

import java.util.Calendar;

public class AddCarActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_car);
    }
    public void addcar(View view) {
        Toast.makeText(this, "Car Added Successful!", Calendar.LONG).show();
        Intent intent = new Intent(getApplicationContext(), EnterCardInfo.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}