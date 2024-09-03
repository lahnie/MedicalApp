package com.example.actividad_decimas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import Models.Medicamentos;
import Models.Pacientes;


public class consultar_paciente extends AppCompatActivity {
    private Button consultar;
    private TextView paciente;
    private TextView diagnotico;
    private TextView recomendacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_consultar_paciente);
        consultar=findViewById(R.id.buttonConsultar);
        paciente=findViewById(R.id.txtPaciente);
        diagnotico=findViewById(R.id.txtDiagnostico);
        recomendacion=findViewById(R.id.txtRecomendacion);


        consultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Pacientes pacienteData = new Pacientes();
                paciente.setText(pacienteData.getNombreCompleto());
                diagnotico.setText(pacienteData.getDiagnostico());
                recomendacion.setText(pacienteData.getRecomendacion());
            }
        });

    }
}