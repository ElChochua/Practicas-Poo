package Herencia;

public class AvionCargero extends Avion {
    private int pesoCarga;
    public AvionCargero(String tipo, String modelo, String nombre,int ruedas,int carga){
        super(tipo, modelo, nombre, ruedas);
        this.pesoCarga = carga;
    }
    public void carga(){
        System.out.println("El avion transporta: " + this.pesoCarga);
    }
}
