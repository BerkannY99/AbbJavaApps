package com.berkan.girilensayininkacbasamakloldugunubulma;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);


    }
    public void kontrol(View view){
        if (editText.getText().toString().matches("")) {
            Toast.makeText(this, "Sayı Girişi Yapınız !", Toast.LENGTH_SHORT).show();}
        else {

            int sayi=  Integer.parseInt(editText.getText().toString());
            int sayac = 0;

            while(sayi !=0) {
                sayac++;
                sayi /= 10;

            }
            textView.setText("Basamak Sayısı "+sayac);

        }

    }
}