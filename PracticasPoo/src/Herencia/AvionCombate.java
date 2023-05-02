package Herencia;

public class AvionCombate extends Avion{
    private double velocidad, alcance;
    private String especializacion;

    public AvionCombate(String nombre,String tipo,String modelo,String especializacion,Double alcance,int ruedas,Double velocidad){
        super(nombre,tipo,modelo,ruedas);
        this.velocidad = velocidad;
        this.alcance = alcance;
        this.especializacion = especializacion;
    }
    public void sobreVolar(){
        System.out.println("El avion " + this.modelo + " Sobrevuela la base");
    }
}
