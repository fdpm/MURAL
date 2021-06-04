package com.proyectofinal.mural;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.proyectofinal.mural.ui.main.RegistroFragment;

public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, RegistroFragment.newInstance())
                    .commitNow();
        }
    }
    //Comentario de prueba
}