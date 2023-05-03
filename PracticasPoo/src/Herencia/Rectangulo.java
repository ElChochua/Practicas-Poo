package Herencia;

public class Rectangulo extends Figura{
    private int largo, altura;
    public Rectangulo(int largo, int altura, String tipo){
        super(tipo);
        this.largo = largo;
        this.altura = altura;
    }
    @Override
    public void calcularArea(){
        System.out.println("El area del Rectangulo es: " + largo * altura);
    }
    public void calcularPerimetro(){
        System.out.println("El perimetro del Rectangulo es: " + ((altura*2) + (largo*2)));
    }
    //Fakin ilan esta parte no sirve luego que la corriga te lo paso jajaja
    public void dibujar(){
        int lado = 10;
        for (int i = 1; i <= lado; i++) {
            for (int j = 1; j <= lado; j++) {
                if (i == 1 || i == lado || j == 1 || j == lado) {
                    System.out.print("*"); // imprimir un asterisco en las posiciones de los bordes
                } else {
                    System.out.print(" "); // imprimir un espacio en las posiciones interiores
                }
            }
            System.out.println(); // saltar a la siguiente línea
        }
    }
}
