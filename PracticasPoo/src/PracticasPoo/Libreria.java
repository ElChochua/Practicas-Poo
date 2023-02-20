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
        System.out.println("1.-Energia potencial Gravitatoria");
        System.out.println("2.-Calcular Distancia");
        System.out.println("3.-Ley de Ohms");
        System.out.println("4.-Modulo de corte");
        System.out.println("5.-Presion Hidrostática");
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
    //EPG = Energia potencial gravitatoria
    public static void ePG(){
        int masa, gravedad, altura, Epg;
        System.out.println("Ingrese la Masa");
        masa = sc.nextInt();
        System.out.println("Ingrese la gravedad");
        gravedad = sc.nextInt();
        System.out.println("Ingrese la altura ");
        altura = sc.nextInt();
        Epg = (masa) * (gravedad) * (altura);
        System.out.println("Energia potencial gravitatoria: " + Epg);

    }
    public static void Distancia(){
        double velocidad, tiempo, aceleracion,distancia;
        System.out.println("Ingresa la velocidad");
        velocidad = sc.nextDouble();
        System.out.println("Ingresa el tiempo ");
        tiempo = sc.nextDouble();
        System.out.println("Ingresa la aceleracion");
        aceleracion = sc.nextDouble();
        distancia = (velocidad *tiempo) + (aceleracion *tiempo * tiempo /2);
        System.out.println("La distancia es de : " + distancia);

    }
    public static void Ohms(){
        double resistencia, icorriente,diferenciaP;
        System.out.println("Ingrese la diferencia: ");
        diferenciaP = sc.nextDouble();
        System.out.println("Ingrese el valor de la resistencia: ");
        resistencia = sc.nextDouble();
        (icorriente) = (diferenciaP) / (resistencia);
        System.out.println("Ley de Ohms: " + icorriente);
    }
    //Modulo de corte || Módulo de cizalladura
    public static void mCorte(){
        double fuerzaT, longitud,variaciondeL,area,modulo;
        System.out.println("Ingrese la Fuerza: ");
        fuerzaT = sc.nextDouble();
        System.out.println("Ingrese la longitud");
        longitud = sc.nextDouble();
        System.out.println("Ingrese la variacion del lado ");
        variaciondeL = sc.nextDouble();
        System.out.println("Ingrese el area");
        area = sc.nextDouble();
        modulo = (fuerzaT) * (longitud)/(variaciondeL)*(area);
        System.out.println("El modulo de corte es: " + modulo);
    }
    public static void pHidro(){
        float densidad,gravedad,altura,Ph;
        System.out.println("Ingrese la densidad");
        densidad = sc.nextFloat();
        System.out.println("Ingrese la gravedad");
        gravedad = sc.nextFloat();
        System.out.println("Ingrese la altura: ");
        altura = sc.nextFloat();
        Ph=(densidad)*(gravedad)*(altura);
        System.out.println("La presion Hidrostática es: " + Ph);
    }

}

