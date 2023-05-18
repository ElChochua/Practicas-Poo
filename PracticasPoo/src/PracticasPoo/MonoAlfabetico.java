package PracticasPoo;

import java.util.*;
public class MonoAlfabetico {
    public static char alfabetoNormal[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
                                           'n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
    public static char alfabetoNormalMayusculas[] = {'A','B','C','D','E','F','G','H','I','J','K','L',
                                                    'M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    public static char alfabetoCifrado[] = {'Q','W','E','R','T','Y','U','I','O','P','A','S','D',
                                             'F','G','H','J','K','L','Ñ','Z','X','C','V','B','N','M'};
    public static char[] Mezclador(char[] array){
        Random random =  new Random();
        for(int i = 0;i<alfabetoNormal.length;i++){
            int randomIndex = random.nextInt(array.length - i) + i;
            char temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
        return array;
    }
    public static char alfabetoCifradoMezclado[] = Mezclador(alfabetoCifrado);
    //Funcion para cifrar el mensaje
    public static String cifrar(String mensaje) {

        String mensajeCifrado = "";
        //Se recorre el mensaje
        for (int i = 0; i < mensaje.length();i++){
            //Se recorre el alfabeto normal
            for(int j = 0; j < 27; j++){
                //Si el caracter esta en el alfabeto normal, se agrega el caracter cifrado al mensaje
                if(mensaje.charAt(i) == alfabetoNormal[j] || mensaje.charAt(i) == alfabetoNormalMayusculas[j]){
                    mensajeCifrado += alfabetoCifradoMezclado[j];
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
    public static String descifrar(String mensaje) {
        String mensajeDecifrado = "";
        //Se recorre el mensaje
        for (int i = 0; i < mensaje.length();i++){
            //Se recorre el alfabeto cifrado
            for(int j = 0; j < 27; j++){
                //Si el caracter esta en el alfabeto cifrado, se agrega el caracter normal al mensaje

                if(mensaje.charAt(i) == alfabetoCifradoMezclado[j]){
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

}
