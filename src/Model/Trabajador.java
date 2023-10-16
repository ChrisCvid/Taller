package Model;

public class Trabajador {
    String nombre;
    int edad;
    String tipoContrato;
    String fechaContratacion;

    public Trabajador(String nombre , int edad , String tipoContrato , String fechaContratacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoContrato = tipoContrato;
        this.fechaContratacion = fechaContratacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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
/*-nombre: String
          -edad: int
          -tipoContrato: String
          -fechaContratacion: String
          --
                  +Trabajador()
          +getEdad(): int
          +getTipoContrato(): String
          +getFechaContratacion(): String
          +setEdad(): int
          +setTipoContrato(): String
          +setFechaContratacion(): String*/
}
