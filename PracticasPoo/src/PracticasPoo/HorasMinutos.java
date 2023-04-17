package PracticasPoo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class HorasMinutos extends JFrame{
    private TextField txtSegundos,txtMinutos,txtHoras;
    private JButton btnCalcular,btnLimpiar;
    private JLabel lbSegundos,lbMinutos,lbHoras;
    public HorasMinutos(){
        Menu menu = new Menu();
        setTitle("Horas En N Segundos");
        setJMenuBar(menu.getBarraMenu());
        setLayout(null);
        txtHoras = new TextField();
        txtMinutos = new TextField();
        txtSegundos = new TextField();
        btnCalcular = new JButton ("Calcular");
        btnLimpiar = new JButton("Limpiar");
        lbSegundos = new JLabel("Ingrese Los Segundos:");
        lbMinutos = new JLabel("Minutos");
        lbHoras = new JLabel("Horas");
        setSize(400,400);
        lbSegundos.setBounds(20,43,200,40);
        txtSegundos.setBounds(160,50,100,25);
        lbHoras.setBounds(20,80,100,40);
        txtHoras.setBounds(80,88,100,25);
        lbMinutos.setBounds(20,120,100,40);
        txtMinutos.setBounds(80,125,100,25);
        btnCalcular.setBounds(20, 170, 100, 30);
        btnLimpiar.setBounds(140, 170, 100, 30);
        btnLimpiar.addActionListener(new
                Eventos(txtHoras,txtMinutos,txtSegundos));
        btnCalcular.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                MetodosSwing.segundosPorHora(e,txtSegundos,txtHoras,txtMinutos);
            }
        });
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(txtSegundos);
        add(txtHoras);
        add(txtMinutos);
        add(lbMinutos);
        add(lbHoras);
        add(lbSegundos);
        add(btnCalcular);
        add(btnLimpiar);
        add(menu.getBarraMenu());
        setVisible(true);
    }
}