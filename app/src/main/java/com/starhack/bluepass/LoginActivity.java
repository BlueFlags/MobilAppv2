package com.starhack.bluepass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view){
        EditText txt = (EditText) findViewById(R.id.username);
        String username = txt.getText().toString();
        LongOperation longOperation=new LongOperation();
        longOperation.execute();

        Toast.makeText(this,username, Calendar.LONG).show();
    }
    public void signup(View view) {
        Intent intent = new Intent(LoginActivity.this, CreateAccountActivity.class);
        startActivity(intent);
    }
    private class LongOperation extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... params) {
            EditText txt = (EditText) findViewById(R.id.username);
            String username = txt.getText().toString();
            EditText txtp = (EditText) findViewById(R.id.password);
            String password = txtp.getText().toString();
            return null;
        }

        @Override
        protected void onPostExecute(String result) {
            Intent intent = new Intent(LoginActivity.this, AddCarActivity.class);
            startActivity(intent);
        }

    }

}