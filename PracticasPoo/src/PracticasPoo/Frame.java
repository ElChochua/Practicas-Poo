package PracticasPoo;
import javax.swing.*;
import java.awt.*;
public class Frame extends JFrame {

    Frame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icono = new ImageIcon("C:\\Users\\jossu\\Desktop\\Weas\\tre2.jpg");
        this.setSize(500,500);
        this.setIconImage(icono.getImage());
        this.setVisible(true);
    }
}
