package Herencia;
public class Avion   {
     String tipo;
    String modelo;
    String nombre;
     int ruedas;
    public Avion(String tipo, String modelo, String nombre,int ruedas){
        this.tipo = tipo;
        this.modelo = modelo;
        this.nombre = nombre;
        this.ruedas = ruedas;
    }


    public  void despegar(){
        System.out.println("El avion " + this.nombre + " ha despegado");
    }
    public  void aterrizar(){
        System.out.println("El avion "+ this.nombre +" ha aterrizado");
    }
}
