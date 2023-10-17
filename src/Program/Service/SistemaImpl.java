package Program.Service;

import Program.Model.Inventario;
import Program.Model.ListaMesas;
import Program.Model.Mesa;
import edu.princeton.cs.stdlib.StdIn;
import edu.princeton.cs.stdlib.StdOut;

public class SistemaImpl implements Sistema {

    ListaMesas listaMesas = new ListaMesas (18);
    Inventario inventario =new Inventario (100);

    @Override
    public String coordinarMesas() {
        listaMesas.agregarMesa (listaMesas);
        StdOut.println ("1. buscar mesa\n" + "2. agregar cliente a una mesa:\n" + "ingrese opcion deseada: ");
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
                "1. agregar Producto:\n" + "2. eliminar producto:\n" + "ingrese opcion deseada: ");
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
        StdOut.println("Administrar trabajadores");

        return null;
    }

    @Override
    public String procesarOrden() {
        StdOut.println("Procesar Orden");
        return null;
    }
}
