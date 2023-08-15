package com.vandan.app.ui.addEmployee;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.vandan.app.AppDatabase;
import com.vandan.app.R;
public class AddWorkerActivity extends AppCompatActivity {

    public static Context context;
    private AppDatabase db ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_worker);
        context=getApplicationContext();

        db = Room.databaseBuilder(AddWorkerActivity.context,
                AppDatabase.class, "employee")
                .build();

        AddWorkerFragment AddWorker = new AddWorkerFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, AddWorker).commit();




    }
}