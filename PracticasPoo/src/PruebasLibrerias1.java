import java.util.Scanner;
import PracticasPoo.Libreria;
public class PruebasLibrerias1 {
    public static void main(String[] args) {
        int opc;
        System.out.println("Funciones De area/perimetro");
        Scanner sc = new Scanner(System.in);
        Libreria.mostrarMenu();
        opc = sc.nextInt();
        switch (opc) {
            case 1 -> Libreria.areaTriangulo();
            case 2 -> Libreria.perTri();
            case 3 -> Libreria.perimetroCir();
            case 4 -> Libreria.areaCir();
        }
    }
}
