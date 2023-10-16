package Model;

public class ListaMesas {
 Mesa[] listaMesas;
 int max;
 int min;

    public ListaMesas(Mesa[] listaMesas , int max , int min) {
        this.listaMesas = listaMesas;
        this.max = max;
        this.min = min;
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

    public void BuscarMesa(){

    }
    /*   -Mesas[] ListaMesas
          -max: int
          -actual: int
          --
          +ListaMesas():
          +getMax(): int
          +getActual(): int
          +getCliente(): String
          +setActual(): int
          +setCliente(): String
          +buscarMesa(): void*/
}
