package Clases;
public class Cliente {
    private int numero;
    private int edad;

    private int mesa;
    private String nombre;

    public Cliente(int numero , int edad , int mesa , String nombre) {
        this.numero = numero;
        this.edad = edad;
        this.mesa = mesa;
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
