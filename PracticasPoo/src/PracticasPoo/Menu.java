package PracticasPoo;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Menu implements ActionListener {
    private JMenuBar barraMenu;
    private JMenu menu;
    private JMenuItem seg,bin,hor;
    public Menu(){
        barraMenu = new JMenuBar();
        menu = new JMenu("Practicas");
        barraMenu.add(menu);
        hor = new JMenuItem("Horas Conversor");
        hor.addActionListener(this);
        seg = new JMenuItem("Segundos");
        seg.addActionListener(this);
        bin = new JMenuItem("Binario");
        bin.addActionListener(this);
        menu.add(seg);
        menu.add(bin);
        menu.add(hor);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == seg ){
            HorasMinutos horasM = new HorasMinutos();
            horasM.setVisible(true);
        }else if(e.getSource() == bin){

            Binario binario = new Binario();
            binario.setVisible(true);
        }else if(e.getSource() == hor){
            HorasFrame horasF = new HorasFrame();
            horasF.setVisible(true);
        }
    }
    public JMenuBar getBarraMenu() {
        return barraMenu;
    }
}