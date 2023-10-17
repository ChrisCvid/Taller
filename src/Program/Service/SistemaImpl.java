package Program.Service;

import Program.Model.ListaMesas;
import Program.Model.Mesa;
import edu.princeton.cs.stdlib.StdIn;
import edu.princeton.cs.stdlib.StdOut;

public class SistemaImpl implements Sistema {

    ListaMesas listaMesas = new ListaMesas (18);

    @Override
    public String coordinarMesas() {
        listaMesas.agregarMesa (listaMesas);
        StdOut.println("1. buscar mesa\n" +"2. agregar cliente a una mesa:\n"+ "ingrese opcion deseada: ");
switch (StdIn.readInt ()){
    case 1:
        StdOut.println ("ingrese numero de la mesa");
        int numero=StdIn.readInt ();
        listaMesas.BuscarMesa (listaMesas,numero);
        break;
    case 2:
        listaMesas.agregarCliente (listaMesas);
        break;
    case 3:
        listaMesas.desplegarMesa ();
        break;
        }
        return null;
    }

    @Override
    public String gestionarInventario() {
        StdOut.print(
                "1. agregar Producto:\n" + "2. eliminar producto:\n" + "ingrese opcion deseada: ");
        int respuestaGestInv = StdIn.readInt();
        switch (respuestaGestInv) {
            case 1:
                StdOut.println("Ingrese producto que desea agregar");
                break;
            case 2:
                StdOut.println("ingrese producto desea eliminar:");

                break;
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
