package Program.Model;

import ucn.*;

/**
 * La clase ListaMesas representa una lista de mesas en un restaurante.
 */
public class ListaMesas {
    private Mesa[] listaMesas;
    private int max = 18;
    private int min = 0;

    int actual = 0;

    /**
     * Constructor para crear una lista de mesas con una capacidad máxima especificada.
     *
     * @param max La capacidad máxima de la lista de mesas.
     */
    public ListaMesas(int max) {
        this.max = max;
        this.listaMesas = new Mesa[ max ];
    }

    // Getters y setters para propiedades de la clase (max, min, actual).
    public Mesa[] getListaMesas() {
        return listaMesas;
    }

    public void setListaMesas(Mesa[] listaMesas) {
        this.listaMesas = listaMesas;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }

    /**
     * Agrega una mesa a la lista de mesas.
     *
     * @param mesa La mesa a agregar.
     */
    public void addMesa(Mesa mesa) {
        for (int i = 0 ; i < listaMesas.length ; i++) {
            if (this.listaMesas[ i ] == null) {
                this.listaMesas[ i ] = mesa;
                return;
            }
        }
    }

    /**
     * Busca una mesa en la lista de mesas por número y verifica su disponibilidad.
     *
     * @param Listamesa La lista de mesas a buscar.
     * @param numero    El número de mesa a buscar.
     * @return true si la mesa está ocupada, false si está disponible.
     */
    public boolean BuscarMesa(ListaMesas Listamesa , int numero) {
        if (!listaMesas[ numero ].isDisponibilidad ()) {
            StdOut.println ("la mesa esta disponible");
            return false;
        } else {
            StdOut.println ("la mesa esta ocupada");
            return true;
        }
    }

    /**
     * Agrega un cliente a una mesa en función de su número.
     *
     * @param listaMesas La lista de mesas.
     */
    public void agregarCliente(ListaMesas listaMesas) {
        StdOut.println ("ingrese numero de la mesa: ");
        int numero = StdIn.readInt ();
        if (!BuscarMesa (listaMesas , numero)) {
            ;
            StdOut.print ("ingrese nombre del cliente: ");
            String cliente = StdIn.readString ();
            StdOut.print ("ingrese edad del cliente: ");
            int edadCliente = StdIn.readInt ();
            this.listaMesas[ numero ].setCliente (cliente);
            this.listaMesas[ numero ].setEdadCliente (edadCliente);
            this.listaMesas[ numero ].setDisponibilidad (true);
        }

    }

    /**
     * Agrega mesas a la lista de mesas, inicializando con disponibilidad "false".
     *
     * @param listaMesas La lista de mesas a crear.
     */
    public void agregarMesa(ListaMesas listaMesas) {
        for (int i = 0 ; i <= listaMesas.listaMesas.length ; i++) {
            Mesa mesa = new Mesa (i , false , null , 0);
            addMesa (mesa);
        }

    }

    /**
     * Muestra información sobre el estado de las mesas, incluyendo disponibilidad, nombre del cliente y número.
     */
    public void desplegarMesa() {
        StdOut.println ("Lista mesas: ");
        for (int i = 0 ; i < listaMesas.length ; i++) {
            StdOut.print ("Disponible: "+listaMesas[ i ].isDisponibilidad () + " Nombre cliente: " + listaMesas[ i ].getCliente () + " Numero de la mesa: " + listaMesas[ i ].getNumero () + " Edad del cliente: " + listaMesas[ i ].getEdadCliente () + "\n");
        }
    }

    /**
     * Ocupa una mesa en función de su número, estableciendo la disponibilidad en "true".
     *
     * @param Listamesa La lista de mesas.
     * @param numero    El número de mesa a ocupar.
     */
    public void ocuparMesa(ListaMesas Listamesa , int numero) {
        listaMesas[numero].setDisponibilidad (true);
    }
}