import PracticasPoo.Libreria;

import java.util.Scanner;
public class PruebasLibrerias2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
        System.out.println("1.-Figuras Geometricas\n2.-Formulas fisicas");
        opc = sc.nextInt();
        switch(opc){
            case 1:
                Libreria.mostrarMenuGeo();
                System.out.println("Seleccione una opcion");
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
                break;
            case 2:
                Libreria.mostrarMenuFis();
                System.out.println("Seleccione una opcion: ");
                opc=sc.nextInt();
                switch(opc){
                    case 1 -> Libreria.Vel();
                    default -> System.out.println("Ingrese una opcion valida");
                }
                break;
        }
    }
}
