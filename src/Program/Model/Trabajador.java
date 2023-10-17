package Program.Model;

public class Trabajador extends Persona {

    private String tipoContrato;
    private String fechaContratacion;


    public Trabajador(String nombre, int edad, String tipoContrato, String fechaContratacion) {
        super(nombre, edad);
        this.tipoContrato = tipoContrato;
        this.fechaContratacion = fechaContratacion;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

}
