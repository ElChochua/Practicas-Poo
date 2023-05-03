package Herencia;

public class Figura {

    String tipo;
    public Figura( String tipo){
        this.tipo = tipo;
    }
    public void calcularArea(){
        System.out.println("El area de la figura es:");
    }
    public void calcularPerimetro(){
        System.out.println("El perimetro de la figura es:");
    }
    public void dibujar(){
        System.out.println("Dibujanding");
    }
}
