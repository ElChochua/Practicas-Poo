import java.util.Scanner;
public class Test_rancios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Dame un numero padrino");
        num = sc.nextInt();
        //Operador ternario (condition) ? (return if true) : (return if false);
        System.out.println((num>5) ? "Si es mayor" : "noes");
    }
}
