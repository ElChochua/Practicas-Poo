import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class VentanaApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton sumarB = new JButton();
        TextField getNum1 = new TextField();
        TextField getNum2 = new TextField();
        TextField getRes = new TextField();
        //X A los lados y Y Arriba y abajo
        getNum1.setBounds(30,30,100,30);
        getNum2.setBounds(150,30,100,30);

        sumarB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
;               double num1 = Double.parseDouble(getNum1.getText());
                double num2 = Double.parseDouble(getNum2.getText());
                double res = num1 + num2;
                getRes.setText(""+res);
            }
        });
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        sumarB.setText("Sumar");
        sumarB.setBounds(50,100,95,30);
        getRes.setBounds(50,200,100,100);
        frame.add(sumarB);
        frame.add(getNum1);
        frame.add(getNum2);
        frame.add(getRes);
        frame.setSize(1980,1080);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
