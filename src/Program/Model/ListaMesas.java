package Program.Model;

import edu.princeton.cs.stdlib.StdIn;
import edu.princeton.cs.stdlib.StdOut;

public class ListaMesas {
 Mesa[] listaMesas;
 int max=18;
 int min = 0;

 int actual = 0;

    public ListaMesas(int max) {
        this.max = max;
        this.listaMesas=new Mesa[max];
    }

    public Mesa[] getListaMesas() {
        return listaMesas;
    }

    public void setListaMesas(Mesa[] listaMesas) {
        this.listaMesas = listaMesas;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }

    public void addMesa(Mesa mesa){
        for(int i=0;i<listaMesas.length;i++){
            if (this.listaMesas[i]==null){
                this.listaMesas[i]= mesa;
                return;
            }
        }
    }
    public int BuscarMesa(ListaMesas Listamesa){
    int numero=StdIn.readInt ();
        for (int i=0;i < this.listaMesas.length;i++){
        if(this.listaMesas[i] != null&& listaMesas[i].getNumero ()==numero){
            return i;
            }
        }
        return -1;
    }

    public void agregarMesa(ListaMesas listaMesas){
              StdOut.print ("ingrese numero de mesa");
              int numeroDeMesa=StdIn.readInt ();
              StdOut.print ("ingrese disponibilidad de mesa");
              boolean estadoDeMesa=StdIn.readBoolean ();
              StdOut.print ("ingrese nombre del cliente");
              String NombreCliente=StdIn.readString ();
              Mesa mesa =new Mesa (numeroDeMesa,estadoDeMesa,NombreCliente);
              addMesa (mesa);

    }
}
