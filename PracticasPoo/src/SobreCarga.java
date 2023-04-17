import PracticasPoo.Rectangulo;
import PracticasPoo.Triangulo;

public class SobreCarga {
    public static void main(String[] args) {
        Rectangulo rec = new Rectangulo(50,30,42,10);
        System.out.println(rec.calcularArea());
        System.out.println(rec.calcularArea(23,23));
        Triangulo tri = new Triangulo(12,32,23,11);
        System.out.println(tri.calcularArea());
        System.out.println(tri.calcularArea(12,23));
    }
}
