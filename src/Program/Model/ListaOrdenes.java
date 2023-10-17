package Program.Model;

public class ListaOrdenes {
    Orden[] ListaOrdenes;
    int min;
    int max;



    public ListaOrdenes(Orden[] listaOrdenes , int min , int max) {
        ListaOrdenes = listaOrdenes;
        this.min = min;
        this.max = max;

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
