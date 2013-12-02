package workshop4.guiexamples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener{

    private JPanel panel;
    private JButton button;


    public MainFrame(){
        createComponents();
    }

    private void createComponents(){


        setSize(new Dimension(400, 400));
        setTitle("Empty frame");
        getContentPane().setBackground(Color.ORANGE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //instantiate panel
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 200));
        panel.setBackground(Color.darkGray);


        //instantiate button
        button = new JButton("Start");
       //add Listener to button
        button.addActionListener(new ClickListener());
        button.addActionListener(new InnerClickListener());
        button.addActionListener(this);


        //add button to panel
        panel.add(button);

        //add panel to frame
        this.add(panel);

        //make visible
        setVisible(true);
    }


    public void actionPerformed(ActionEvent event){
        System.out.println("I was clicked. from inside");
    }


    public class InnerClickListener implements ActionListener {
        public void actionPerformed(ActionEvent event){
            System.out.println("I was clicked. Innerclass clicked");
        }
    }
}
