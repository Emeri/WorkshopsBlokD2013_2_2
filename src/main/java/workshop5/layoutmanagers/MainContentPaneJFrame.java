package workshop5.layoutmanagers;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: remcoruijsenaars
 * Date: 12/3/13
 * Time: 10:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class MainContentPaneJFrame {

    public static void main(String[] args){
        JFrame f1 = new JFrame();
        f1.setSize(new Dimension(400, 100));


//        Container contentPane = f1.getContentPane();
//        contentPane.add(new JButton("Start"));
//        contentPane.add(new JButton("Stop"));
//        contentPane.add(new JButton("Pause"));
//        contentPane.add(new JButton("Reset"));

        f1.add(new JButton("Start"), BorderLayout.NORTH);
        f1.add(new JButton("Stop"));
        f1.add(new JButton("Pause"));
        f1.add(new JButton("Reset"), BorderLayout.SOUTH);

        f1.setVisible(true);
    }
}
