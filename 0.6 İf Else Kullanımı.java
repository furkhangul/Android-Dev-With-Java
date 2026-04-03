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
         * if - else Yapısı:
         if (şart) {
             // doğruysa çalışır
         } else {
             // yanlışsa çalışır
         }
         */


        // Temel örnek:
        int number = 7;
        if(number < 10 ){
            System.out.println("Sayı 10'dan küçüktür.");
        }
        else{
            System.out.println("Sayı 10'dan büyüktür.");
        }


        // Yaş kontrolü:
        int age = 17;

        if (age >= 18) {
            System.out.println("Reşitsin");
        } else {
            System.out.println("Reşit değilsin");
        }



        // Sınav sonucu:
        int not = 45;

        if (not >= 50) {
            System.out.println("Dersi geçtin");
        } else {
            System.out.println("Kaldın");
        }



        // if - elseif - else kullanımı:
        int puan = 85;

        if (puan >= 90) {
            System.out.println("Harf Notu: A");
        } else if (puan >= 70) {
            System.out.println("Harf Notu: B");
        } else if (puan >= 50) {
            System.out.println("Harf Notu: C");
        } else {
            System.out.println("Harf Notu: F");
        }



        // Mantıksal operatör ile kullanım:
        int yas = 20;
        boolean ehliyetVar = true;

        if (yas >= 18 && ehliyetVar) {
            System.out.println("Araç kullanabilirsin");
        } else {
            System.out.println("Araç kullanamazsın");
        }



        // Giriş sistemi (login örneği):
        String kullaniciAdi = "admin";
        String sifre = "1234";

        String girilenAd = "admin";
        String girilenSifre = "1234";

        if (kullaniciAdi.equals(girilenAd) && sifre.equals(girilenSifre)) {
            System.out.println("Giriş başarılı");
        } else {
            System.out.println("Hatalı giriş");
        }



        // Tek satırlık if (ternary operatör)
        int sayi2 = 7;

        String sonuc = (sayi2 % 2 == 0) ? "Çift sayı" : "Tek sayı";
        System.out.println(sonuc);



        // İç içe if (nested if)
        int bakiye = 1000;
        int cekilecek = 500;

        if (bakiye >= cekilecek) {
            if (cekilecek > 0) {
                System.out.println("Para çekildi");
            } else {
                System.out.println("Geçersiz miktar");
            }
        } else {
            System.out.println("Yetersiz bakiye");
        }

    }
}
