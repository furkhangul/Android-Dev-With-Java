package com.example.furoftheweak;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //1) ÖĞRENCİ LİSTESİ OLUŞTURMA
        // Birden fazla öğrenciyi tutmak için ArrayList kullanıyoruz.
        ArrayList<String> ogrenciler = new ArrayList<>();

        ogrenciler.add("Ahmet");
        ogrenciler.add("Mehmet");
        ogrenciler.add("Ayşe");
        ogrenciler.add("Fatma");
        ogrenciler.add("Ali");

        //2) FOREACH DÖNGÜSÜNÜN AMACI
        // Foreach döngüsü, listedeki tüm elemanları TEK TEK gezmek için kullanılır.
        // index ile uğraşmadan direkt elemanı alırız.

        //3) FOREACH İLE LİSTEYİ YAZDIRMA
        for (String ogrenci : ogrenciler) {
            System.out.println("Öğrenci: " + ogrenci);
        }

        //4) FOREACH İLE KOŞUL KULLANMA
        // Diyelim sadece ismi "A" ile başlayan öğrencileri yazdırmak istiyoruz.

        for (String ogrenci : ogrenciler) {

            if (ogrenci.startsWith("A")) {
                System.out.println("A ile başlayan öğrenci: " + ogrenci);
            }
        }

        //5) FOREACH İLE SAYISAL İŞLEM (PUAN HESABI)
        // Öğrencilerin her birine 10 puan ekleyelim (temsili örnek)

        ArrayList<Integer> puanlar = new ArrayList<>();
        puanlar.add(50);
        puanlar.add(60);
        puanlar.add(70);
        puanlar.add(80);

        for (int puan : puanlar) {
            int yeniPuan = puan + 10;
            System.out.println("Eski puan: " + puan + " | Yeni puan: " + yeniPuan);
        }

        //6) FOREACH İLE TOPLAM HESAPLAMA
        // Tüm puanların toplamını bulalım

        int toplam = 0;

        for (int puan : puanlar) {
            toplam += puan;
        }

        System.out.println("Toplam puan: " + toplam);

    }
}
