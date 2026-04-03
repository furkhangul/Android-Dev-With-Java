package com.example.furoftheweak;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        //++ Operatörü ile birer birer arttırma işlemi gerçekleştirebiliyoruz.
        int zaman = 1;
        System.out.println(++zaman);

        // -- Operatörü ile birer birer azaltma işlemi gerçekleştirebiliyoruz.
        System.out.println(--zaman);

        //Zamanlama için mesela:
        float sayac = 5.5f;
        System.out.println(++sayac);

        //Skor örneği:
        int skor = 0;

        skor++;
        skor++;
        skor++;

        System.out.println("Skor: " + skor);

        //Sayaç 2 :
        float zaman1 = 0.0f;

        zaman1++;
        zaman1++;
        zaman1++;

        System.out.println( "Geçen süre: " + zaman1);


        //Can alma eksiltme
        int can = 100;

        can--;
        can--;
        can--;
        can--;
        can--;
        can--;
        System.out.println("Can: " + can);
        can++;
        can++;
        can++;
        System.out.println("Can: " + can);



    }
}
