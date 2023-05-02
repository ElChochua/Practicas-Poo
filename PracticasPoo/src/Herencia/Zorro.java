package Herencia;

public class Zorro extends Canino{
    private String color,Alimentacion;
    public Zorro(String nombre, String raza, String tamanio,String color,String Alimentacion){
        super(nombre,raza,tamanio);
        this.color = color;
        this.Alimentacion = Alimentacion;
    }
    public static void Excavar(){
        System.out.println("Estoy excavando");
    }
    public static void Camuflarse(){
        System.out.println("Estoy camuflandome");
    }
}
