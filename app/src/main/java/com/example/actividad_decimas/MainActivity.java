package com.example.actividad_decimas;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText editUsername, editPassword;
    private Button botonLogin;
    private Button botonCerrar;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editUsername= findViewById(R.id.editUser);
        editPassword= findViewById(R.id.editPass);
        botonLogin =findViewById(R.id.btn_iniciarSesion);
        botonCerrar=findViewById(R.id.btn_Cerrar);

        botonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = editUsername.getText().toString();
                String password = editPassword.getText().toString();

                if (TextUtils.isEmpty(username)||TextUtils.isEmpty(password)){
                    Toast.makeText(MainActivity.this, "Por favor ingrese usuario y contrasena", Toast.LENGTH_SHORT).show();
                }else{
                    if (username.equals("aiep") && password.equals("2023")){
                        Intent intent = new Intent(MainActivity.this, home.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(MainActivity.this, "Usuario o contrasena incorrectos", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        botonCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });

    }
}