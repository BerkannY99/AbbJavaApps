package com.berkan.girilenisimlerirastgeleyazdirma;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText TextMultiLine;
    EditText editText;
    Random rastgele = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the EditText views after setContentView
        editText = findViewById(R.id.editText);
        TextMultiLine = findViewById(R.id.TextMultiLine);
    }

    public void kontrol(View view) {
        String currentText = TextMultiLine.getText().toString();
        String randomNumber = String.valueOf(rastgele.nextInt(10));
        TextMultiLine.setText(currentText + randomNumber + "\n");
    }
}
