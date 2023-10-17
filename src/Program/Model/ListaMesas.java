package Program.Model;

import edu.princeton.cs.stdlib.StdIn;
import edu.princeton.cs.stdlib.StdOut;

public class ListaMesas {
 private Mesa[] listaMesas;
 private int max=18;
 private int min = 0;

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
                StdOut.print (listaMesas[i].isDisponibilidad ()+" "+listaMesas[i].getEdadCliente ()+" "+listaMesas[i].getCliente ()+" "+listaMesas[i].getNumero ()+"\n");
                return;
            }
        }
    }
    public boolean BuscarMesa(ListaMesas Listamesa,int numero){
        if(!listaMesas[ numero ].isDisponibilidad ()){
            StdOut.println ("la mesa esta disponible");
            return false;
        }else{StdOut.println ("la mesa esta ocupada");
        return true;
    }
        /* for (int i=0;i < this.listaMesas.length;i++){
        if(this.listaMesas[i] != null&& !listaMesas[ i ].isDisponibilidad ()){
            StdOut.println (" mesa disponible");
            return i;

            }else{StdOut.println ("no disponible");

            return -1;
            }
        }*/
    }
    public void agregarCliente(ListaMesas listaMesas){
        StdOut.println ("ingrese numero de la mesa");
        int numero=StdIn.readInt ();
        if(!BuscarMesa (listaMesas , numero)){;
        StdOut.print ("ingrese nombre del cliente");
        String cliente= StdIn.readString ();
        StdOut.print ("ingrese edad del cliente");
        int edadCliente=StdIn.readInt ();
        this.listaMesas[numero].setCliente (cliente);
        this.listaMesas[numero].setEdadCliente (edadCliente);
        this.listaMesas[numero].setDisponibilidad (true);
        }

    }

    public void agregarMesa(ListaMesas listaMesas){
              for (int i =0 ; i <= listaMesas.listaMesas.length ;i++){
              Mesa mesa =new Mesa (i,false,null,0);
              addMesa (mesa);}

    }
    public void desplegarMesa(){
        for(int i=0;i< listaMesas.length ; i++){
                StdOut.print (listaMesas[i].isDisponibilidad()+" "+listaMesas[i].getCliente()+" "+listaMesas[i].getNumero()+" "+listaMesas[i].getEdadCliente ()+"\n");
            }
    }
}
