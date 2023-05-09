package com.example.projetofaculdade;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.projetofaculdade.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText user, password;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView((R.layout.activity_main));

      user = (EditText) findViewById(R.id.user);
      password = (EditText) findViewById(R.id.password);
      button = (Button)  findViewById(R.id.button);

      button.setOnClickListener((View) -> {
                startActivities(new Intent[]{new Intent(MainActivity.this, segundo.class)});

      });



    }
    public  void clickbotao(View view){
        if(user.getText().toString().equals("jose") && password.getText().toString().equals("123"))
            startActivities(new Intent[]{new Intent(MainActivity.this, segundo.class)});
        else
            Toast.makeText(this, "Senha ou Usuario errados", Toast.LENGTH_LONG).show();

    }


}