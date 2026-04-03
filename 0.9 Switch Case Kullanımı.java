package com.example.furoftheweak;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);


        // 1) MENÜ SİSTEMİ
        int secim = 2;

        switch (secim) {
            case 1:
                System.out.println("📄 Profil sayfası açıldı");
                break;

            case 2:
                System.out.println("⚙️ Ayarlar sayfası açıldı");
                break;

            case 3:
                System.out.println("🔐 Şifre değiştirme ekranı");
                break;

            default:
                System.out.println("❌ Geçersiz seçim");
        }



        // 2) GÜN SİSTEMİ
        int gun = 5;

        switch (gun) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Hatalı gün");
        }
        // 3) NOT SİSTEMİ
        char harfNotu = 'B';

        switch (harfNotu) {
            case 'A':
                System.out.println("Mükemmel");
                break;
            case 'B':
                System.out.println("İyi");
                break;
            case 'C':
                System.out.println("Orta");
                break;
            case 'D':
                System.out.println("Geçer");
                break;
            case 'F':
                System.out.println("Kaldın");
                break;
            default:
                System.out.println("Geçersiz not");
        }



        // 4) HESAP TİPİ (STRING ile)
        String hesapTipi = "admin";

        switch (hesapTipi) {
            case "admin":
                System.out.println("👑 Admin paneline hoş geldin");
                break;

            case "user":
                System.out.println("👤 Kullanıcı paneline hoş geldin");
                break;

            default:
                System.out.println("❓ Bilinmeyen hesap tipi");
        }



        // 5) BREAK OLMADAN (DİKKAT!)
        int level = 2;

        switch (level) {
            case 1:
                System.out.println("Level 1");
            case 2:
                System.out.println("Level 2");
            case 3:
                System.out.println("Level 3");
                break;
        }
    }
}
