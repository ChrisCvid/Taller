package Program.Service;

import Program.Model.*;
import edu.princeton.cs.stdlib.StdIn;
import edu.princeton.cs.stdlib.StdOut;

public class SistemaImpl implements Sistema {

    ListaMesas listaMesas = new ListaMesas (18);
    Inventario inventario =new Inventario (100);
    ListaTrabajador listaTrabajador = new ListaTrabajador(40);

    ListaOrdenes listaOrdenes = new ListaOrdenes(30);

    @Override
    public String coordinarMesas() {
        listaMesas.agregarMesa (listaMesas);
        StdOut.println ("1. buscar mesa\n" + "2. agregar cliente a una mesa:\n" + "3. desplegar lista mesas:  \n"+ "ingrese opcion deseada: ");
        switch (StdIn.readInt ()) {
            case 1:
                StdOut.println ("ingrese numero de la mesa");
                int numero = StdIn.readInt ();
                listaMesas.BuscarMesa (listaMesas , numero);
                break;
            case 2:
                listaMesas.agregarCliente (listaMesas);
                break;
            case 3:
                listaMesas.desplegarMesa ();
                break;
            default:
                StdOut.println ("el valor ingresado no corresponde al formato requerido, por favor reintente");
        }
        return null;
    }

    @Override
    public String gestionarInventario() {
        inventario.crearInventario (inventario);
        StdOut.print(
                "1. agregar Producto:\n" + "2. actualizar producto:\n" + "3. eliminar producto:\n" + "ingrese opcion deseada: ");
        int respuestaGestInv = StdIn.readInt();
        switch (respuestaGestInv) {
            case 1:
                inventario.ingresarProducto (inventario);
                break;
            case 2:
                inventario.ActualizarProducto (inventario);
                break;
            case 3:
                inventario.eliminarProducto (inventario);
                break;
            case 4:
                inventario.desplegarInventario ();
                break;
            default:
                StdOut.println ("el valor ingresado no corresponde al formato requerido, por favor reintente");
        }
        return null;
    }

    @Override
    public String administrarTrabajadores() {
        listaTrabajador.crearListraTrabajador(listaTrabajador);
        StdOut.println ("1. Agregar Trabajador\n" + "2. Renovar contrato:\n" + "3. Otorgar contrato indefinido:  \n" + "4. Finalizar contrato \n" + "5. Desplegar trabajadores \n" + "Ingrese la opcion deseada: ");
        int respuestaAdmiTrabajadores = StdIn.readInt();
        switch (respuestaAdmiTrabajadores) {
            case 1:
                listaTrabajador.agregarTrabajador(listaTrabajador);
                break;
            case 2:
                listaTrabajador.renovarContrato(listaTrabajador);
                break;
            case 3:
                listaTrabajador.otorgarContratoIndefinido(listaTrabajador);
                break;
            case 4:
                listaTrabajador.finalizarContrato(listaTrabajador);
                break;
            case 5:
                listaTrabajador.desplegarTrabajadores();
                break;
            default:
                StdOut.println ("el valor ingresado no corresponde al formato requerido, por favor reintente");
        }
        return null;
    }


    @Override
    public String procesarOrden() {
        StdOut.println("Procesar Orden");
        return null;
    }
}
