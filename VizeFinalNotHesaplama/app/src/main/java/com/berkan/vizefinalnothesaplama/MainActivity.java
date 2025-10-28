package com.berkan.vizefinalnothesaplama;

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
    EditText editText2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        textView = findViewById(R.id.textView);
    }

    public void kontrol(View view){
        if (editText.getText().toString().matches("")) {
            Toast.makeText(this, "Not Girişi Yapınız !", Toast.LENGTH_SHORT).show();}
        else {
            int vize=  Integer.parseInt(editText.getText().toString());
            int finall=  Integer.parseInt(editText2.getText().toString());
            int sonuc;
            sonuc = (int) ((vize * 0.4) + (finall * 0.6 ));


            if (sonuc>=90){
                textView.setText("Sonucunuz AA GEÇTİNİZ "+sonuc);
            }
            else if (sonuc>=80){
                textView.setText("Sonucunuz BB GEÇTİNİZ "+sonuc);
            }
            else if (sonuc>=70){
                textView.setText("Sonucunuz CC GEÇTİNİZ "+sonuc);
            }
            else if (sonuc>=60){
                textView.setText("Sonucunuz DD GEÇTİNİZ "+sonuc);
            }
            else if (sonuc<=50){
                textView.setText("Sonucunuz FF KALDINIZ "+sonuc);
            }








        }



}
}
