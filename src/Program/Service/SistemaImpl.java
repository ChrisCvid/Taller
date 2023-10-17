package Program.Service;

import Program.Model.ListaMesas;
import Program.Model.Mesa;
import edu.princeton.cs.stdlib.StdIn;
import edu.princeton.cs.stdlib.StdOut;

public class SistemaImpl implements Sistema {

    ListaMesas listaMesas =new ListaMesas (18);

    @Override
    public String coordinarMesas() {

        StdOut.println(" \"1. agregar mesa:\n" +"2. desocupar mesa\n"+ "ingrese opcion deseada: ");
        this.listaMesas.agregarMesa (listaMesas);




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
