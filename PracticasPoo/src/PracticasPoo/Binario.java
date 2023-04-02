package PracticasPoo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Binario extends JFrame {
    private TextField numDecimal;
    private TextField numBinario;
    private JLabel ingresarDec;
    private JLabel numConvertido;
    private JButton btnconvertir;
    public Binario() {

        numDecimal = new TextField();
        numBinario = new TextField();
        ingresarDec = new JLabel("Ingresa Numero Decimal:");
        numConvertido = new JLabel("Numero Binario:");
        btnconvertir = new JButton("Convertir");

        ingresarDec.setBounds(20, 43, 200, 40);
        numDecimal.setBounds(170, 50, 100, 25);
        numConvertido.setBounds(20, 100, 100, 25);
        numBinario.setBounds(120, 100, 120, 25);
        setSize(400, 400);
        btnconvertir.setBounds(20, 150, 100, 30);

        btnconvertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int dec = Integer.parseInt(numDecimal.getText());
                MetodosSwing.conversorBinario(e, dec,numBinario);
            }
        });

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(numBinario);
        add(numDecimal);
        add(ingresarDec);
        add(btnconvertir);
        add(numConvertido);
        setLayout(null);
        setTitle("Horas");
        setVisible(true);
    }
}
