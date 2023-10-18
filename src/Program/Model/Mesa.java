package Program.Model;

/**
 * La clase Mesa representa una mesa en un local, con un número, disponibilidad, cliente y edad del cliente.
 */
public class Mesa {

    private int numero;
    private boolean disponibilidad;
    private String cliente;
    private int edadCliente;

    /**
     * Constructor para crear un objeto Mesa con un número, disponibilidad, cliente y edad del cliente.
     *
     * @param numero          El número de la mesa.
     * @param disponibilidad  La disponibilidad de la mesa (true si está disponible, false si no).
     * @param cliente         El nombre del cliente en la mesa.
     * @param edadCliente     La edad del cliente en la mesa.
     */
    public Mesa(int numero, boolean disponibilidad, String cliente, int edadCliente) {
        this.numero = numero;
        this.disponibilidad = disponibilidad;
        this.cliente = cliente;
        this.edadCliente = edadCliente;
    }

    /**
     * Obtiene el número de la mesa.
     *
     * @return El número de la mesa.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Establece el número de la mesa.
     *
     * @param numero El número de la mesa.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Verifica la disponibilidad de la mesa.
     *
     * @return true si la mesa está disponible, false si no.
     */
    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    /**
     * Establece la disponibilidad de la mesa.
     *
     * @param disponibilidad true si la mesa está disponible, false si no.
     */
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    /**
     * Obtiene el nombre del cliente en la mesa.
     *
     * @return El nombre del cliente en la mesa.
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Establece el nombre del cliente en la mesa.
     *
     * @param cliente El nombre del cliente en la mesa.
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtiene la edad del cliente en la mesa.
     *
     * @return La edad del cliente en la mesa.
     */
    public int getEdadCliente() {
        return edadCliente;
    }

    /**
     * Establece la edad del cliente en la mesa.
     *
     * @param edadCliente La edad del cliente en la mesa.
     */
    public void setEdadCliente(int edadCliente) {
        this.edadCliente = edadCliente;
    }
}