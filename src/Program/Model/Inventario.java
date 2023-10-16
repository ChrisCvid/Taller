package Program.Model;

import edu.princeton.cs.stdlib.StdIn;
import edu.princeton.cs.stdlib.StdOut;

public class Inventario {
    Producto[] inventario;
    int cantidadMaxima =100;
    int cantidadMinima= 1;

    public Inventario(Producto[] inventario , int cantidadMaxima , int cantidadMinima) {
        this.inventario = inventario;
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadMinima = cantidadMinima;
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

    public void ingresarProducto(){
        StdOut.print ("ingrese nombre del producto");
        String nombreProducto = StdIn.readString ();
        StdOut.print ("ingrese precio del producto");
        int precioProducto =StdIn.readInt ();
        StdOut.print ("ingrese categoria del producto");
        String categoriaProducto =StdIn.readString ();
        StdOut.print ("ingrese Stock del producto");
        int StockProducto =StdIn.readInt ();
        Producto Producto=new Producto (nombreProducto,precioProducto,categoriaProducto,StockProducto);

    }
    public void ActualizarProducto(Producto producto){

    }
    public void eliminarProducto(Producto producto){

    }
    /* -Producto[] inventario
          -cantMaxima: int
          -cantActual: int
          --
                  +Inventario()
          +getCantMaxima(): int
          +getCantActual(): int
          +setCantMaxima(): int
          +setCantActual(): int
          +ingresarProducto(Producto producto)
          +actualizarProducto(Producto producto)
          +eliminarProducto(Producto producto)*/
}
