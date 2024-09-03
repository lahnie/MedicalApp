package Models;

public class Pacientes {
    private String nombre;
    private String apellido;
    private String diagnostico;
    private Medicamentos medicamentos;

    public Pacientes() {
        nombre = "Patricio";
        apellido = "Castillo";
        diagnostico = "Insuficiencia Cardiaca";
        medicamentos = new Medicamentos();
    }

    public String getNombreCompleto(){
        return nombre + " " + apellido;
    }

    public String getDiagnostico(){
        return diagnostico;
    }

    public String getRecomendacion(){
        return medicamentos.MostrarRecomendacion();
    }


}
