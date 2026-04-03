package com.example.furoftheweak;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        /*
        * Aritmetik Operatörler:
        + -> Toplama
        - -> Çıkarma
        * -> Çarpma
        / -> Bölme
        ++ -> İlgili değeri 1 arttırma
        -- -> İlgili değeri 1 azaltma
        */

        //Intager yani sayı değerleri ile hareket etmek istiyorsak burada klasik programlama dillerinde olduğu gibi int değerini almaktadır.
        int number = 5;
        System.out.println("Your number: " + number);
        //Ekstra değer ekleme
        System.out.println(number + 10);

        //İki değişkeni toplama
        int number1 = 5;
        int number2 = 17;
        int total = number1 + number2;
        System.out.println("Total Value: " + total);

        //Başka bir örnek:
        int age = 28;
        System.out.println(age - 11);

        //Veya
        int age2 = 28 - 3;
        System.out.println(age2);



        //Vize Final Örneği:
        double vize  = 27.5, _final = 77.9, sonuc;
        vize += 15.9;
        _final -= 17.2;
        sonuc = vize + _final;
        System.out.println(sonuc);


        //Çarpma ve bölme ile ilgili örnekler:
        int s1 = 10, s2 = 2, _sonuc;
        _sonuc = s1* s2;
        System.out.println("Çarpma Sonucu: " + _sonuc );


        int s3 = 45, s4=9, _ssonuc;
        _ssonuc = s3 / s4;
        System.out.println("Bölme Soncu: " + _ssonuc);


        //Operatörler ile farklı gösterimler:

        _sonuc *= 5;
        System.out.println("5 ile çarpılmış sonuç: " + _sonuc);

        _ssonuc /= 5;
        System.out.println("5 ile bölünmüş sonuç: " + _ssonuc);


        //String ifadeler:
        String isim = "Furkan";
        System.out.println(isim);

        //String + sayı
        System.out.println(isim + 2);

        //Ad Soyad
        String ad = "Furkan", soyad = "Gül";
        System.out.println(ad + " " + soyad);
        System.out.println("Yaşınız : " + age);

    }
}
