package com.example.tugas1rahma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText etlength, etwide;
    private Button button1;
    private TextView tvhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etlength = findViewById(R.id.etlength);
        etwide = findViewById(R.id.etwide);
        tvhasil = findViewById(R.id.tvhasil);
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button1) {
            String inputlenght = etlength.getText().toString().trim();
            String inputwide = etwide.getText().toString().trim();

            Double luas = Double.parseDouble(inputlenght) * Double.parseDouble(inputwide);
            Double keliling = 2 * (Double.parseDouble(inputlenght) + Double.parseDouble(inputwide));
            String resultText = ("Panjang:  " + inputlenght + " cm" + "\nLebar: " + inputwide + " cm" + "\nLuas: " + luas.toString() + " cm" + "\nKeliling: " + keliling.toString() + " cm");

            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            intent.putExtra("result", resultText);
            startActivity(intent);
        }

    }

}