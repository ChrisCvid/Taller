package Program.Model;

import edu.princeton.cs.stdlib.StdIn;
import edu.princeton.cs.stdlib.StdOut;

public class Inventario {
    private Producto[] inventario;
    private int cantidadMaxima ;
    private int cantidadMinima= 1;

    public Inventario(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
        this.inventario = new Producto[cantidadMaxima];

    }

    public Producto[] getInventario() {
        return inventario;
    }

    public void setInventario(Producto[] inventario) {
        this.inventario = inventario;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }

    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    public void crearInventario(Inventario inventario){
        for (int i =0 ; i <= inventario.inventario.length ;i++){
            Producto producto  =new Producto ("",0,"",0);
            addProducto (producto);
        }

    }
    public void ingresarProducto(Inventario inventario){
        StdOut.print ("ingrese nombre del producto");
        String nombreProducto = StdIn.readString ();
        StdOut.print ("ingrese precio del producto");
        int precioProducto =StdIn.readInt ();
        StdOut.print ("ingrese categoria del producto");
        String categoriaProducto =StdIn.readString ();
        StdOut.print ("ingrese Stock del producto");
        int StockProducto =StdIn.readInt ();
        Producto producto = new Producto (nombreProducto,precioProducto,categoriaProducto,StockProducto);
        for(int i=0;i< this.inventario.length;i++) {
            if (this.inventario[ i ].getNombreProducto ().isEmpty ()) {
                this.inventario[ i ]=producto;
                break;
            }
        }

    }
    public void addProducto(Producto producto){
        for(int i=0;i< inventario.length;i++){
            if (inventario[i]== null){
                inventario[i]=producto;
                return;
            }
        }
    }
    public void ActualizarProducto(Inventario inventario){
        StdOut.println("Ingrese producto que desea actualizar");
        String nombreProducto=StdIn.readString ();
        for (int i=0;i<inventario.inventario.length;i++){
            if(nombreProducto.equals (this.inventario[i].getNombreProducto ())){
                StdOut.println ("ingrese nuevo precio");
                this.inventario[i].setPrecio (StdIn.readInt ());
                StdOut.println ("ingrese nueva categoria");
                this.inventario[i].setCategoria (StdIn.readString ());
                StdOut.println ("ingrese Stock");
                this.inventario[i].setStock (StdIn.readInt ());
                return;
            }

        }


    }
    public void eliminarProducto(Inventario inventario){
        StdOut.println ("ingrese nombre de producto a eliminar: ");
        String productoEliminar= StdIn.readString ();
        for (int i =0;i<inventario.inventario.length;i++){
            if(this.inventario[i].getNombreProducto ().equals (productoEliminar)){
                this.inventario[i].setNombreProducto ("");
                this.inventario[i].setStock (0);
                this.inventario[i].setCategoria ("");
                this.inventario[i].setPrecio (0);
            }
        }

    }

    public void desplegarInventario(){
        for(int i=0;i< inventario.length ; i++){
          StdOut.println (inventario[i].getNombreProducto ()+" "+inventario[i].getPrecio ()+" "+inventario[i].getCategoria ()+" "+inventario[i].getStock ()+"\n");
        }
    }
}
