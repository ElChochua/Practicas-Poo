import java.util.Scanner;
public class NumMayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int mayor, posicioni=0, posicionj=0;
        mayor = matriz[0][0];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matriz[i][j] = i+j;
                System.out.println("Ingresa el valor de la posicion" + "[" + i + "][" + j + "]");
                matriz[i][j] = sc.nextInt();
                if(matriz[i][j] > mayor){
                    mayor = matriz[i][j];
                    posicioni = i;
                    posicionj = j;
                }
            }
        }
        System.out.println("El Numero mayor es: " + mayor);
        System.out.println("Y esta en la posicion " + "["+ posicioni+ "][" + posicionj+"]" );
    }
}
