package Model;

public class Orden {
   int totalPedido;
   String Trabajador;
   int numeroMesa;
   Producto[] listaPedido;
   int max;
   int min;

    public Orden(int totalPedido , String trabajador , int numeroMesa , Producto[] listaPedido , int max , int min) {
        this.totalPedido = totalPedido;
        Trabajador = trabajador;
        this.numeroMesa = numeroMesa;
        this.listaPedido = listaPedido;
        this.max = max;
        this.min = min;
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

    public int getMax() {
        return max;
    }
    public int calcularTotal(){
        int Total=0;
        return Total;
    }
    /* -totalPedido: int
          -trabajador: String
          -numeroMesa: int
          -Producto[] ListaPedido
          -max: int
          -actual: int
          --
                  +Orden()
          +getTotalPedido(): int
          +getTrabajador(): String
          +getNumeroMesa(): int
          +getMax(): int
          +getActual(): int
          +calcularTotal(): int*/
}
