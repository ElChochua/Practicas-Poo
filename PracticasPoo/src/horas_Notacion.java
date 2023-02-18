import java.util.Scanner;
public class horas_Notacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Saux es un String aux para tomar una parte de la cadena ingresada para luego pasar su valor a int en la variable aux-sh es el Sistema Horario
        String hora, Saux,min;
        System.out.println("Ingrese La hora y el sistema horario(AM-PM) en este formato 00:00AM");
        hora = sc.next();
        if(hora.length() == 5){
            Saux = hora.substring(0,2);
           int aux = Integer.parseInt(Saux);
           min = hora.substring(3,5);
            //Eliminamos todos los numeros desde el : hasta atras para imprimir la hora ya editada despues
           hora = hora.substring(hora.indexOf(":") +1 );
           if(aux>=12){
               aux -= 12;
               System.out.println("La hora es " + aux +":" +min);
           }else{
               System.out.println("Este programa solo convierte de formato de 24 horas a 12 Ingrese una hora valida");
           }
        }else{
            System.out.println("Ingrese una hora valida");
        }
    }
}
