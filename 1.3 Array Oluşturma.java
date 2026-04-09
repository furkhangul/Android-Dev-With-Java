package com.example.furoftheweak;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Diziler extends AppCompatActivity{
    @Override
    public void onCreatee(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        //Eleman sayısnı belirtmemiz gerekmektedir. ÇÜnkü sistem kaç tane eleman gireceğini kendisi belirleyememektedir.
        String[] personeller = new String[3];
        personeller[0] = "Furkan Gül";
        personeller[1] = "Aslı Tatlı";
        personeller[2] = "Kenan İmirzalıoğlu";


        System.out.println(personeller[0]);

        //Burada atama ile sayı belirtmemize gerek yok çünkü zaten bilgisayara daha başlamadan eleman sayısını veriyoruz.
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        //Personellerin toplam sayısını ekrana yazdırır.
        System.out.println(personeller.length);
        
        
        //En uç örnek verecek olursak : 
        int[]  sayilarim = {1,2,3,4,5,6,7,8,9};
        //Şeklinde  de listelenebiliyor.
    }
}
