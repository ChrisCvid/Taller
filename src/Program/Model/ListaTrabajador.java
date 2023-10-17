package Program.Model;

public class ListaTrabajador {
    Trabajador[] listaTrabajador;
int max;
int min;

    public ListaTrabajador(Trabajador[] listaTrabajador , int max , int min) {
        this.listaTrabajador = listaTrabajador;
        this.max = max;
        this.min = min;
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
    public boolean renovar() {
        return false;
    }
    public void eliminarTrabajador(){
    }
    public String cambiarContrato(){
        String tipoCeContrato = "";
        return tipoCeContrato;
    }
    }
