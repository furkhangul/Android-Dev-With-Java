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
         * WHILE DÖNGÜSÜ:
         while (şart) {
             çalışacak kodlar
         }
         */

        //1) 1'den 5'e kadar sayma
        int i = 1;

        while (i <= 5) {
            System.out.println("i: " + i);
            i++;
        }

        //2) Geri sayım
        int sayac = 5;

        while (sayac > 0) {
            System.out.println("Geri sayım: " + sayac);
            sayac--;
        }

        //3) Tek sayıları yazdırma
        int x = 1;

        while (x <= 10) {
            if (x % 2 != 0) {
                System.out.println("Tek sayı: " + x);
            }
            x++;
        }

        //4) Toplam hesaplama
        int toplam = 0;
        int y = 1;

        while (y <= 5) {
            toplam += y;
            y++;
        }

        System.out.println("Toplam: " + toplam);



        /*
         * DO-WHILE DÖNGÜSÜ:
         do {
             çalışacak kodlar
         } while (şart);
         */

        //5) En az bir kez çalışır
        int a = 1;

        do {
            System.out.println("a: " + a);
            a++;
        } while (a <= 5);

        //6) Şart başta yanlış olsa bile çalışır
        int b = 10;

        do {
            System.out.println("b: " + b);
            b++;
        } while (b < 5); 

        //7) Şifre deneme sistemi
        int sifre = 1234;
        int girilenSifre;

        do {
            girilenSifre = 1234; 

            System.out.println("Şifre kontrol ediliyor...");

        } while (girilenSifre != sifre);

        System.out.println("Giriş başarılı");

        //8) Sayaç sistemi
        int zaman = 0;

        do {
            System.out.println("Zaman: " + zaman);
            zaman++;
        } while (zaman < 3);

    }
}
