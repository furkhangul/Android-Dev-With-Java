package com.example.furoftheweak;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView count;
    ListView listem;
    String [] ulkeler ={"Türkiye", "Pakistan","Gine", "Uganda"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = findViewById(R.id.output);
        listem = findViewById(R.id.listemiz);
        ArrayAdapter<String> adaptor = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,ulkeler );
        listem.setAdapter(adaptor);
    }

    public void btnStart(View view){

    }

}
