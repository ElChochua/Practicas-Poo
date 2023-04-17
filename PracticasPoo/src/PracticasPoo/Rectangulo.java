package PracticasPoo;

public class Rectangulo {
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    public Rectangulo(double x1,double x2,double y1,double y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public double calcularArea (){
        double base = Math.abs(x2 - x1);
        double altura = Math.abs(y1 - y2);
        double area = base * altura;
        return area;
    }
    public double calcularArea(double base,double altura){
        double area = base * altura/2;
        return area;
    }
}
