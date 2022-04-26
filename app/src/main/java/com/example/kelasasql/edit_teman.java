package com.example.kelasasql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.kelasasql.database.DBController;
import com.google.android.material.textfield.TextInputEditText;

import java.util.HashMap;

public class edit_teman extends AppCompatActivity {
    TextInputEditText Nama, Telpon;

    Button Save;

    String nama, telp, id;

    DBController controller = new DBController(edit_teman.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_teman);

        Nama = findViewById(R.id.edNama);
        Telpon = findViewById(R.id.edTelp);
        Save = findViewById(R.id.simpanBtn);

        id = getIntent().getStringExtra("id");
        nama = getIntent().getStringExtra("nama");
        telp = getIntent().getStringExtra("telpon");

        setTitle("Edit Data");
        Nama.setText(nama);
        Telpon.setText(telp);

        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Nama.getText().toString().isEmpty() || Telpon.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Data Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                } else {
                    nama = Nama.getText().toString();
                    telp = Telpon.getText().toString();
                    HashMap<String, String> values = new HashMap<>();
                    values.put("id", id);
                    values.put("nama", nama);
                    values.put("telpon", telp);
                    controller.UpdateData(values);
                    callHome();
                }
            }
        });
    }


    public void callHome() {
        Intent i = new Intent(edit_teman.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}