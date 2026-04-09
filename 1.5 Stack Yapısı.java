    package com.example.furoftheweak;
    import android.os.Bundle;

    import androidx.appcompat.app.AppCompatActivity;

    import java.util.Stack;

    public class Diziler extends AppCompatActivity{
        @Override
        public void onCreatee(Bundle saveInstanceState){
            super.onCreate(saveInstanceState);

            //Stackler

            Stack<String> notlar = new Stack<>();
            notlar.push("52");
            notlar.push("68");
            notlar.push("99");
            notlar.push("98");
            notlar.push("75");


            System.out.println(notlar.get(1));
            System.out.println(notlar.size());


            for(String i : notlar){
                System.out.println(i);
            }


            notlar.remove(2);
            notlar.remove(notlar.size() - 1);
            int sayac = notlar.search("99");
            System.out.println(sayac);
        }
    }
