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
         * FOR DÖNGÜSÜ:
         for (başlangıç; şart; artış/azalış) {
             çalışacak kodlar
         }
         */


        // 1) BASİT SAYMA (1 → 10)
        for (int i = 1; i <= 10; i++) {
            System.out.println("Sayı: " + i);
        }



        // 2) GERİ SAYIM (10 → 1)
        for (int i = 10; i >= 1; i--) {
            System.out.println("Geri sayım: " + i);
        }



       // 3) TEK / ÇİFT SAYI BULMA
  
        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " çift sayıdır");
            } else {
                System.out.println(i + " tek sayıdır");
            }
        }



        // 4) TOPLAM HESAPLAMA
        int toplam = 0;

        for (int i = 1; i <= 5; i++) {
            toplam += i;
        }

        System.out.println("Toplam: " + toplam);



        // ---------------------------------
        // 5) ÇARPIM TABLOSU (mini)
        // ---------------------------------
        int sayi = 5;

        for (int i = 1; i <= 10; i++) {
            System.out.println(sayi + " x " + i + " = " + (sayi * i));
        }


        // 6) KULLANICI SENARYOSU (LEVEL SİSTEMİ)
        int level = 1;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Level: " + level);

            level++; // her tur level artar
        }



        // 7) İÇ İÇE FOR (Nested Loop)
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {
                System.out.println("i: " + i + " j: " + j);
            }

        }



        // 8) YILDIZ DESENİ (PATTERN)
        for (int i = 1; i <= 5; i++) {

            String satir = "";

            for (int j = 1; j <= i; j++) {
                satir += "*";
            }

            System.out.println(satir);
        }


        // 9) BREAK KULLANIMI
        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                System.out.println("Döngü durduruldu");
                break;
            }

            System.out.println("i: " + i);
        }



        // 10) CONTINUE KULLANIMI
        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue; // 5'i atla
            }

            System.out.println("i: " + i);
        }

    }
}
