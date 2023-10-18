package Program.Util;

import Program.Service.Sistema;
import Program.Service.SistemaImpl;

/**
 * Esta clase se encarga de instalar el sistema del negocio proporcionando una instancia de la interfaz Sistema.
 */
public class Instalador {

    /**
     * Constructor de la clase Instalador.
     * Crea una instancia del sistema de negocio SistemaImpl y la almacena en sistemaAInstalar.
     */
    private final Sistema sistemaAInstalar;

    /**
     * Constructor de la clase Instalador.
     * Crea una instancia del sistema de negocio SistemaImpl y la almacena en sistemaAInstalar.
     */
    public Instalador() {
        this.sistemaAInstalar = new SistemaImpl();
    }

    /**
     * Retorna una instancia del sistema de negocio recién creada.
     *
     * @return La instancia del sistema de negocio.
     */
    public Sistema inyectarSistema(){return this.sistemaAInstalar;
    }
}
