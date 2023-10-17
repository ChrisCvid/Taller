package Program.Model;

public class Trabajador extends Persona {

    private String tipoContrato;
    private String fechaContratacion;

    private String fechaFinalizacionContrato;

    public Trabajador(String nombre, int edad, String tipoContrato, String fechaContratacion,String fechaFinalizacionContrato) {
        super(nombre, edad);
        this.tipoContrato = tipoContrato;
        this.fechaContratacion = fechaContratacion;
        this.fechaFinalizacionContrato=fechaFinalizacionContrato;
    }

    public String getFechaFinalizacionContrato() {
        return fechaFinalizacionContrato;
    }

    public void setFechaFinalizacionContrato(String fechaFinalizacionContrato) {
        this.fechaFinalizacionContrato = fechaFinalizacionContrato;
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
