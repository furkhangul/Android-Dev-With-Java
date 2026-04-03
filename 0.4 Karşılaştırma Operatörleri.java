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
         * Karşılaştırma Operatörleri:
         ==  -> Eşit mi?
         !=  -> Eşit değil mi?
         >   -> Büyük mü?
         <   -> Küçük mü?
         >=  -> Büyük eşit mi?
         <=  -> Küçük eşit mi?
         */

        // Temel örnekler:
        int a = 10;
        int b = 5;

        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));



        // Kullanıcı yaşı kontrolü (gerçek senaryo):
        int age = 18;

        System.out.println("18 yaşından büyük mü? " + (age > 18));
        System.out.println("18 yaşına eşit mi? " + (age == 18));
        System.out.println("18 yaşından küçük mü? " + (age < 18));



        // Sınav geçme durumu:
        int not = 65;

        System.out.println("Geçti mi? (>=50): " + (not >= 50));
        System.out.println("Kaldı mı? (<50): " + (not < 50));



        // İki sayının eşitliği:
        int x = 20;
        int y = 20;

        System.out.println("x ve y eşit mi? " + (x == y));



        // String karşılaştırma (DİKKAT!)
        String ad1 = "Furkan";
        String ad2 = "Furkan";

        System.out.println("String == ile: " + (ad1 == ad2)); // riskli
        System.out.println("String equals ile: " + ad1.equals(ad2)); // doğru kullanım



        // Karışık örnek:
        int sayi1 = 15;
        int sayi2 = 30;

        boolean sonuc1 = sayi1 < sayi2;
        boolean sonuc2 = sayi1 > sayi2;

        System.out.println("sayi1 < sayi2 : " + sonuc1);
        System.out.println("sayi1 > sayi2 : " + sonuc2);



        // Mini uygulama: giriş kontrolü
        int sifre = 1234;
        int girilenSifre = 1234;

        System.out.println("Şifre doğru mu? " + (sifre == girilenSifre));

    }
}
