package com.agasmochfauzan.mobilekalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int reset=0;
    private double angka1;
    private double angka2;
    TextView jumlah;
    EditText kolom1;
    EditText kolom2;
    Button ditambah;
    Button dikurang;
    Button dikali;
    Button dibagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kolom1=findViewById(R.id.angkapertama);
        kolom2=findViewById(R.id.angkakedua);
        ditambah=findViewById(R.id.tambah);
        dikurang=findViewById(R.id.kurang);
        dikali=findViewById(R.id.kali);
        dibagi=findViewById(R.id.bagi);
        jumlah=findViewById(R.id.hasil);


    }

    public void Tambah(View view) {
    angka1=Double.parseDouble(kolom1.getText().toString());
    angka2=Double.parseDouble(kolom2.getText().toString());
    double hasil=angka1+angka2;
    jumlah.setText(String.valueOf(hasil));





    }

    public void Kurang(View view) {
        angka1=Double.parseDouble(kolom1.getText().toString());
        angka2=Double.parseDouble(kolom2.getText().toString());
        double hasil=angka1-angka2;
        jumlah.setText(String.valueOf(hasil));
    }

    public void Kali(View view) {
        angka1=Double.parseDouble(kolom1.getText().toString());
        angka2=Double.parseDouble(kolom2.getText().toString());
        double hasil=angka1*angka2;
        jumlah.setText(String.valueOf(hasil));
    }

    public void Bagi(View view) {
        angka1=Double.parseDouble(kolom1.getText().toString());
        angka2=Double.parseDouble(kolom2.getText().toString());
        double hasil=angka1/angka2;
        jumlah.setText(String.valueOf(hasil));
    }

    public void Bersihkan(View view) {angka1=Double.parseDouble(kolom1.getText().toString());
        angka2=Double.parseDouble(kolom2.getText().toString());
        angka1=Double.parseDouble(kolom1.getText().toString());
        double hasil=0;
        jumlah.setText(String.valueOf(hasil));
    }
}
