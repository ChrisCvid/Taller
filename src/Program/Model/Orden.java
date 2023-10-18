package Program.Model;

import edu.princeton.cs.stdlib.StdOut;

public class Orden {


    private int totalPedido;
    private String Trabajador;
    private int numeroMesa;

    private Producto[] listaProductos;




    public Orden(int totalPedido , String trabajador , int numeroMesa, Producto[] listaProductos) {
        this.totalPedido = totalPedido;
        this.Trabajador = trabajador;
        this.numeroMesa = numeroMesa;
        this.listaProductos = listaProductos;

    }


    public int getTotalPedido() {
        return totalPedido;
    }

    public String getTrabajador() {
        return Trabajador;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }
    public Producto[] getListaProductos() {
        return listaProductos;
    }


    public void setTotalPedido(int totalPedido) {
        this.totalPedido = totalPedido;
    }

    public void setTrabajador(String trabajador) {
        Trabajador = trabajador;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }




}




