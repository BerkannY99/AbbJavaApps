package com.berkan.matematikuygulamasi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void toplamasayfagecisi(View view){
        Intent toplamagecisi= new Intent(this,Toplama.class);
        startActivity(toplamagecisi);
    }

    public void cikarmasayfagecisi(View view){
        Intent cikarmagecisi= new Intent(this,Cikarma.class);
        startActivity(cikarmagecisi);
    }
    public void carpmasayfagecisi(View view){
        Intent carpmagecisi= new Intent(this,Carpma.class);
        startActivity(carpmagecisi);
    }
    public void bolmesayfagecisi(View view){
        Intent bolmegecisi= new Intent(this,Bolme.class);
        startActivity(bolmegecisi);
    }
}