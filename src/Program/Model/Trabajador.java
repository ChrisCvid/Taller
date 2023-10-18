package Program.Model;

/**
 * La clase Trabajador representa a un trabajador en el sistema de negocio.
 */
public class Trabajador extends Persona {

    private String tipoContrato;
    private String fechaContratacion;
    private String fechaFinalizacionContrato;

    /**
     * Constructor para crear un objeto Trabajador con información personal y de contrato.
     *
     * @param nombre                   El nombre del trabajador.
     * @param edad                     La edad del trabajador.
     * @param tipoContrato             El tipo de contrato del trabajador.
     * @param fechaContratacion        La fecha de contratación del trabajador.
     * @param fechaFinalizacionContrato La fecha de finalización del contrato del trabajador.
     */
    public Trabajador(String nombre, int edad, String tipoContrato, String fechaContratacion, String fechaFinalizacionContrato) {
        super(nombre, edad);
        this.tipoContrato = tipoContrato;
        this.fechaContratacion = fechaContratacion;
        this.fechaFinalizacionContrato = fechaFinalizacionContrato;
    }

    /**
     * Obtiene la fecha de finalización del contrato del trabajador.
     *
     * @return La fecha de finalización del contrato.
     */
    public String getFechaFinalizacionContrato() {
        return fechaFinalizacionContrato;
    }

    /**
     * Establece la fecha de finalización del contrato del trabajador.
     *
     * @param fechaFinalizacionContrato La fecha de finalización del contrato.
     */
    public void setFechaFinalizacionContrato(String fechaFinalizacionContrato) {
        this.fechaFinalizacionContrato = fechaFinalizacionContrato;
    }

    /**
     * Obtiene el tipo de contrato del trabajador.
     *
     * @return El tipo de contrato.
     */
    public String getTipoContrato() {
        return tipoContrato;
    }

    /**
     * Establece el tipo de contrato del trabajador.
     *
     * @param tipoContrato El tipo de contrato.
     */
    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    /**
     * Obtiene la fecha de contratación del trabajador.
     *
     * @return La fecha de contratación.
     */
    public String getFechaContratacion() {
        return fechaContratacion;
    }

    /**
     * Establece la fecha de contratación del trabajador.
     *
     * @param fechaContratacion La fecha de contratación.
     */
    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }
}