package PracticasPoo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        MonoAlfabetico mono = new MonoAlfabetico();
        Scanner sc = new Scanner(System.in);
        String mensaje = sc.nextLine();
        System.out.println(mono.cifrar(mensaje));
        System.out.println(mono.descifrar(mono.cifrar(mensaje)));
    }
}
