package Program.Model;

/**
 * La clase Producto representa un artículo disponible en el inventario del negocio.
 */
public class Producto {
    private String nombreProducto;
    private int precio;
    private String categoria;
    private int stock;

    /**
     * Constructor para crear un objeto Producto con información sobre el producto.
     *
     * @param nombreProducto El nombre del producto.
     * @param precio         El precio del producto.
     * @param categoria      La categoría a la que pertenece el producto.
     * @param stock          La cantidad en stock del producto.
     */
    public Producto(String nombreProducto, int precio, String categoria, int stock) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return El nombre del producto.
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Establece el nombre del producto.
     *
     * @param nombreProducto El nombre del producto.
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * Obtiene el precio del producto.
     *
     * @return El precio del producto.
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto.
     *
     * @param precio El precio del producto.
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Obtiene la categoría del producto.
     *
     * @return La categoría del producto.
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Establece la categoría del producto.
     *
     * @param categoria La categoría del producto.
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Obtiene la cantidad en stock del producto.
     *
     * @return La cantidad en stock del producto.
     */
    public int getStock() {
        return stock;
    }

    /**
     * Establece la cantidad en stock del producto.
     *
     * @param stock La cantidad en stock del producto.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
}