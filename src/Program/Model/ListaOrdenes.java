package Program.Model;

import edu.princeton.cs.stdlib.StdIn;
import edu.princeton.cs.stdlib.StdOut;

public class ListaOrdenes {

    private Orden[] listaOrdenes;
    private int min;
    private int max;


    public ListaOrdenes(int max) {
        this.max = max;
        this.listaOrdenes = new Orden[max];

    }
    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void PedirCuenta(){
        int totalPedido;
        String TrabajadorPedido;
        String[] nombreProducto=new String[100];
        int[] valorProducto=new int[100];
        Producto[] pedido;

        StdOut.println ("ingrese numero de mesa que pidio la cuenta:");
        int numeroDeMesa=StdIn.readInt ();
        Orden orden=buscarOrden (numeroDeMesa);


        pedido=orden.getListaProductos ();
        for(int i=0;i<pedido.length;i++){
        nombreProducto[i]=pedido[i].getNombreProducto ();
        valorProducto[i]=pedido[i].getPrecio ();
        }
        totalPedido=orden.getTotalPedido ();
        TrabajadorPedido=orden.getTrabajador ();

        StdOut.println ("detalle de la cuenta del pedido de la mesa "+numeroDeMesa+"\n"+"el pedido fue tomado por: "+TrabajadorPedido+"\nel valor total del consumo fue: "+totalPedido+"\n");
        for(int i=0;i<nombreProducto.length;i++) {
            if (nombreProducto[ i ] == null || nombreProducto[ i ].isEmpty ()) {
                break;
            } else {
                StdOut.println ("Producto: " + nombreProducto[ i ] + " " + "Valor: " + valorProducto[ i ]);
            }
        }

    }
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

    private static void resumenPedido(int ContPedido , int[] cantidadProducto , String[] nombreProducto) {
        StdOut.println ("resumen pedido: \n");
        for (int i = 0 ; i< ContPedido ; i++){
            StdOut.println (cantidadProducto[i]+" "+ nombreProducto[i]+" ");
        }
    }



    public void addOrden(Orden orden) {
        for (int i = 0 ; i < this.listaOrdenes.length ; i++) {
            if (listaOrdenes[ i ] == null) {
                listaOrdenes[ i ] = orden;
                return;
            }
        }
    }
    public Orden buscarOrden(int numerodeMesa) {
        for (int i = 1 ; i < listaOrdenes.length ; i++) {
            if (listaOrdenes[ i ].getNumeroMesa () == numerodeMesa) {
                return listaOrdenes[ i ];
            }
        }
    return null;
    }
}
