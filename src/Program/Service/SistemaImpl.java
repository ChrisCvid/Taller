package Program.Service;

import Program.Model.*;
import ucn.*;

/**
 * Implementación de la interfaz Sistema que gestiona un sistema de negocio.
 */
public class SistemaImpl implements Sistema {

    ListaMesas listaMesas = new ListaMesas (18);
    Inventario inventario = new Inventario (100);
    ListaTrabajador listaTrabajador = new ListaTrabajador (100);
    ListaOrdenes listaOrdenes = new ListaOrdenes (100);


    /**
     * {@inheritDoc}
     */
    @Override
    public String crearListas() {
        // Llama metodos que crean las listas necesarias para el funcionamiento del sistema.
        listaMesas.agregarMesa (listaMesas);
        inventario.crearInventario (inventario);
        listaTrabajador.crearListaTrabajador (listaTrabajador);
        listaOrdenes.crearListaOrdenes (listaOrdenes);
        return null;
    }

    @Override
    public String coordinarMesas() {
        // Permite al usuario coordinar las mesas dentro del local.
        StdOut.println ("1. buscar mesa\n" + "2. agregar cliente a una mesa:\n" + "3. desplegar lista mesas:  \n" + "ingrese opcion deseada: ");
        switch (StdIn.readInt ()) {
            case 1:
                // Busca una mesa por número.
                StdOut.print ("ingrese numero de la mesa: ");
                int numero = StdIn.readInt ();
                listaMesas.BuscarMesa (listaMesas , numero);
                break;
            case 2:
                // Agrega un cliente a una mesa.
                listaMesas.agregarCliente (listaMesas);
                break;
            case 3:
                // Despliega la lista de mesas.
                listaMesas.desplegarMesa ();
                break;
            default:
                StdOut.println ("el valor ingresado no corresponde al formato requerido, por favor reintente");
        }
        return null;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public String gestionarInventario() {
        // Permite al usuario gestionar el inventario del negocio.
        StdOut.print (
                "1. agregar Producto:\n" + "2. actualizar producto:\n" + "3. eliminar producto:\n" + "4. Desplegar Inventario:\n"+ "ingrese opcion deseada: ");
        int respuestaGestInv = StdIn.readInt ();
        switch (respuestaGestInv) {
            case 1:
                // Agrega un producto al inventario.
                inventario.ingresarProducto (inventario);
                break;
            case 2:
                // Actualiza un producto en el inventario.
                inventario.ActualizarProducto (inventario);
                break;
            case 3:
                // Elimina un producto del inventario.
                inventario.eliminarProducto (inventario);
                break;
            case 4:
                // Desplega el inventario.
                inventario.desplegarInventario ();
                break;
            default:
                StdOut.println ("el valor ingresado no corresponde al formato requerido, por favor reintente");
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String administrarTrabajadores() {
        // Permite al usuario administrar a los trabajadores del negocio.
        StdOut.println ("1. Agregar Trabajador\n" + "2. Renovar contrato:\n" + "3. Otorgar contrato indefinido:  \n" + "4. Finalizar contrato \n" + "5. Desplegar trabajadores \n" + "Ingrese la opcion deseada: ");
        int respuestaAdmiTrabajadores = StdIn.readInt ();
        switch (respuestaAdmiTrabajadores) {
            case 1:
                // Agrega un trabajador.
                listaTrabajador.agregarTrabajador (listaTrabajador);
                break;
            case 2:
                // Renueva el contrato de un trabajador.
                listaTrabajador.renovarContrato (listaTrabajador);
                break;
            case 3:
                // Otorga contrato indefinido a un trabajador
                listaTrabajador.otorgarContratoIndefinido (listaTrabajador);
                break;
            case 4:
                // Finaliza contrato de un trabajador.
                listaTrabajador.finalizarContrato (listaTrabajador);
                break;
            case 5:
                // Despliega la lista de trabajadores.
                listaTrabajador.desplegarTrabajadores ();
                break;
            default:
                StdOut.println ("el valor ingresado no corresponde al formato requerido, por favor reintente");
        }
        return null;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public String procesarOrden() {
        // Permite al usuario procesar órdenes de los clientes.
        StdOut.println("1. Crear pedido:\n" + "2. Pedir cuenta:");
        int respuestaCliente = StdIn.readInt();
        switch (respuestaCliente) {
            case 1:
                // Permite crear un pedido utilizando trabajadores, inventario y mesas.
                listaOrdenes.crearPedido(listaTrabajador, inventario, listaMesas);
                break;
            case 2:
                // Permite a los clientes pedir la cuenta *no hace nada*.
                listaOrdenes.PedirCuenta();
                break;
        }
        return null;
    }
}