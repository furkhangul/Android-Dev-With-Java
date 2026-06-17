package com.example.mobilprog;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.example.mobilprog.databinding.ActivityMainBinding;



public class MainActivity extends AppCompatActivity{

    ActivityMainBinding binding;
    SQLiteDatabase database;
    @Override
    protected void onCreate(Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        try{
            database = this.openOrCreateDatabase("UserData", MODE_PRIVATE, null);
            database.execSQL("CREATE TABLE IF NOT EXISTS UserTable(id int, name varchar, surname varchar)");
        }
        catch(Exception e){
            e.printStackTrace();
        }


        binding.btnEkle.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                try{
                    String input = "INSERT INTO UserTable VALUES(?,?,?)";
                    SQLiteStatement sorgu = database.compileStatement(input);

                    sorgu.bindString(1,binding.edtId.getText().toString());
                    sorgu.bindString(2,binding.edtIsim.getText().toString());
                    sorgu.bindString(3,binding.edtSoyisim.getText().toString());
                    sorgu.executeInsert();

                    Toast.makeText(MainActivity.this, "Veri yükleme işlemi başarılı şekilde gerçekleşti !", Toast.LENGTH_SHORT).show();
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        });


        binding.btnGetir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String metin = "";

                try{
                    Cursor cursor = database.rawQuery("SELECT * FROM UserTable",null);
                    int idgetir = cursor.getColumnIndex("id");
                    int isimgetir = cursor.getColumnIndex("name");
                    int soyisimgetir = cursor.getColumnIndex("surname");

                    while(cursor.moveToNext()){
                        String gelenid = cursor.getString(idgetir);
                        String gelenisim = cursor.getString(isimgetir);
                        String gelensoyisim = cursor.getString(soyisimgetir);
                        metin = metin + "\n"+  "ID: "+ gelenid + " İsim: " + gelenisim + " Soyisim: " + gelensoyisim;
                    }
                    binding.txtSonuc.setText(metin);
                    cursor.close();
                }

                catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

    }
}
