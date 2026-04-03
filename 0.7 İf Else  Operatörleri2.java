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
         * SENARYO:
         * Kullanıcı giriş yapacak
         * Yaşı kontrol edilecek
         * Ehliyet kontrolü yapılacak
         * Not sistemi hesaplanacak
         * Banka işlemi yapılacak
         */

        // Kullanıcı bilgileri
        String kullaniciAdi = "furkan";
        String sifre = "1234";

        String girilenAd = "furkan";
        String girilenSifre = "1234";

        // Giriş kontrolü
        if (kullaniciAdi.equals(girilenAd) && sifre.equals(girilenSifre)) {

            System.out.println("✅ Giriş başarılı");

            // Yaş ve ehliyet kontrolü
            int yas = 20;
            boolean ehliyetVar = true;

            if (yas >= 18) {
                System.out.println("Yaş uygun");

                if (ehliyetVar) {
                    System.out.println("🚗 Araç kullanabilirsin");
                } else {
                    System.out.println("Ehliyetin yok");
                }

            } else {
                System.out.println("Yaşın küçük");
            }


            // Not sistemi
            int puan = 72;

            if (puan >= 90) {
                System.out.println("Not: A");
            } else if (puan >= 70) {
                System.out.println("Not: B");
            } else if (puan >= 50) {
                System.out.println("Not: C");
            } else {
                System.out.println("Not: F");
            }


            // Banka işlemi
            int bakiye = 1000;
            int cekilecekPara = 300;

            if (cekilecekPara > 0) {

                if (bakiye >= cekilecekPara) {
                    bakiye -= cekilecekPara;
                    System.out.println("💰 Para çekildi");
                    System.out.println("Kalan bakiye: " + bakiye);
                } else {
                    System.out.println("❌ Yetersiz bakiye");
                }

            } else {
                System.out.println("Geçersiz işlem");
            }


            // Sayı tek mi çift mi?
            int sayi = 7;

            if (sayi % 2 == 0) {
                System.out.println("Çift sayı");
            } else {
                System.out.println("Tek sayı");
            }


            // Ternary kullanım
            int sicaklik = 30;

            String durum = (sicaklik > 25) ? "Hava sıcak" : "Hava serin";
            System.out.println(durum);


        } else {
            System.out.println("❌ Giriş başarısız");
        }

    }
}
