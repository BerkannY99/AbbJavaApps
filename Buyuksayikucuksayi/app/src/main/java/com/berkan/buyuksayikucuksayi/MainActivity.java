package com.berkan.buyuksayikucuksayi;

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
    EditText editText1;
    EditText editText2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=findViewById(R.id.editText1);
        editText2=findViewById(R.id.editText2);
        textView=findViewById(R.id.textView);


    }
    public void karsilastirma(View view){

        if (editText1.getText().toString().matches("") || editText2.getText().toString().matches(""))

        {
            Toast.makeText(this,"Sayı Girişi Yapınız !",Toast.LENGTH_SHORT).show();

        }
        else {

            double sayi1 = Double.parseDouble(editText1.getText().toString());
            double sayi2 = Double.parseDouble(editText2.getText().toString());
            if(sayi1<sayi2){
                textView.setText(editText2.getText());
            }
            else if (sayi2<sayi1)
            {
                textView.setText(editText1.getText());
            }
            else {
                Toast.makeText(this,"Sayılarınız Eşittir",Toast.LENGTH_SHORT).show();
            }

        }

    }
}