package PracticasPoo;
import java.awt.*;
import javax.swing.*;
import javax.swing.BorderFactory.*;
import javax.swing.border.Border;
public class Test_Swing {
    public static void main(String[] args) {
        JLabel label = new JLabel();
        ImageIcon pelon = new ImageIcon("C:\\Users\\jossu\\Desktop\\Psycogang.png");
        Border border = BorderFactory.createLineBorder(Color.GREEN,3);
        label.setText("Nomas ando viendo grasias");
        label.setIcon(pelon);
        label.setHorizontalTextPosition(JLabel.CENTER);//Set text LEFT,CENTER,RIGHT
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0xfaab11bb));//Cambia el color de la fuente
        label.setFont(new Font("MV Boli",Font.PLAIN,20));//cambiar fuente y tamaño
        label.setIconTextGap(100); //set gap of text to image
        label.setBackground(Color.BLACK);
        label.setOpaque(true);//Marca si la opacidad del fondo esta encendida o no
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);//Posicion vertical del Pychoanalisis
        label.setHorizontalAlignment(JLabel.CENTER);//Posicion Horizontal del pychoanalisis
        Frame frame = new Frame();//Frame va abajo para que se apliquen las chingaderas de arriba xDD
        frame.add(label);
    }
}
