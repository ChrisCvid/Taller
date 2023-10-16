package Program.Model;
public class Cliente extends Persona {
    private int numero;

    private int mesa;


    public Cliente(String nombre, int edad, int numero, int mesa) {
        super(nombre, edad);
        this.numero = numero;
        this.mesa = mesa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }



    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }


}
