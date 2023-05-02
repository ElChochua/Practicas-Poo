package Herencia;

public class AvionComercial extends Avion {
    private int capacidad, pasajeros;
    public AvionComercial(String nombre,String tipo,String modelo,int ruedas,int capacida,int pasajeros){
        super(tipo,modelo,nombre,ruedas);
        this.capacidad =  capacida;
        this.pasajeros = pasajeros;
    }
    public void transporta(){
        System.out.println("El Avion: " + this.nombre + " transporta a: " + this.pasajeros);
    }
}
