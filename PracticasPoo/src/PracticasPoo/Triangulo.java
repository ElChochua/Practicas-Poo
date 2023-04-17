package PracticasPoo;

public class Triangulo {
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    public Triangulo(double x1, double x2, double y1, double y2) {
    this.x1 = x1;
    this.x2 = x2;
    this.y1 = y1;
    this.y2 = y2;
}
public double calcularArea() {
// Calcular la distancia entre los dos puntos usando la fórmula de la distancia
    double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
// Calcular el área del triángulo usando la fórmula del área de un triángulo
    double area = 0.5 * distancia * Math.abs(y2 - y1);
    return area;
}
public double calcularArea(double base, double altura) {
// Calcular el área del triángulo usando la fórmula general de base * altura
    double area = 0.5 * base * altura;
    return area;
    }
}
