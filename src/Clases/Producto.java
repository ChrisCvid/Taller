package Clases;

public class Producto {
    private String nombreProducto;
    private int precio;
    private String categoria;
    private int stock;

    public Producto(String nombreProducto , int precio , String categoria , int stock) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


}
