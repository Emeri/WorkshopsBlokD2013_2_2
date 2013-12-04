package workshop5.layoutmanagers;

import javax.swing.*;
import java.awt.*;


public class MainBorderLayout {

    public static void main(String[] args){
        JButton b1 = new JButton("Start");
        JButton b2 = new JButton("Stop");
        JButton b3 = new JButton("Pause");
        JButton b4 = new JButton("Reset");

        JPanel panel = new JPanel();


        panel.setLayout(new BorderLayout());

        panel.add(b1, BorderLayout.NORTH);
        panel.add(b2, BorderLayout.WEST);
        panel.add(b3, BorderLayout.EAST);
        panel.add(b4, BorderLayout.CENTER);


        JFrame f1 = new JFrame();
        f1.setSize(new Dimension(400, 100));
        f1.add(panel);
        f1.setVisible(true);

    }
}
