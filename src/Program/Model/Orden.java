package Program.Model;

import edu.princeton.cs.stdlib.StdOut;

public class Orden {
   private int totalPedido;
   private String Trabajador;
   private int numeroMesa;
   private Producto[] listaPedido;


    public Orden(int totalPedido , String trabajador , int numeroMesa , Producto[] listaPedido , int max) {
        this.totalPedido = totalPedido;
        Trabajador = trabajador;
        this.numeroMesa = numeroMesa;
        this.listaPedido = new Producto[max];
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

    public Producto[] getListaPedido() {
        return listaPedido;
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

    public void setListaPedido(Producto[] listaPedido) {
        this.listaPedido = listaPedido;
    }





    public int calcularTotal(){
        int Total=0;
        return Total;
    }
}
