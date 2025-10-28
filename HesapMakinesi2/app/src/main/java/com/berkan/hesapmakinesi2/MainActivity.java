package com.berkan.hesapmakinesi2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText number1text;
    EditText number2text;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1text = findViewById(R.id.number1text);
        number2text = findViewById(R.id.number2text);
        textView = findViewById(R.id.textView);

    }

    public void toplama(View view) {
        if (number1text.getText().toString().matches("") || number2text.getText().toString().matches(""))

        {
            textView.setText("Sayı Girişi Yapınız !");
        }
        else{

            double sayi1 = Double.parseDouble(number1text.getText().toString());
            double sayi2 = Double.parseDouble(number2text.getText().toString());
            double sonuc = sayi1 + sayi2;
            textView.setText("Sonuç : " + sonuc);
        }
    }

    public void cikarma(View view) {
        if (number1text.getText().toString().matches("") || number2text.getText().toString().matches(""))

        {
            textView.setText("Sayı Girişi Yapınız !");
        }
        else{

            double sayi1 = Double.parseDouble(number1text.getText().toString());
            double sayi2 = Double.parseDouble(number2text.getText().toString());
            double sonuc = sayi1 + sayi2;
            textView.setText("Sonuç : " + sonuc);
        }


    }

    public void bolme(View view) {
        if (number1text.getText().toString().matches("") || number2text.getText().toString().matches(""))

        {
            textView.setText("Sayı Girişi Yapınız !");
        }
        else{

            double sayi1 = Double.parseDouble(number1text.getText().toString());
            double sayi2 = Double.parseDouble(number2text.getText().toString());
            double sonuc = sayi1 + sayi2;
            textView.setText("Sonuç : " + sonuc);
        }

    }

    public void carpma(View view) {
        if (number1text.getText().toString().matches("") || number2text.getText().toString().matches(""))

        {
            textView.setText("Sayı Girişi Yapınız !");
        }
        else{

            double sayi1 = Double.parseDouble(number1text.getText().toString());
            double sayi2 = Double.parseDouble(number2text.getText().toString());
            double sonuc = sayi1 + sayi2;
            textView.setText("Sonuç : " + sonuc);
        }


    }
}