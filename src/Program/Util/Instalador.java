package Program.Util;

import Program.Service.Sistema;
import Program.Service.SistemaImpl;


public class Instalador {

    private final Sistema sistemaAInstalar;

    public Instalador() {
        this.sistemaAInstalar = new SistemaImpl();
    }

    public Sistema inyectarSistema(){return this.sistemaAInstalar;
    }
}
