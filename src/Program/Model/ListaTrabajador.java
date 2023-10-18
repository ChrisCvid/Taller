package Program.Model;

import ucn.*;
/**
 * La clase ListaTrabajador gestiona una lista de trabajadores en el sistema de negocio.
 */
public class ListaTrabajador {
    private Trabajador[] listaTrabajador;
    private int max;
    private int min;

    /**
     * Constructor que inicializa la lista de trabajadores con un tamaño máximo.
     *
     * @param max El tamaño máximo de la lista de trabajadores.
     */
    public ListaTrabajador(int max) {
        this.max = max;
        this.listaTrabajador = new Trabajador[max];
    }

    /**
     * Obtiene el tamaño máximo de la lista de trabajadores.
     *
     * @return El tamaño máximo.
     */
    public int getMax() {
        return max;
    }

    /**
     * Establece el tamaño máximo de la lista de trabajadores.
     *
     * @param max El tamaño máximo.
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * Obtiene el tamaño mínimo de la lista de trabajadores.
     *
     * @return El tamaño mínimo.
     */
    public int getMin() {
        return min;
    }

    /**
     * Establece el tamaño mínimo de la lista de trabajadores.
     *
     * @param min El tamaño mínimo.
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * Crea una lista de trabajadores inicializada con trabajadores vacíos.
     *
     * @param listaTrabajador La lista de trabajadores a crear.
     */
    public void crearListaTrabajador(ListaTrabajador listaTrabajador) {
        for (int i = 0; i < listaTrabajador.listaTrabajador.length; i++) {
            Trabajador trabajador = new Trabajador("", 0, "", "", "");
            addTrabajador(trabajador);
        }
    }

    /**
     * Agrega un trabajador a la lista de trabajadores.
     *
     * @param trabajador El trabajador a agregar.
     */
    public void addTrabajador(Trabajador trabajador) {
        for (int i = 0; i < listaTrabajador.length; i++) {
            if (listaTrabajador[i] == null) {
                listaTrabajador[i] = trabajador;
                return;
            }
        }
    }

    /**
     * Permite al usuario agregar un trabajador a la lista.
     *
     * @param listaTrabajador La lista de trabajadores.
     */
    public void agregarTrabajador(ListaTrabajador listaTrabajador) {
        StdOut.print("Ingrese nombre del trabajador: ");
        String nombre = StdIn.readString();
        StdOut.print("Ingrese la edad del trabajador: ");
        int edad = StdIn.readInt();
        StdOut.print("Ingrese el tipo de contrato: ");
        String tipoContrato = StdIn.readString();
        StdOut.print("Ingrese la fecha de contratación: ");
        String fechaContratacion = StdIn.readString();
        StdOut.print("Ingrese la fecha de finalización de contrato: ");
        String fechaFinalizacion = StdIn.readString();
        Trabajador trabajador = new Trabajador(nombre, edad, tipoContrato, fechaContratacion, fechaFinalizacion);
        for (int i = 0; i < this.listaTrabajador.length; i++) {
            if (this.listaTrabajador[i].getNombre().isEmpty()) {
                this.listaTrabajador[i] = trabajador;
                break;
            }
        }
    }

    /**
     * Permite al usuario renovar el contrato de un trabajador.
     *
     * @param listaTrabajador La lista de trabajadores.
     */
    public void renovarContrato(ListaTrabajador listaTrabajador) {
        StdOut.println("Ingrese el trabajador que desea renovar");
        String nombre = StdIn.readString();
        for (int i = 0; i < listaTrabajador.listaTrabajador.length; i++) {
            if (nombre.equals(this.listaTrabajador[i].getNombre())) {
                StdOut.println("Ingrese nueva fecha de finalización de contrato");
                this.listaTrabajador[i].setFechaFinalizacionContrato(StdIn.readString());
                return;
            } else {
                StdOut.println("Este nombre no existe en la lista");
            }
        }
    }

    /**
     * Permite al usuario otorgar contrato indefinido a un trabajador.
     *
     * @param listaTrabajador La lista de trabajadores.
     */
    public void otorgarContratoIndefinido(ListaTrabajador listaTrabajador) {
        StdOut.println("Ingrese el trabajador al que desea otorgar contrato indefinido: ");
        String nombreProducto = StdIn.readString();
        for (int i = 0; i < listaTrabajador.listaTrabajador.length; i++) {
            if (nombreProducto.equals(this.listaTrabajador[i].getNombre())) {
                this.listaTrabajador[i].setTipoContrato("Indefinido");
                this.listaTrabajador[i].setFechaFinalizacionContrato("Indefinido");
                StdOut.println("El contrato de: " + this.listaTrabajador[i].getNombre() + " ahora es indefinido");
                return;
            }
        }
        StdOut.println("Este nombre no existe en la lista");
    }

    /**
     * Permite al usuario finalizar el contrato de un trabajador.
     *
     * @param listaTrabajador La lista de trabajadores.
     */
    public void finalizarContrato(ListaTrabajador listaTrabajador) {
        StdOut.println("Ingrese nombre del trabajador a finalizar: ");
        String trabajadorFinalizar = StdIn.readString();
        for (int i = 0; i < listaTrabajador.listaTrabajador.length; i++) {
            if (this.listaTrabajador[i].getNombre().equals(trabajadorFinalizar)) {
                Trabajador trabajador = new Trabajador("", 0, "", "", "");
                this.listaTrabajador[i] = trabajador;
            } else {
                StdOut.println("Este nombre no existe en la lista");
            }
        }
    }

    /**
     * Despliega la información de los trabajadores en la lista.
     */
    public void desplegarTrabajadores() {
        for (int i = 0; i < listaTrabajador.length; i++) {
            StdOut.print((i + 1) + ".- Nombre: " + listaTrabajador[i].getNombre() + " Edad: " + listaTrabajador[i].getEdad() + " Tipo de Contrato: " + listaTrabajador[i].getTipoContrato() + " Fecha de contratación: " + listaTrabajador[i].getFechaContratacion() + " Fecha de finalización de contrato: " + listaTrabajador[i].getFechaFinalizacionContrato() + "\n");
        }
    }

    /**
     * Busca un trabajador en la lista por nombre.
     *
     * @param NombreTrabajador El nombre del trabajador a buscar.
     * @return true si el trabajador se encuentra en la lista, false de lo contrario.
     */
    public boolean buscartrabajador(String NombreTrabajador) {
        for (int i = 0; i < listaTrabajador.length; i++) {
            if (listaTrabajador[i].getNombre().equals(NombreTrabajador)) {
                return true;
            }
        }
        return false;
    }
}
