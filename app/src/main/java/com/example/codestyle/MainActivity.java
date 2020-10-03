package com.example.codestyle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int number1 = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Do you want to logout?");
        alert.setMessage("Message");

        alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                Toast.makeText(MainActivity.this, "Welcome To Code Style" + number1, Toast.LENGTH_SHORT).show();
            }
        });

        alert.setNegativeButton("Cancel",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        Toast.makeText(MainActivity.this, "Welcome to Style code "+11, Toast.LENGTH_SHORT).show();
                    }
                });

        alert.show();

    }
}