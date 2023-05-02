package Herencia;

public class Perro extends Canino{
    private String raza;
    private int nivelEnergia;
    public Perro(String nombre, String raza, String tamanio, int nivelEnergia){
        super(nombre,raza,tamanio);
        this.raza = raza;
        this.nivelEnergia = nivelEnergia;
    }
    public static void Marcar(){
        System.out.println("Estoy marcando");
    }
    public static void Jugar(){
        System.out.println("Estoy jugando");
    }
}
