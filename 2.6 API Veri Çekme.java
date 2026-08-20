package com.example.sayiuret;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.sayiuret.databinding.ActivityMainBinding;

import org.jetbrains.annotations.NotNull;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class MainActivity extends AppCompatActivity {
    URL url;
    String metin;
    HttpsURLConnection httpsUrlConnection;
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        try{
            url = new URL("https://data.fixer.io/api/latest?access_key=9ddd65d0e1bc2007999c906c8fba904f");
            httpsUrlConnection = (HttpsURLConnection)(url.openConnection());
            InputStream inputStream = httpsUrlConnection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            int data = inputStreamReader.read();
            
            while(data > -1){
                char karakter = (char)data;
                metin += karakter;
                data = inputStreamReader.read();
            }
            
        }
        catch(Exception e){
            e.printStackTrace();
        }

        binding.ekle.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });

    }
}
