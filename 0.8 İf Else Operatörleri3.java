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
         * Kullanıcı sisteme giriş yapıyor
         * Hesap tipi kontrol ediliyor (admin / user)
         * Yaş ve ehliyet kontrolü
         * Not hesaplama
         * Banka işlemi (para çekme)
         * Sayı kontrolü (tek/çift)
         * Hava durumu değerlendirme
         */

        // -------------------------------
        // 1) KULLANICI GİRİŞ SİSTEMİ
        // -------------------------------
        String dogruKullanici = "furkan";
        String dogruSifre = "1234";

        String girilenKullanici = "furkan";
        String girilenSifre = "1234";

        String hesapTipi = "admin"; // admin veya user

        if (dogruKullanici.equals(girilenKullanici) && dogruSifre.equals(girilenSifre)) {

            System.out.println("✅ Giriş başarılı");

            // -------------------------------
            // 2) HESAP TİPİ KONTROLÜ
            // -------------------------------
            if (hesapTipi.equals("admin")) {
                System.out.println("👑 Admin girişi yapıldı");
            } else if (hesapTipi.equals("user")) {
                System.out.println("👤 Kullanıcı girişi yapıldı");
            } else {
                System.out.println("❓ Bilinmeyen hesap tipi");
            }


            // -------------------------------
            // 3) YAŞ VE EHLİYET KONTROLÜ
            // -------------------------------
            int yas = 20;
            boolean ehliyetVar = true;

            if (yas >= 18) {

                if (ehliyetVar) {
                    System.out.println("🚗 Araç kullanabilirsin");
                } else {
                    System.out.println("Ehliyetin yok");
                }

            } else {
                System.out.println("Yaşın küçük");
            }


            // -------------------------------
            // 4) NOT SİSTEMİ
            // -------------------------------
            int puan = 68;

            if (puan >= 90) {
                System.out.println("Not: A");
            } else if (puan >= 70) {
                System.out.println("Not: B");
            } else if (puan >= 50) {
                System.out.println("Not: C");
            } else {
                System.out.println("Not: F");
            }


            // -------------------------------
            // 5) BANKA İŞLEMİ
            // -------------------------------
            int bakiye = 1000;
            int cekilecekPara = 1200;

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


            // -------------------------------
            // 6) SAYI KONTROLÜ
            // -------------------------------
            int sayi = 9;

            if (sayi % 2 == 0) {
                System.out.println("Sayı çift");
            } else {
                System.out.println("Sayı tek");
            }


            // -------------------------------
            // 7) HAVA DURUMU (TERNARY)
            // -------------------------------
            int sicaklik = 28;

            String durum = (sicaklik > 25) ? "🌞 Hava sıcak" : "🌥️ Hava serin";
            System.out.println(durum);


            // -------------------------------
            // 8) KARMAŞIK MANTIKSAL ÖRNEK
            // -------------------------------
            int saat = 22;
            boolean haftaSonu = true;

            if ((saat >= 20 && saat <= 24) && haftaSonu) {
                System.out.println("🎮 Oyun oynayabilirsin");
            } else {
                System.out.println("📚 Ders çalışmalısın");
            }


        } else {
            System.out.println("❌ Giriş başarısız");
        }

    }
}
