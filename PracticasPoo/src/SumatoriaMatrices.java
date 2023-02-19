import java.util.Scanner;
//Commentario random
public class SumatoriaMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas = 3, columnas = 3,sumMatriz;
        int[][] matriz = new int[filas][columnas];
        sumMatriz =0;
        //primer ciclo para llenar la matriz y sumar las filas
        for (int i = 0; i < filas; i++) {
            int sumaFila = 0;
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = i + j;
                System.out.println("Ingresa el valor de la posicion" + "[" + i + "][" + j + "]");
                matriz[i][j] = sc.nextInt();
                //suma de las filas
                sumaFila += matriz[i][j];
                //suma de todas las filas y columnas
                sumMatriz += matriz[i][j];
            }

            System.out.println("Suma de la fila " + (i + 1) + ": " + sumaFila);
        }
        System.out.println("Sumatoria de la matriz: " + sumMatriz);
        //ciclo que suma las columnas
        for (int j = 0; j <columnas; j++) {
            int sumColumnas = 0;
            for (int i = 0; i < filas; i++) {
                sumColumnas += matriz[i][j];
            }
            System.out.println("Suma de la columna " + (j + 1) + ": " + sumColumnas);
        }
    }
}
