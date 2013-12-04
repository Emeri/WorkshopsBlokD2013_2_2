package workshop5.layoutmanagers;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: remcoruijsenaars
 * Date: 12/3/13
 * Time: 8:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class MainFlowLayout {

    public static void main(String[] args){
        JButton b1 = new JButton("Start");
        JButton b2 = new JButton("Stop");
        JButton b3 = new JButton("Pause");
        JButton b4 = new JButton("Reset");

        JPanel panel = new JPanel();
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);


        JFrame f1 = new JFrame();
        f1.setSize(new Dimension(400, 100));
        f1.add(panel);
        f1.setVisible(true);

    }
}
