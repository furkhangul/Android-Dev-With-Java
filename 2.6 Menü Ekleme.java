package com.example.sayiuret;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_item,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        if(item.getItemId() == R.id.menu_item_home){
            Toast.makeText(this,"Home menüsü", Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId() == R.id.menu_item_search){
            Toast.makeText(this,"Search menüsü", Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId() == R.id.menu_item_profile){
            Toast.makeText(this,"Profile menüsü", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
