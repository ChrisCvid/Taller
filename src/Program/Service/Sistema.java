package Program.Service;

/**
 * Se definen los métodos que un sistema de negocio debe implementar.
 */
public interface Sistema {

    /**
     * Crea listas necesarias para el funcionamiento del sistema.
     *
     * @return Un mensaje de confirmación o null.
     */
    String crearListas();

    /**
     * Permite coordinar las mesas dentro del local, incluyendo la búsqueda de mesas,
     * la adición de clientes a una mesa y la visualización de la lista de mesas.
     *
     * @return Un mensaje de confirmación o null.
     */
    String coordinarMesas();

    /**
     * Gestiona el inventario, incluyendo la adición, actualización y eliminación de productos,
     * así como la visualización del inventario.
     *
     * @return Un mensaje de confirmación o null.
     */
    String gestionarInventario();

    /**
     * Administra a los trabajadores del negocio, incluyendo la adición, renovación, contrato indefinido
     * y finalización de contratos, así como la visualización de la lista de trabajadores.
     *
     * @return Un mensaje de confirmación o null.
     */
    String administrarTrabajadores();

    /**
     * Procesa las órdenes de los clientes, permitiendo la creación de pedidos y la solicitud de cuentas.
     *
     * @return Un mensaje de confirmación o null.
     */
    String procesarOrden();

}
