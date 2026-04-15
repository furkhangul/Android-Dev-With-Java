package com.example.furoftheweak;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    TextView yazi;
    EditText girdi;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    String kullaniciGirdisi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yazi = findViewById(R.id.output);
        girdi = findViewById(R.id.input);
        preferences = getSharedPreferences("notdefteri", Context.MODE_PRIVATE);
        String kayitli = preferences.getString("girdi", "");
        yazi.setText(kayitli);

    }
    public void btnWrite(View view){
        kullaniciGirdisi = girdi.getText().toString();
        if(!TextUtils.isEmpty(kullaniciGirdisi)){
            editor = preferences.edit();
            editor.putString("girdi", kullaniciGirdisi);
            editor.apply();
            yazi.setText(kullaniciGirdisi);
        }
    }

}
