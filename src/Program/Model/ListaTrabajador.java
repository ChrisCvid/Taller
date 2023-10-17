package Program.Model;

public class ListaTrabajador {
    private Trabajador[] listaTrabajador;
    private int max;
    private int min;

    public ListaTrabajador(int max) {
        this.max = max;
        this.listaTrabajador = new Trabajador[max];
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
