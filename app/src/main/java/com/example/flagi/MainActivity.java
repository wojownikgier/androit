package com.example.flagi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int liczba = 0;
    private int liczbaPomylek = 0;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
    }

    public void Zlaodpowiedz(View view) {
        Toast.makeText(this, "Ten kolor jest w fladze polski", Toast.LENGTH_SHORT).show();
        liczbaPomylek++;
    }

    public void Dobraopwoeidz(View view) {
        view.setVisibility(View.INVISIBLE);
        liczba++;
        if (liczba == 4){
            textView.setText("to jest flaga polski!!\n"  +liczbaPomylek+ "  :razy pomyliłes");
        }
    }
}