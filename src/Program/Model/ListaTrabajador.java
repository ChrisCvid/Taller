package Program.Model;

import edu.princeton.cs.stdlib.StdIn;
import edu.princeton.cs.stdlib.StdOut;

public class ListaTrabajador {
    private Trabajador[] listaTrabajador;
    private int max;
    private int min;

    public ListaTrabajador(int max) {
        this.max = max;
        this.listaTrabajador = new Trabajador[ max ];
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

    public void crearListaTrabajador(ListaTrabajador listaTrabajador) {
        for (int i = 0 ; i <= listaTrabajador.listaTrabajador.length ; i++) {
            Trabajador trabajador = new Trabajador ("" , 0 , "" , "" , "");
            addTrabajador (trabajador);
        }
    }

    public void addTrabajador(Trabajador trabajador) {
        for (int i = 0 ; i < listaTrabajador.length ; i++) {
            if (listaTrabajador[ i ] == null) {
                listaTrabajador[ i ] = trabajador;
                return;
            }
        }
    }

    public void agregarTrabajador(ListaTrabajador listaTrabajador) {
        StdOut.print ("ingrese nombre del trabajador: ");
        String nombre = StdIn.readString ();
        StdOut.print ("ingrese la edad del trabajador: ");
        int edad = StdIn.readInt ();
        StdOut.print ("ingrese el tipo de contrato: ");
        String tipoContrato = StdIn.readString ();
        StdOut.print ("ingrese la fecha de contratacion: ");
        String fechaContratacion = StdIn.readString ();
        StdOut.print ("ingrese la fecha de finalizacion de contrato: ");
        String fechaFinalizacion = StdIn.readString ();
        Trabajador trabajador = new Trabajador (nombre , edad , tipoContrato , fechaContratacion , fechaFinalizacion);
        for (int i = 0 ; i < this.listaTrabajador.length ; i++) {
            if (this.listaTrabajador[ i ].getNombre ().isEmpty ()) {
                this.listaTrabajador[ i ] = trabajador;
                break;
            }
        }
    }

    public void renovarContrato(ListaTrabajador listaTrabajador) {
        StdOut.println ("Ingrese el trabajador que desea renovar");
        String nombre = StdIn.readString ();
        for (int i = 0 ; i < listaTrabajador.listaTrabajador.length ; i++) {
            if (nombre.equals (this.listaTrabajador[ i ].getNombre ())) {

                StdOut.println ("ingrese nueva fecha finalizacion de contrato");
                this.listaTrabajador[ i ].setFechaFinalizacionContrato (StdIn.readString ());
                return;
            } else {
                StdOut.println ("Este nombre no existe en la lista");
            }
        }
    }

    public void otorgarContratoIndefinido(ListaTrabajador listaTrabajador) {
        StdOut.println ("Ingrese el trabajador al que desea otorgar el contrato indefinido: ");
        String nombreProducto = StdIn.readString ();
        for (int i = 0 ; i < listaTrabajador.listaTrabajador.length ; i++) {
            if (nombreProducto.equals (this.listaTrabajador[ i ].getNombre ())) {
                this.listaTrabajador[ i ].setTipoContrato ("Indefinido");
                this.listaTrabajador[ i ].setFechaFinalizacionContrato ("Indefinido");
                StdOut.println ("El contrato de: " + this.listaTrabajador[ i ].getNombre () + " ahora es indefinido");
                return;

            }
        }
        StdOut.println ("Este nombre no existe en la lista");
    }

    public void finalizarContrato(ListaTrabajador listaTrabajador) {
        StdOut.println ("ingrese nombre del trabajador a finalizar: ");
        String trabajadorFinalizar = StdIn.readString ();
        for (int i = 0 ; i < listaTrabajador.listaTrabajador.length ; i++) {
            if (this.listaTrabajador[ i ].getNombre ().equals (trabajadorFinalizar)) {
                Trabajador trabajador = new Trabajador ("" , 0 , "" , "" , "");
                this.listaTrabajador[ i ] = trabajador;
            } else {
                StdOut.println ("Este nombre no existe en la lista");
            }
        }
    }

    public void desplegarTrabajadores() {
        for (int i = 0 ; i < listaTrabajador.length ; i++) {
            StdOut.print ((i + 1) + ".- Nombre: " + listaTrabajador[ i ].getNombre () + " Edad: " + listaTrabajador[ i ].getEdad () + " Tipo de Contrato: " + listaTrabajador[ i ].getTipoContrato () + " Fecha de contratacion: " + listaTrabajador[ i ].getFechaContratacion () + " Fecha finalizacion de contrato: " + listaTrabajador[ i ].getFechaFinalizacionContrato () + "\n");
        }
    }


   public boolean buscartrabajador(String NombreTrabajador){
       for (int i = 0 ; i < listaTrabajador.length ; i++) {
        if(listaTrabajador[i].getNombre ().equals (NombreTrabajador)){
            return true;
        }
       }
       return false;
   }
}