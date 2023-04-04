package PracticasPoo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Binario extends JFrame {
    private TextField txtNumDecimal;
    private TextField txtNumBinario;
    private JLabel ingresarDec;
    private JLabel numConvertido;
    private JButton btnLimpiar;
    private JButton btnconvertir;
    public Binario() {
        Menu menu = new Menu();
        setJMenuBar(menu.getBarraMenu());

        txtNumDecimal = new TextField();
        txtNumBinario = new TextField();
        ingresarDec = new JLabel("Ingresa Numero Decimal:");
        numConvertido = new JLabel("Numero Binario:");
        btnconvertir = new JButton("Convertir");
        btnLimpiar = new JButton("Limpiar");

        ingresarDec.setBounds(20, 43, 200, 40);
        txtNumDecimal.setBounds(170, 50, 100, 25);
        numConvertido.setBounds(20, 100, 100, 25);
        txtNumBinario.setBounds(120, 100, 120, 25);
        setSize(400, 400);
        btnconvertir.setBounds(20, 150, 100, 30);
        btnLimpiar.setBounds(20, 200, 100, 30);

        btnconvertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int dec = Integer.parseInt(txtNumDecimal.getText());
                MetodosSwing.conversorBinario(e, dec, txtNumBinario);
            }
        });
        btnLimpiar.addActionListener(new Eventos(txtNumBinario,txtNumDecimal));

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(txtNumBinario);
        add(txtNumDecimal);
        add(ingresarDec);
        add(btnconvertir);
        add(numConvertido);
        add(btnLimpiar);
        setLayout(null);
        setTitle("Decimal a Binario");
        add(menu.getBarraMenu());
        setVisible(true);
    }
}
