import Program.Model.ListaMesas;
import edu.princeton.cs.stdlib.*;

import Program.Service.Sistema;
import Program.Util.Instalador;

public class Main {

    public static void main(String[] args) {
        Sistema sistemaDelNegocio = instalarSistema();
        menuDelSistemaa(sistemaDelNegocio);
    }

    private static Sistema instalarSistema(){
        Instalador instalador = new Instalador();
        return instalador.inyectarSistema();
    }

    private static void menuDelSistemaa(Sistema sistemaDelNegocio){
        boolean menuActivo = true;

        while (menuActivo){
            StdOut.print(
                    "=========bienvenido=======\n" +
                            "1. Coordinar la disponibilidad de las mesas dentro del local: \n" +
                            "2. Gestionar inventario: \n" +
                            "3. Administración de trabajadores: \n" +
                            "4. Procesar las órdenes de los clientes:\n" +
                            "5. Salir\n" +
                            "ingrese opcion deseada: ");
            int respuesta = StdIn.readInt();
            switch (respuesta) {
                case 1: funcionUno(sistemaDelNegocio);
                    break;

                case 2: funcionDos(sistemaDelNegocio);

                    break;

                case 3: funcionTres(sistemaDelNegocio);

                    break;

                case 4: funcionCuatro(sistemaDelNegocio);
                    break;

                case 5:
                    menuActivo = false;
            }
        }
    }

    private static void funcionUno(Sistema sistemaDelNegocio){
        String respuestaSistema = sistemaDelNegocio.coordinarMesas();

    }

    private static void funcionDos(Sistema sistemaDelNegocio){
        String respuestaSistema = sistemaDelNegocio.gestionarInventario();
    }

    private static void funcionTres(Sistema sistemaDelNegocio){
        String respuestaSistema = sistemaDelNegocio.administrarTrabajadores();
    }

    private static void funcionCuatro(Sistema sistemaDelNegocio){
        String respuestaSistema = sistemaDelNegocio.procesarOrden();

    }
}

/*Ni puta idea de como voy a implementar todo eso ඞඞඞ */

