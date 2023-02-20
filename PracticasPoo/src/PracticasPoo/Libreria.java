/* Elaborar una librería que contenga al menos 15 funciones que calculen el perímetro, área o volumen de diferentes figuras geométricas.
 Utilizar dicha librería desde 2 programas diferentes. Cada programa debe contener un menú con 5 opciones que hagan uso de 5 funciones de
 dicha librería. Al menos dos opciones de dichos programas deben ser las mismas funciones reutilizadas de la misma librería.
 */
package PracticasPoo;
import java.util.Scanner;
public class Libreria {
    static Scanner sc;

    static {
        sc = new Scanner(System.in);
    }

    public static void mostrarMenuGeo(){
        System.out.println("Bienvenido al menu de la figuras geometricas");
        System.out.println("1.-Area del triangulo");
        System.out.println("2.-Perimetro del triangulo");
        System.out.println("3.-Perimetro del Circulo");
        System.out.println("4.-Area del circulo");
        System.out.println("5.-Perimetro del cuadrado");
        System.out.println("6.-Area del cuadrado");
        System.out.println("7.-Perimetro del pentagono");
        System.out.println("8.-Perimetro del Rombo");
        System.out.println("9.-Perimetro del rectangulo");
        System.out.println("10.-Area del rectangulo");
    }
    public static void mostrarMenuFis(){
        System.out.println("1.-Velocidad");
    }

    public static void areaTriangulo(){
        int base, altura;
        System.out.println("Ingrese base");
        base = sc.nextInt();
        System.out.println("Ingrese la altura");
        altura = sc.nextInt();
        System.out.println("El area del triangulo es de: " + (base*altura/2));
    }
    public static void perTri(){
        int L1,L2,L3;
        System.out.println("Ingrese la medida del primer lado: ");
        L1 = sc.nextInt();
        System.out.println("Ingrese la medida del segundo lado: ");
        L2 = sc.nextInt();
        System.out.println("Ingrese la medida del tercer lado: ");
        L3 = sc.nextInt();
        System.out.println("Perimetro del triangulo: " + (L1+L2+L3));
    }
    public static void perimetroCir(){
        double pi = 3.1416, Dia;
        System.out.println("Ingrese el diametro del circulo: ");
        Dia = sc.nextDouble();
        System.out.println("El perimetro del circulo es: " + Dia*pi);
    }
    public static void areaCir(){
        double radio,pi=3.1417;
        System.out.println("Ingrese el radio del circulo");
        radio = sc.nextDouble();
        radio *= radio;
        System.out.println("Area del circulo: " + (pi*radio));
    }
    public static void perimCuadr(){
        System.out.println("Ingrese la medida de los lados");
        int L = sc.nextInt();
        System.out.println("El Perimetro del cuadrado es: " + L*4);
    }
    public static void areaCuadr(){
        System.out.println("Ingresa la medida los lados");
        int L = sc.nextInt();
        System.out.println("El area del cuadrado es: " + (L*L));
    }
    public static void perPenta(){
        System.out.println("Ingresa la medida de los lados");
        int L = sc.nextInt();
        System.out.println("El perimetro del pentagono es: " + L*5);
    }
    public static void perRombo(){
        System.out.println("Ingresa el tamaño de los lados");
        int L = sc.nextInt();
        System.out.println("El perimetro del Rombo es: " + L*4);
    }
    public static void perRectangulo(){
        int b,h, P;
        System.out.println("Ingresa la base");
        b = sc.nextInt();
        b*=2;
        System.out.println("Ingresa la Altura");
        h = sc.nextInt();
        h *=2;
        P=b+h;
        System.out.println("El perimetro del rectangulo es: " + P);

    }
    public static void areaRec(){
        int b,h;
        System.out.println("Ingresa la base");
        b=sc.nextInt();
        System.out.println("Ingresa la altura");
        h = sc.nextInt();
        System.out.println("El area del rectangulo es: " + b*h);
    }
    public static void Vel(){
        int T,D,V;
        System.out.println("Ingrese la distancia: ");
        D = sc.nextInt();
        System.out.println("Ingrese el tiempo: ");
        T = sc.nextInt();
        V=D/T;
        System.out.println("La velocidad es : " + V);
    }
}

