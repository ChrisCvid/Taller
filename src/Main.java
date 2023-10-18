import Program.Model.*;
import ucn.*;

import Program.Service.Sistema;
import Program.Util.Instalador;

public class Main {

    /**
     * Método principal que inicia la aplicación.
     *
     */
    public static void main(String[] args) {
        Sistema sistemaDelNegocio = instalarSistema();
        menuDelSistemaa(sistemaDelNegocio);
    }

    /**
     * Instala el sistema del negocio llamando al instalador.
     *
     * @return La instancia del sistema instalado.
     */
    private static Sistema instalarSistema(){
        Instalador instalador = new Instalador();
        return instalador.inyectarSistema();
    }

    /**
     * Muestra un menú y gestiona las opciones del sistema.
     *
     * @param sistemaDelNegocio La instancia del sistema del negocio.
     */
    private static void menuDelSistemaa(Sistema sistemaDelNegocio){
        sistemaDelNegocio.crearListas ();
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

    /**
     * Ejecuta la función uno del sistema del negocio.
     *
     * @param sistemaDelNegocio La instancia del sistema del negocio.
     */
    private static void funcionUno(Sistema sistemaDelNegocio){
        String respuestaSistema = sistemaDelNegocio.coordinarMesas();

    }

    /**
     * Ejecuta la función dos del sistema del negocio.
     *
     * @param sistemaDelNegocio La instancia del sistema del negocio.
     */
    private static void funcionDos(Sistema sistemaDelNegocio){
        String respuestaSistema = sistemaDelNegocio.gestionarInventario();
    }

    /**
     * Ejecuta la función tres del sistema del negocio.
     *
     * @param sistemaDelNegocio La instancia del sistema del negocio.
     */
    private static void funcionTres(Sistema sistemaDelNegocio){
        String respuestaSistema = sistemaDelNegocio.administrarTrabajadores();
    }

    /**
     * Ejecuta la función cuatro del sistema del negocio.
     *
     * @param sistemaDelNegocio La instancia del sistema del negocio.
     */
    private static void funcionCuatro(Sistema sistemaDelNegocio){
        String respuestaSistema = sistemaDelNegocio.procesarOrden();

    }
}


