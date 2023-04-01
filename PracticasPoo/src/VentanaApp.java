import PracticasPoo.MetodosSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaApp {
    public static void main(String[] args) {
        //declaracion Objetos y variables

        JFrame frame = new JFrame();
        TextField hora = new TextField();
        JLabel HorasIngresadas = new JLabel("Ingrese la hora (00:00)");
        JLabel HorasConvertidas = new JLabel("Horas Convertidas");
        JButton conversor = new JButton("Convertir");
        TextField txtResultado = new TextField();


        //Espacio para setear Propiedades de los componentes
        HorasIngresadas.setBounds(20,43,200,40);
        hora.setBounds(160,50, 100,25);
        frame.setSize(400,400);
        txtResultado.setBounds(160,100, 100,25);
        conversor.setBounds(20,150,100,30);
        HorasConvertidas.setBounds(20,95,140,40);

        //Comportamiento de los botones
        conversor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MetodosSwing.Convertir(e, hora, txtResultado);
            }
        });
        //Espacio para agregar al frame los componentes
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(hora);

        frame.add(HorasIngresadas);
        frame.add(HorasConvertidas);
        frame.add(conversor);
        frame.add(txtResultado);
        frame.setLayout(null);
        frame.setTitle("Horas");
        frame.setVisible(true);

    }
}
