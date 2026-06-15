package com.example.furoftheweak;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    SQLiteDatabase database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            database = this.openOrCreateDatabase("user", MODE_PRIVATE,null);
            database.execSQL("CREATE TABLE IF NOT EXISTS UserData( username varchar, password varchar, email varchar) ");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void sqliteBtn(View view){
        switch(view.getId()){
            case R.id.btnEkle:
                break;
            case R.id.btnGuncelle:
                break;
            case R.id.btnSil:
                break;
            case R.id.btnTabloSil:
                break;
        }
    }
}
