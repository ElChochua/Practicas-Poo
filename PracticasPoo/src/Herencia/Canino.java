package Herencia;

public class Canino {
    private String nombre, raza, tamanio;
    public Canino(String nombre, String raza, String tamanio){
        this.nombre = nombre;
        this.raza = raza;
        this.tamanio = tamanio;
    }
    public static void Ladrar(){
        System.out.println("Guau Guau");
    }
    public static void Comer(){
        System.out.println("Estoy comiendo");
    }
}
