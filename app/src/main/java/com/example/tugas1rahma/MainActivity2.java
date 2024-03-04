package com.example.tugas1rahma;


import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Mendapatkan nilai dari Intent
        String result = getIntent().getStringExtra("result");

        // Menampilkan hasil di TextView
        TextView tvResult = findViewById(R.id.tv_result);
        tvResult.setText(result);
    }
}