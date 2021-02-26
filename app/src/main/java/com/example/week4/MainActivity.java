package com.example.week4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.main_menu, menu);


        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        
        if(id == R.id.item1){
            Toast.makeText(this, "you clicked item1", Toast.LENGTH_SHORT).show();

            return true;
        }
        if(id == R.id.settings){
            Intent intent = new Intent(this, Settings.class);

            startActivity(intent);


            return true;
        }





        return super.onOptionsItemSelected(item);


        
    }
}
