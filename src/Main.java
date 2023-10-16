import edu.princeton.cs.stdlib.*;
import Clases.*;
public class Main {
    public static void main(String[] args) {
      StdOut.print (
              "=========bienvenido=======\n"+
              "1. Coordinar la disponibilidad de las mesas dentro del local: \n" +
              "2. Gestionar inventario: \n" +
              "3. Administración de trabajadores: \n" +
              "4. Procesar las órdenes de los clientes:\n"+
                      "ingrese opcion deseada: ");
        int respuesta= StdIn.readInt ();
        switch (respuesta){
            case 1:
                break;

            case 2:StdOut.print (
                    "1. agregar Producto:\n"+"2. eliminar producto:\n"+"ingrese opcion deseada: ");
            int respuestaGestInv=StdIn.readInt ();
                switch (respuestaGestInv){
                    case 1:
                    break;
                    case 2:
                        StdOut.println ("ingrese producto desea eliminar:");

                    break;
                }
                break;

            case 3:

                break;

            case 4:
                break;

        }
    }
}