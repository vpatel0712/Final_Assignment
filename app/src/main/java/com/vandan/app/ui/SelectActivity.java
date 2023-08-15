package com.vandan.app.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.vandan.app.R;
import com.vandan.app.Login;
import com.vandan.app.ui.addEmployee.AddWorkerActivity;


public class SelectActivity extends AppCompatActivity {


    private CardView addworker;
    private CardView loginCon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        addworker=findViewById(R.id.addworker);

        loginCon=findViewById(R.id.loginCon);

        loginCon.setOnClickListener(v -> {

            Intent i = new Intent(SelectActivity.this, Login.class);
            startActivity(i);
        });


        addworker.setOnClickListener(v -> {

           /* MainActivity.allAccessNav.navigate(R.id.addEmp);*/
            Intent i = new Intent(SelectActivity.this, AddWorkerActivity.class);
            startActivity(i);

        });



    }
}