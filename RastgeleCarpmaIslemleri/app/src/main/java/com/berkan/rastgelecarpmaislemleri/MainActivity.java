package com.berkan.rastgelecarpmaislemleri;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView skortext;
    TextView islemtext;
    EditText sonuctext;

    int sayi1;
    int sayi2;
    int sonuc;
    int skor;
    Random rastgele = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        islemtext = findViewById(R.id.islemtext);
        sonuctext = findViewById(R.id.sonuctext);
        skortext = findViewById(R.id.skortext);

        sayi1 = rastgele.nextInt(10);
        sayi2 = rastgele.nextInt(10);
        sonuc = sayi1 * sayi2;
        skortext.setText("Skor " + skor);
        islemtext.setText(sayi1 + " X " + sayi2 + " = ? ");
    }

    public void islems(View view){
        int cevap = Integer.parseInt(sonuctext.getText().toString());
        if (cevap == sonuc){
            skor++;
            skortext.setText("Skor " + skor);
        } else {
            Toast.makeText(this, "Hatalı cevap verdiniz", Toast.LENGTH_SHORT).show();

        }

        sayi1 = rastgele.nextInt(10);
        sayi2 = rastgele.nextInt(10);
        sonuc = sayi1 * sayi2;
        islemtext.setText(sayi1 + " X " + sayi2 + " = ? ");
        sonuctext.setText("");
    }
}
