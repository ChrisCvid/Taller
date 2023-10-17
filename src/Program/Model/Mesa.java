package Program.Model;

public class Mesa {
    private int numero;
    private boolean disponibilidad;
    private String cliente;
    private int edadCliente;

    public Mesa(int numero , boolean disponibilidad , String cliente, int edadCliente) {
        this.numero = numero;
        this.disponibilidad = disponibilidad;
        this.cliente = cliente;
        this.edadCliente= edadCliente;
    }

    public int getEdadCliente() {
        return edadCliente;
    }

    public void setEdadCliente(int edadCliente) {
        this.edadCliente = edadCliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

}
