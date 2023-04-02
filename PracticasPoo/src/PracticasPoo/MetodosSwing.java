package PracticasPoo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MetodosSwing extends JFrame{


    public static void Convertir(ActionEvent e, TextField hora, TextField txtResultado) {
        //Obtener la hora ingresada
        String horaStr = hora.getText();
        String ceroCase;
        //Saux es un String aux para tomar una parte de la cadena ingresada para luego pasar su valor a int en la variable aux-sh es el Sistema Horario
        String Saux, min;
        if (horaStr.length() == 5) {
            Saux = horaStr.substring(0, 2);
            int aux = Integer.parseInt(Saux);
            min = horaStr.substring(3, 5);
            txtResultado.setText((aux == 0) ? (Math.abs(aux-12)) + ":" + min + "AM" : "" );
            //Eliminamos todos los numeros desde el : hasta atras para imprimir la hora ya editada despues
            if (aux >= 12 && aux < 25) {
                aux -= 12;
                txtResultado.setText("" + Math.abs(aux) + ":" + min + "PM");
            } else if(aux>24){
                JOptionPane.showMessageDialog(null, "Ingrese una hora valida");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese una hora valida");
        }
    }
    public static void conversorBinario(ActionEvent e,int decimal,TextField txtResultado){
        int cociente, rec;
        int[] bin = new int[16];
        int count = 0;
        if(decimal > 65535){
            JOptionPane.showMessageDialog(null,"El numero excede los 16 bits");
        }else {
            do {
                cociente = decimal / 2;
                bin[count] = decimal % 2;
                decimal = cociente;
                count += 1;
            } while (cociente > 0);
            String resultado = "";
            for (int i = count - 1; i >= 0; i--) {
                resultado += bin[i];
            }
            txtResultado.setText(resultado);
        }
        }
}

