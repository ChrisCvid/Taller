package Program.Model;

/**
 * La clase Orden representa una orden de productos realizada en una mesa por un trabajador.
 */
public class Orden {

    private int totalPedido;
    private String trabajador;
    private int numeroMesa;
    private Producto[] listaProductos;

    /**
     * Constructor para crear un objeto Orden con un total de pedido, trabajador, número de mesa y lista de productos.
     *
     * @param totalPedido     El costo total de la orden.
     * @param trabajador      El nombre del trabajador que tomó la orden.
     * @param numeroMesa      El número de la mesa en la que se realiza la orden.
     * @param listaProductos  La lista de productos incluidos en la orden.
     */
    public Orden(int totalPedido, String trabajador, int numeroMesa, Producto[] listaProductos) {
        this.totalPedido = totalPedido;
        this.trabajador = trabajador;
        this.numeroMesa = numeroMesa;
        this.listaProductos = listaProductos;
    }

    /**
     * Obtiene el costo total de la orden.
     *
     * @return El costo total de la orden.
     */
    public int getTotalPedido() {
        return totalPedido;
    }

    /**
     * Obtiene el nombre del trabajador que tomó la orden.
     *
     * @return El nombre del trabajador.
     */
    public String getTrabajador() {
        return trabajador;
    }

    /**
     * Obtiene el número de la mesa en la que se realizó la orden.
     *
     * @return El número de mesa.
     */
    public int getNumeroMesa() {
        return numeroMesa;
    }

    /**
     * Obtiene la lista de productos incluidos en la orden.
     *
     * @return La lista de productos.
     */
    public Producto[] getListaProductos() {
        return listaProductos;
    }

    /**
     * Establece el costo total de la orden.
     *
     * @param totalPedido El costo total de la orden.
     */
    public void setTotalPedido(int totalPedido) {
        this.totalPedido = totalPedido;
    }

    /**
     * Establece el nombre del trabajador que tomó la orden.
     *
     * @param trabajador El nombre del trabajador.
     */
    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    /**
     * Establece el número de la mesa en la que se realizó la orden.
     *
     * @param numeroMesa El número de mesa.
     */
    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }
}




