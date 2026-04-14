package com.example.furoftheweak;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    EditText take_username, take_password;
    CheckBox remember;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    String username,password, get_username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        take_username = findViewById(R.id.username);
        take_password = findViewById(R.id.password);
        remember = findViewById(R.id.remember);
        preferences = this.getSharedPreferences("packge com.example.furoftheweak", Context.MODE_PRIVATE);

        get_username = this.preferences.getString("username", null);

        if(!TextUtils.isEmpty(get_username)){
            take_username.setText(get_username);
        }
    }

    public void btnLogin(View view){
        username = take_username.getText().toString();
        password = take_password.getText().toString();

        if(!(username.isEmpty()) && !(password.isEmpty())){
            if(remember.isChecked()){
                editor = preferences.edit();
                editor.putString("username", username);
                editor.apply();
            }
            else{
                Toast.makeText(getApplicationContext(), "Başarıyla giriş yaptınız !",Toast.LENGTH_SHORT).show();
            }
        }


        else{
            Toast.makeText(getApplicationContext(), "Kullanıcı adı veya sifre alanı boş !", Toast.LENGTH_SHORT).show();
        }
    }
}
