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
         * Mantıksal Operatörler:
         &&  -> VE (AND) → iki şart da doğru olmalı
         ||  -> VEYA (OR) → en az biri doğru olmalı
         !   -> DEĞİL (NOT) → sonucu tersine çevirir
         */


        // Temel örnek:
        boolean a = true;
        boolean b = false;

        System.out.println("a && b : " + (a && b));
        System.out.println("a || b : " + (a || b));
        System.out.println("!a     : " + (!a));
        System.out.println("!b     : " + (!b));



        // Sayılarla kullanım:
        int sayi = 15;

        System.out.println("10'dan büyük VE 20'den küçük mü? : " + (sayi > 10 && sayi < 20));
        System.out.println("10'dan küçük VEYA 20'den büyük mü? : " + (sayi < 10 || sayi > 20));



        // Yaş ve ehliyet kontrolü (gerçek senaryo)
        int age = 20;
        boolean ehliyetVar = true;

        System.out.println("Araba kullanabilir mi? : " + (age >= 18 && ehliyetVar));



        // Sınav geçme + devamsızlık kontrolü
        int not = 55;
        int devamsizlik = 3;

        System.out.println("Dersi geçti mi? : " + (not >= 50 && devamsizlik < 5));



        // Giriş sistemi (username + password)
        String kullaniciAdi = "admin";
        String sifre = "1234";

        String girilenAd = "admin";
        String girilenSifre = "1234";

        System.out.println("Giriş başarılı mı? : " +
                (kullaniciAdi.equals(girilenAd) && sifre.equals(girilenSifre)));



        // OR örneği (kampanya)
        boolean ogrenci = true;
        boolean ogretmen = false;

        System.out.println("İndirim alabilir mi? : " + (ogrenci || ogretmen));



        // NOT örneği
        boolean sistemAcik = false;

        System.out.println("Sistem kapalı mı? : " + (!sistemAcik));



        // Karışık örnek (dikkat!)
        int x = 10;

        boolean sonuc = (x > 5 && x < 20) || x == 100;

        System.out.println("Sonuç: " + sonuc);

    }
}
