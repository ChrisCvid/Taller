package Program.Model;

public class ListaMesas {
 Mesa[] listaMesas;
 int max;
 int min = 0;

 int actual = 0;

    public ListaMesas(int max) {
        this.max = max;
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

    public void BuscarMesa(){

    }

    public void agregarMesa(){

    }
}
