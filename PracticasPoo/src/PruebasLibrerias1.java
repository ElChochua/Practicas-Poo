import java.util.Scanner;
import PracticasPoo.Libreria;
public class PruebasLibrerias1 {
    public static void main(String[] args) {
        int opc;
        System.out.println("Funciones De area/perimetro");
        Scanner sc = new Scanner(System.in);
        Libreria.mostrarMenuGeo();
        opc = sc.nextInt();
        switch (opc) {
            case 1 -> Libreria.areaTriangulo();
            case 2 -> Libreria.perTri();
            case 3 -> Libreria.perimetroCir();
            case 4 -> Libreria.areaCir();
            case 5 -> Libreria.perimCuadr();
            case 6 -> Libreria.areaCuadr();
            case 7 -> Libreria.perPenta();
            case 8 -> Libreria.perRombo();
            case 9 -> Libreria.perRectangulo();
            case 10 -> Libreria.areaRec();
            default -> System.out.println("Ingrese una opcion valida");
        }
    }
}
