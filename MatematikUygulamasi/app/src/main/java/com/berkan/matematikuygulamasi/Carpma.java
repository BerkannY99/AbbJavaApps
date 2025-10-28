package com.berkan.matematikuygulamasi;

import android.content.Intent;
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

import java.util.Random;

public class Carpma extends AppCompatActivity {
    TextView skortext;
    TextView islemtext;
    EditText sonuctext;

    int sayi1;
    int sayi2;
    int sonuc;
    int skor =0;
    Random rastgele = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carpma);
        skortext = findViewById(R.id.skortext);
        islemtext = findViewById(R.id.islemtext);
        sonuctext = findViewById(R.id.sonuctext);

        generateNewQuestion();
    }
    public void islems(View view) {
        String boscevap = sonuctext.getText().toString();
        if (!boscevap.isEmpty()) {
            int cevap = Integer.parseInt(boscevap);
            if (cevap == sonuc) {
                skor++;
                skortext.setText("Skor " + skor);
            } else {
                Toast.makeText(this, "Hatalı cevap verdiniz", Toast.LENGTH_SHORT).show();
            }

            generateNewQuestion();
            sonuctext.setText("");
        } else {
            Toast.makeText(this, "Lütfen geçerli bir sayı girin", Toast.LENGTH_SHORT).show();
        }
    }

    private void generateNewQuestion() {
        sayi1 = rastgele.nextInt(10);
        sayi2 = rastgele.nextInt(10);
        sonuc = sayi1 * sayi2;
        islemtext.setText(sayi1 + " X " + sayi2 + " = ? ");
    }
    public void anasayfagecis(View view){
        Intent anasayfa= new Intent(this,MainActivity.class);
        startActivity(anasayfa);
    }

    }
