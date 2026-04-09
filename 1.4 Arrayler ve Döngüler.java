package com.example.furoftheweak;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Diziler extends AppCompatActivity{
    @Override
    public void onCreatee(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        //Diziler ile Döngüler
        String[] personeller = new String[] {
                "Furkan Gül",
                "Kerem Aktürkoğlu",
                "Hasan Şahin",
                "Bünyamin Seba",
                "Ramiz Karaeski"
        };

        for(int i =0; i < personeller.length; i ++ ){
            System.out.println(personeller[i]);
        }

        //  Veya foreach döngüsü ile bu sorunu hemen çözebiliriz.
        for(String personel : personeller){
            System.out.println(personel);
        }
    }
}
