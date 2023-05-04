package Herencia;

public class Cuadrado extends Figura{
    private int medidaLado;
    private final int lado = 4;
    public Cuadrado(int medidaLado,String tipo) {
    super(tipo);
    this.medidaLado = medidaLado;
    }
    @Override
    public void calcularArea(){
        System.out.println("El area del Cuadrado es: " + medidaLado * medidaLado);
    }
    public void calcularPerimetro(){
        System.out.println("El perimetro del cuadrado es: " + medidaLado * lado);
    }
    public void dibujar(){
        int lado = this.lado;
        for (int i = 1; i <= lado; i++) {
            for (int j = 1; j <= lado; j++) {
                if (i == 1 || i == lado || j == 1 || j == lado) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
