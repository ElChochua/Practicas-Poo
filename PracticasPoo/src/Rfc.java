import java.util.Scanner;
import java.util.regex.*;
public class Rfc {
    public static String calcularRfc(String nombre,String apellidoPaterno,String apellidoMaterno, String fechaN){
        nombre = nombre.toUpperCase();
        apellidoPaterno = apellidoPaterno.toUpperCase();
        apellidoMaterno = apellidoMaterno.toUpperCase();
       String primeraLetraPaterno = apellidoPaterno.substring(0,1);
       String segundaLetraPaterno = "X";
       for(int i=0;i<apellidoPaterno.length();i++){

           String letra = apellidoPaterno.substring(i,i+1);

           if(letra.matches("[AIUEO]")){
               segundaLetraPaterno = letra;
               break;
           }
       }
       String primeraLetraMaterno = "X";
       if(!apellidoMaterno.isEmpty()){
           primeraLetraMaterno = apellidoMaterno.substring(0,1);
       }
       String primerLetraNombre ="X";
       if(!nombre.isEmpty()){
           primerLetraNombre = nombre.substring(0,1);
       }
       String ultimosAnio = fechaN.substring(8,10);
       String mes = fechaN.substring(3,5);
       String dia = fechaN.substring(0,2);
       String RFC = primeraLetraPaterno + segundaLetraPaterno + primeraLetraMaterno+primerLetraNombre + ultimosAnio + mes + dia;
        return RFC;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su apellido Paterno ");
        String apellidoPaterno = sc.nextLine();
        System.out.println("Ingrese su apellido Materno");
        String apellidoMaterno = sc.nextLine();
        System.out.println("Ingrese su fecha de nacimiento en este formato: DD/MM/AAAA");
        String fechaN = sc.nextLine();
        //Expresion regular para validar si la fecha de nacimiento tiene el formato correcto
        String regex = "^(0?[1-9]|[1-2][0-9]|3[0-1])\\/(0?[1-9]|1[0-2])\\/([0-9]{4})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fechaN);
        String RFC = calcularRfc(nombre,apellidoPaterno,apellidoMaterno,fechaN);
        if(matcher.matches()){
            if (RFC.matches("^(CACA|PITO|...).*")) {
                RFC = RFC.substring(0, 3) + "X" + RFC.substring(4);
                System.out.println(RFC);
            }
        }else{
            System.out.println("Introduzca un formato de fecha valido");
        }

    }
}
