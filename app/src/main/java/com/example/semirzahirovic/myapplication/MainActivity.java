package com.example.semirzahirovic.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.mylibrary.SweetAlertDialog;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    SweetAlertDialog dialog =  new SweetAlertDialog(this).setBackgroundColor(getResources().getColor(android.R.color.black));
    dialog.show();
  }
}
