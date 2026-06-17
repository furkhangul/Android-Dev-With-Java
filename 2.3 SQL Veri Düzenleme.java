package com.example.mobilprog;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    SQLiteDatabase database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            database = this.openOrCreateDatabase("user", MODE_PRIVATE,null);
            database.execSQL("CREATE TABLE IF NOT EXISTS UserData( username varchar, password varchar, email varchar) ");
        }
        catch(Exception e){
            Log.e("MainActivity","Hata Alındı !",e);
        }
    }

    public void sqliteBtn(View view){
        if(view.getId() == R.id.btnEkle){
            try{
                database.execSQL("INSERT INTO UserData(username,password,email) values('furkan','the.lord01','gl56frkn@gmail.com')");
                Toast.makeText(this, "Veri Başarıyla Eklendi", Toast.LENGTH_SHORT).show();
                getData();
            }
            catch(Exception e){
                Log.e("MainActivity","Ekleme işlemi gerçekleştirilemedi !",e);
            }
        }
        else if (view.getId() == R.id.btnSil){
            try {
                database.execSQL("DELETE FROM UserData WHERE username = 'furoftheweak'");
            }
            catch(Exception e){
                Log.e("ActivityMain","Silme işlemi gerçekleştirilemedi !", e);
            }
        }
        else if(view.getId() == R.id.btnGuncelle){
            try{
                database.execSQL("UPDATE  UserData SET username ='furoftheweak' WHERE username = 'furkan'");
                getData();
            }
            catch(Exception e){
                Log.e("MainActivity", "Güncelleme işlemi Gerçekleştirilemedi ! ", e);
            }
        }
        else if(view.getId() == R.id.btnTabloSil){
            try{
                database.execSQL("DROP Table UserData");
                getData();
            }
            catch(Exception e){
                Log.e("MainActivity", "Tablo silme işlemi gerçekleştirilemedi !", e);
            }
        }
    }

    public void getData(){
        Cursor cursor =   database.rawQuery("SELECT * FROM UserData ", null);
        int usernameIndex = cursor.getColumnIndex("username");
        int passwordIndex = cursor.getColumnIndex("password");
        int emailIndex = cursor.getColumnIndex("email");

        while(cursor.moveToNext()){
            System.out.println("Username: " + cursor.getString(usernameIndex) + " Password: " + cursor.getString(passwordIndex)+ " Email: "+ cursor.getString(emailIndex));
        }
        cursor.close();
    }
}
