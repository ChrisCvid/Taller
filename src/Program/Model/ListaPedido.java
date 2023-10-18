package Program.Model;

public class ListaPedido {

    private Producto[] listaPedido;

    private int max;

    private int min;

    public ListaPedido(int max) {
        this.max = max;
        this.listaPedido = new Producto[max];
    }

    public Producto[] getListaPedido() {
        return listaPedido;
    }

    public void setListaPedido(Producto[] listaPedido) {
        this.listaPedido = listaPedido;
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

    public void crearListaPedido(ListaPedido listaPedido){
        for (int i =0 ; i <= listaPedido.listaPedido.length ;i++){
            Producto producto  =new Producto ("",0,"",0);
            addProducto (producto);
        }
    }

    public void addProducto(Producto producto){
        for(int i=0;i< listaPedido.length;i++){
            if (listaPedido[i]== null){
                listaPedido[i]=producto;
                return;
            }
        }
    }
}
