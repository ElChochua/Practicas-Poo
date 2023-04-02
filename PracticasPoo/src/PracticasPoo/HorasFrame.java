package PracticasPoo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HorasFrame extends JFrame {
    private TextField hora;
    private JLabel horasIngresadas;
    private JLabel horasConvertidas;
    private JButton conversor;
    private TextField txtResultado;

    public HorasFrame() {
        // Inicializa los componentes
        hora = new TextField();
        horasIngresadas = new JLabel("Ingrese la hora (00:00)");
        horasConvertidas = new JLabel("Horas Convertidas");
        conversor = new JButton("Convertir");
        txtResultado = new TextField();

        // Espacio para setear Propiedades de los componentes
        horasIngresadas.setBounds(20, 43, 200, 40);
        hora.setBounds(160, 50, 100, 25);
        setSize(400, 400);
        txtResultado.setBounds(160, 100, 100, 25);
        conversor.setBounds(20, 150, 100, 30);
        horasConvertidas.setBounds(20, 95, 140, 40);

        // Comportamiento de los botones
        conversor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MetodosSwing.Convertir(e, hora, txtResultado);
            }
        });

        // Espacio para agregar al frame los componentes
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(hora);
        add(horasIngresadas);
        add(horasConvertidas);
        add(conversor);
        add(txtResultado);
        setLayout(null);
        setTitle("Horas");
        setVisible(true);
    }
}
