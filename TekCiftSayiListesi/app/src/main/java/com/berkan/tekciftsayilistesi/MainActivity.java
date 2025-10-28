package com.berkan.tekciftsayilistesi;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText TextMultiLine;
    List<Integer> sayisalListe;
    List<Integer> tekSayilar;
    List<Integer> ciftSayilar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextMultiLine = findViewById(R.id.TextMultiLine);


        sayisalListe = new ArrayList<>();
        tekSayilar = new ArrayList<>();
        ciftSayilar = new ArrayList<>();


        for (int i = 1; i <= 20; i++) {
            sayisalListe.add(i);
        }
    }

    public void teksayi(View view) {

        for (int sayi : sayisalListe) {
            if (sayi % 2 != 0) {
                tekSayilar.add(sayi);
            }
        }


        TextMultiLine.setText("Tek Sayılar: " + tekSayilar.toString());
    }

    public void ciftsayi(View view) {
        // Çift sayıları bulma
        for (int sayi : sayisalListe) {
            if (sayi % 2 == 0) {
                ciftSayilar.add(sayi);
            }
        }


        TextMultiLine.setText("Çift Sayılar: " + ciftSayilar.toString());
    }

    public void butunSayilar(View view) {

        tekSayilar.clear();
        ciftSayilar.clear();

        for (int sayi : sayisalListe) {
            if (sayi % 2 != 0) {
                tekSayilar.add(sayi);
            } else {
                ciftSayilar.add(sayi);
            }
        }

        String sonuc = "Tek Sayılar: " + tekSayilar.toString() + "\nÇift Sayılar: " + ciftSayilar.toString();
        TextMultiLine.setText(sonuc);
    }
}
