package Program.Model;

import ucn.*;
/**
 * La clase Inventario representa el inventario de productos disponibles en el negocio.
 */
public class Inventario {
    private Producto[] inventario;
    private int cantidadMaxima;
    private int cantidadMinima = 1;

    /**
     * Constructor para crear un objeto Inventario con una cantidad máxima de productos.
     *
     * @param cantidadMaxima La cantidad máxima de productos que el inventario puede contener.
     */
    public Inventario(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
        this.inventario = new Producto[cantidadMaxima];
    }

    /**
     * Obtiene el arreglo de productos del inventario.
     *
     * @return El arreglo de productos del inventario.
     */
    public Producto[] getInventario() {
        return inventario;
    }

    /**
     * Establece el arreglo de productos del inventario.
     *
     * @param inventario El arreglo de productos del inventario.
     */
    public void setInventario(Producto[] inventario) {
        this.inventario = inventario;
    }

    /**
     * Obtiene la cantidad máxima de productos que el inventario puede contener.
     *
     * @return La cantidad máxima de productos en el inventario.
     */
    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    /**
     * Establece la cantidad máxima de productos que el inventario puede contener.
     *
     * @param cantidadMaxima La cantidad máxima de productos en el inventario.
     */
    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    /**
     * Obtiene la cantidad mínima de productos permitidos.
     *
     * @return La cantidad mínima de productos permitidos.
     */
    public int getCantidadMinima() {
        return cantidadMinima;
    }

    /**
     * Establece la cantidad mínima de productos permitidos.
     *
     * @param cantidadMinima La cantidad mínima de productos permitidos.
     */
    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    /**
     * Crea el inventario, inicializando todos los productos con valores por defecto.
     *
     * @param inventario El inventario que se va a crear.
     */
    public void crearInventario(Inventario inventario) {
        for (int i = 0; i <= inventario.inventario.length; i++) {
            Producto producto = new Producto("", 0, "", 0);
            addProducto(producto);
        }
    }

    /**
     * Permite ingresar un nuevo producto al inventario.
     *
     * @param inventario El inventario al que se agregará el producto.
     */
    public void ingresarProducto(Inventario inventario) {
        StdOut.println("Ingrese nombre del producto: ");
        String nombreProducto = StdIn.readString();
        StdOut.println("Ingrese precio del producto: ");
        int precioProducto = StdIn.readInt();
        StdOut.println("Ingrese categoría del producto: ");
        String categoriaProducto = StdIn.readString();
        StdOut.println("Ingrese Stock del producto: ");
        int stockProducto = StdIn.readInt();
        Producto producto = new Producto(nombreProducto, precioProducto, categoriaProducto, stockProducto);
        for (int i = 0; i < this.inventario.length; i++) {
            if (this.inventario[i].getNombreProducto().isEmpty()) {
                this.inventario[i] = producto;
                break;
            }
        }
    }

    /**
     * Agrega un producto al inventario.
     *
     * @param producto El producto que se agregará al inventario.
     */
    public void addProducto(Producto producto) {
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] == null) {
                inventario[i] = producto;
                return;
            }
        }
    }

    /**
     * Actualiza la información de un producto en el inventario.
     *
     * @param inventario El inventario que contiene el producto a actualizar.
     */
    public void ActualizarProducto(Inventario inventario) {
        StdOut.println("Ingrese el producto que desea actualizar: ");
        String nombreProducto = StdIn.readString();
        for (int i = 0; i < inventario.inventario.length; i++) {
            if (nombreProducto.equals(this.inventario[i].getNombreProducto())) {
                StdOut.println("Ingrese nuevo precio: ");
                this.inventario[i].setPrecio(StdIn.readInt());
                StdOut.println("Ingrese nueva categoría: ");
                this.inventario[i].setCategoria(StdIn.readString());
                StdOut.println("Ingrese Stock: ");
                this.inventario[i].setStock(StdIn.readInt());
                return;
            }
        }
    }

    /**
     * Elimina un producto del inventario.
     *
     * @param inventario El inventario que contiene el producto a eliminar.
     */
    public void eliminarProducto(Inventario inventario) {
        StdOut.println("Ingrese el nombre del producto a eliminar: ");
        String productoEliminar = StdIn.readString();
        for (int i = 0; i < inventario.inventario.length; i++) {
            if (this.inventario[i].getNombreProducto().equals(productoEliminar)) {
                Producto producto = new Producto("", 0, "", 0);
                this.inventario[i] = producto;
            }
        }
    }

    /**
     * Despliega la información de los productos en el inventario.
     */
    public void desplegarInventario() {
        for (int i = 0; i < inventario.length; i++) {
            StdOut.println("Nombre: "+inventario[i].getNombreProducto() + " Precio: $" + inventario[i].getPrecio() + " Categoria: " + inventario[i].getCategoria() + " Stock: " + inventario[i].getStock() + "\n");
        }
    }

    /**
     * Busca un producto en el inventario por nombre y cantidad.
     *
     * @param Nombreproducto     El nombre del producto a buscar.
     * @param cantidadProducto    La cantidad requerida del producto.
     * @return El producto si se encuentra en el inventario y tiene suficiente stock, de lo contrario, devuelve null.
     */
    public Producto buscarProducto(String Nombreproducto, int cantidadProducto) {
        for (int i = 0; i <= inventario.length; i++) {
            if (inventario[i].getNombreProducto().equals(Nombreproducto) && inventario[i].getStock() >= cantidadProducto) {
                return inventario[i];
            }
        }
        return null;
    }
}
