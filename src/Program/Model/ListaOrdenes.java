package Program.Model;

import ucn.*;

/**
 * La clase ListaOrdenes representa una lista de órdenes de productos.
 */
public class ListaOrdenes {

    private Orden[] listaOrdenes;
    private int min;
    private int max;

    /**
     * Constructor para crear una lista de órdenes con una capacidad máxima especificada.
     *
     * @param max La capacidad máxima de la lista de órdenes.
     */
    public ListaOrdenes(int max) {
        this.max = max;
        this.listaOrdenes = new Orden[max];

    }
    /**
     * Obtiene la capacidad mínima de la lista de órdenes.
     *
     * @return La capacidad mínima de la lista de órdenes.
     */
    public int getMin() {
        return min;
    }

    /**
     * Establece la capacidad mínima de la lista de órdenes.
     *
     * @param min La capacidad mínima de la lista de órdenes.
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * Obtiene la capacidad máxima de la lista de órdenes.
     *
     * @return La capacidad máxima de la lista de órdenes.
     */
    public int getMax() {
        return max;
    }

    /**
     * Establece la capacidad máxima de la lista de órdenes.
     *
     * @param max La capacidad máxima de la lista de órdenes.
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * Permite a un cliente pedir la cuenta de una mesa.
     */
    public void PedirCuenta(){
        // Implementación de la lógica para pedir la cuenta de una mesa y mostrar el detalle *no hace nada*.
       //Tuvimos problemas al implementar el codigo en la zona comentada "Codigo en cuarentena"//
        int totalPedido;
        String TrabajadorPedido;
        String[] nombreProducto=new String[100];
        int[] valorProducto=new int[100];
        Producto[] pedido;

        StdOut.println ("ingrese numero de mesa que pidio la cuenta:");
        int numeroDeMesa=StdIn.readInt ();
        Orden orden=buscarOrden (numeroDeMesa);


        //Codigo en cuarentena//

        /*pedido=orden.getListaProductos ();
        for(int i=0;i<pedido.length;i++){
        nombreProducto[i]=pedido[i].getNombreProducto ();
        valorProducto[i]=pedido[i].getPrecio ();
        }
        totalPedido=orden.getTotalPedido ();
        TrabajadorPedido=orden.getTrabajador (); */

        //Codigo en cuarentena//


        StdOut.println ("detalle de la cuenta del pedido de la mesa "+numeroDeMesa+"\n"+"el pedido fue tomado por: "+"TrabajadorPedido"+"\nel valor total del consumo fue: "+"totalPedido"+"\n");
        for(int i=0;i<nombreProducto.length;i++) {
            if (nombreProducto[ i ] == null || nombreProducto[ i ].isEmpty ()) {
                break;
            } else {
                StdOut.println ("Producto: " + nombreProducto[ i ] + " " + "Valor: " + valorProducto[ i ]);
            }
        }

    }

    /**
     * Crea la lista de órdenes al inicializar la lista de productos en cada orden.
     *
     * @param listaOrdenes La lista de órdenes a crear.
     */
    public void crearListaOrdenes(ListaOrdenes listaOrdenes) {
        Producto[] productos =new Producto[100];
        for (int i = 0 ; i < productos.length ; i++) {
            Producto producto = new Producto ("" , 0, "",0);
            productos[i]=producto;
        }

        for (int i = 0 ; i < listaOrdenes.listaOrdenes.length ; i++) {
            Orden Orden = new Orden (0 , "" , 0,productos);
            addOrden (Orden);
        }
    }

    /**
     * Permite a un trabajador crear una nueva orden para una mesa.
     *
     * @param listaTrabajador La lista de trabajadores.
     * @param inventario       El inventario de productos.
     * @param listaMesas       La lista de mesas.
     */
    public void crearPedido(ListaTrabajador listaTrabajador, Inventario inventario,ListaMesas listaMesas) {
        int ContPedido = 0,totalPedido=0;
        int[] cantidadProducto=new int[100];
        String[] nombreProducto=new String[100];
        String trabajadorPedido,respuesta="";
        Producto[] Pedido=new Producto[100];


        StdOut.println ("ingrese nombre de trabajador encargado del pedido");
        trabajadorPedido = StdIn.readString ();
        if (!listaTrabajador.buscartrabajador (trabajadorPedido)) {
            StdOut.println ("el trabajador no existe");
            return;
        }
        StdOut.println ("ingrese numero de mesa del pedido: ");
        int numeroDeMesa=StdIn.readInt ();
        if (listaMesas.BuscarMesa (listaMesas,numeroDeMesa)) {
            return;
        }

        while (!respuesta.equals ("no")) {
            StdOut.println ("ingrese nombre del producto deseado por el cliente: ");
            nombreProducto[ ContPedido ] = StdIn.readString ();

            StdOut.println ("ingrese cantidad del producto deseado: ");
            cantidadProducto[ ContPedido ] = StdIn.readInt ();

            if (inventario.buscarProducto (nombreProducto[ ContPedido ] , cantidadProducto[ ContPedido ])==null) {
                StdOut.println ("el producto ingresado no existe o el stock requerido no se encuentra disponible");
                nombreProducto[ ContPedido ] = null;
                cantidadProducto[ ContPedido ] = 0;
            }
            Pedido[ContPedido]=inventario.buscarProducto (nombreProducto[ ContPedido ] , cantidadProducto[ ContPedido ]);
            totalPedido+=(Pedido[ContPedido].getPrecio ()*cantidadProducto[ContPedido]);
            ContPedido++;
            StdOut.println ("desea agregar otro producto: (si/no)");
            respuesta = StdIn.readString ();
        }

        resumenPedido (ContPedido , cantidadProducto , nombreProducto);
        listaMesas.ocuparMesa (listaMesas,numeroDeMesa);
        Orden orden =new Orden (totalPedido,trabajadorPedido,numeroDeMesa,Pedido);

        addOrden (orden);
    }

    /**
     * Muestra un resumen del pedido en la salida estándar.
     *
     * @param ContPedido        El número de elementos en el pedido.
     * @param cantidadProducto   Un arreglo que contiene la cantidad de cada producto.
     * @param nombreProducto     Un arreglo que contiene el nombre de cada producto.
     */
    private static void resumenPedido(int ContPedido , int[] cantidadProducto , String[] nombreProducto) {
        StdOut.println ("resumen pedido: \n");
        for (int i = 0 ; i< ContPedido ; i++){
            StdOut.println (cantidadProducto[i]+" "+ nombreProducto[i]+" ");
        }
    }


    /**
     * Agrega una orden a la lista de órdenes.
     *
     * @param orden La orden a agregar.
     */
    public void addOrden(Orden orden) {
        for (int i = 0 ; i < this.listaOrdenes.length ; i++) {
            if (listaOrdenes[ i ] == null) {
                listaOrdenes[ i ] = orden;
                return;
            }
        }
    }

    /**
     * Busca una orden en la lista de órdenes por número de mesa.
     *
     * @param numerodeMesa El número de mesa de la orden a buscar.
     * @return La orden correspondiente al número de mesa especificado, o null si no se encuentra.
     */
    public Orden buscarOrden(int numerodeMesa) {
        for (int i = 1 ; i < listaOrdenes.length ; i++) {
            if (listaOrdenes[ i ].getNumeroMesa () == numerodeMesa) {
                return listaOrdenes[ i ];
            }
        }
    return null;
    }
}
