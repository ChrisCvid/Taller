package Program.Model;

/**
 * La clase Cliente representa a un cliente que visita un restaurante.
 */
public class Cliente extends Persona {
    private int numero;  // Número de cliente
    private int mesa;    // Número de mesa asignada al cliente

    /**
     * Constructor para crear una instancia de la clase Cliente.
     *
     * @param nombre Nombre del cliente.
     * @param edad   Edad del cliente.
     * @param numero Número de cliente.
     * @param mesa   Número de mesa asignada al cliente.
     */
    public Cliente(String nombre, int edad, int numero, int mesa) {
        super(nombre, edad);
        this.numero = numero;
        this.mesa = mesa;
    }

    /**
     * Obtiene el número de cliente.
     *
     * @return El número de cliente.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Establece el número de cliente.
     *
     * @param numero El número de cliente.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Obtiene el número de mesa asignada al cliente.
     *
     * @return El número de mesa asignada al cliente.
     */
    public int getMesa() {
        return mesa;
    }

    /**
     * Establece el número de mesa asignada al cliente.
     *
     * @param mesa El número de mesa asignada al cliente.
     */
    public void setMesa(int mesa) {
        this.mesa = mesa;
    }
}