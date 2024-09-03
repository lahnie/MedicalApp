package Models;

public class Medicamentos {
    private String nombre;
    private String dosis;
    private String recomendacion;

    public Medicamentos() {
        nombre = "Aspirina";
        dosis = "100 mg";
        recomendacion = "Descanso";
    }

    public String MostrarRecomendacion(){
        return Medicamentos.this.recomendacion + " y " + Medicamentos.this.nombre + " " + Medicamentos.this.dosis;
    }
}
