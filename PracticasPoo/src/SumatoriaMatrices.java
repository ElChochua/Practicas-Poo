import java.util.Scanner;
//Commentario random
public class SumatoriaMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3]; for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matriz[i][j] = i+j;
                System.out.println("Ingresa el valor de la posicion" + "[" + i + "][" + j + "]");
                matriz[i][j] = sc.nextInt();

            }
        }
    }
}
