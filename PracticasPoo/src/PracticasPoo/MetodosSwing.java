package PracticasPoo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MetodosSwing {
    public static void Convertir(ActionEvent e, TextField hora, TextField txtResultado){
        //Obtener la hora ingresada
        String horaStr = hora.getText();
        //Saux es un String aux para tomar una parte de la cadena ingresada para luego pasar su valor a int en la variable aux-sh es el Sistema Horario
        String Saux,min;
        if(horaStr.length() == 5){
            Saux = horaStr.substring(0,2);
            int aux = Integer.parseInt(Saux);
            min = horaStr.substring(3,5);
            //Eliminamos todos los numeros desde el : hasta atras para imprimir la hora ya editada despues
            horaStr = horaStr.substring(horaStr.indexOf(":") +1 );
            if(aux>=12){
                aux -= 12;
                txtResultado.setText("" + aux +":" +min + "PM");
            }else{
                txtResultado.setText("" + aux +":" +min + "AM");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Ingrese una hora valida");
        }
    }
}
