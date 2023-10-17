package Program.Model;

public class Mesa {
    int numero;
    boolean disponibilidad;
    String cliente;

    public Mesa(int numero , boolean disponibilidad , String cliente) {
        this.numero = numero;
        this.disponibilidad = disponibilidad;
        this.cliente = cliente;
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
