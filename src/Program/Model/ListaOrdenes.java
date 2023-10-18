package Program.Model;

import Program.Model.Orden;

public class ListaOrdenes {

    ListaPedido listaPedido = new ListaPedido(40);
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
    public void generarResumen(){

    }
    public boolean buscarOrden(int NumeroDeorden){
        boolean buscarOrden =false;
        return buscarOrden ;
    }
    public Boolean PedirCuenta(){
        boolean pedirCuenta = false;
        return pedirCuenta;
    }


}
