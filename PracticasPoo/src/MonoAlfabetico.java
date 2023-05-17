import java.io.*;
import java.util.*;
public class MonoAlfabetico {
    public static char alfabetoNormal[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
                                           'n','o','p','q','r','s','t','u','v','w','x','y','z'};
    public static char alfabetoCifrado[] = {'Q','W','E','R','T','Y','U','I','O','P','A','S','D',

                                            'F','G','H','J','K','L','Z','X','C','V','B','N','M'};
    //Funcion para cifrar el mensaje
    public static String cifrar(String mensaje) {
        String mensajeCifrado = "";
        //Se recorre el mensaje
        for (int i = 0; i < mensaje.length();i++){
            //Se recorre el alfabeto normal
            for(int j = 0; j < 26; j++){
                //Si el caracter esta en el alfabeto normal, se agrega el caracter cifrado al mensaje
                if(mensaje.charAt(i) == alfabetoNormal[j]){
                    mensajeCifrado += alfabetoCifrado[j];
                    break;
                }
                //Si el caracter es un espacio, se agrega un espacio al mensaje cifrado
                if(mensaje.charAt(i) == ' '){
                    mensajeCifrado += ' ';
                    break;
                }
            }
        }
        return mensajeCifrado;
    }
    //funcion para decifrar el mensaje
    public static String decifrar(String mensaje) {
        String mensajeDecifrado = "";
        //Se recorre el mensaje
        for (int i = 0; i < mensaje.length();i++){
            //Se recorre el alfabeto cifrado
            for(int j = 0; j < 26; j++){
                //Si el caracter esta en el alfabeto cifrado, se agrega el caracter normal al mensaje
                if(mensaje.charAt(i) == alfabetoCifrado[j]){
                    mensajeDecifrado += alfabetoNormal[j];
                    break;
                }
                //Si el caracter es un espacio, se agrega un espacio al mensaje decifrado
                if(mensaje.charAt(i) == ' '){
                    mensajeDecifrado += ' ';
                    break;
                }
            }
        }
        return mensajeDecifrado;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mensaje = "";
        System.out.println("Ingrese el mensaje a cifrar");
        mensaje = sc.nextLine();
        mensaje = mensaje.toLowerCase();
        System.out.println(cifrar(mensaje));
        System.out.println(decifrar(cifrar(mensaje)));

    }

}
