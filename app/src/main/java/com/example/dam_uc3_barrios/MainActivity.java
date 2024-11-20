package com.example.dam_uc3_barrios;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Asocia el botón al evento OnClickListener
        Button btn1 = findViewById(R.id.button);
        btn1.setOnClickListener(view ->
                Toast.makeText(this, "Se envió sus datos", Toast.LENGTH_SHORT).show()
        ); // Aquí termina correctamente
    }
}

