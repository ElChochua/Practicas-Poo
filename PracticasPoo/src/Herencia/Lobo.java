package Herencia;

public class Lobo extends Canino{
    private int tamanioManada;
    private String comportamiento;
    public Lobo(String nombre, String raza, String tamanio, int tamanioManada, String comportamiento){
        super(nombre,raza,tamanio);
        this.tamanioManada = tamanioManada;
        this.comportamiento = comportamiento;
    }
    public static void Aullar(){
        System.out.println("Auuu");
    }
    public static void Cazar(){
        System.out.println("Estoy cazando");
    }
}
