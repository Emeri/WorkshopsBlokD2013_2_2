

package workshop5.sliderexamplewithtimer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author remcoruijsenaars
 */
public class SliderJPanel extends JPanel implements ChangeListener, ActionListener {
    
        private JPanel sliders;
        private JPanel colorPanel;
    
        private JSlider red;
        private JSlider green;
        private JSlider blue;
        private JLabel label;
        
        private final static int MINVALUE = 0;
        private final static int MAXVALUE = 255;
        
        private Color color;

        private Timer timer;
        
        public SliderJPanel(){
            
            
            color = new Color(MINVALUE, MINVALUE, MINVALUE);
            initSliders();
            
            this.setLayout(new BorderLayout());
            
            sliders = new JPanel();
            sliders.add(red);
            sliders.add(green);
            sliders.add(blue);
            sliders.add(label);
            
            colorPanel = new JPanel();
            colorPanel.setBackground(color);
            
            this.add(sliders, BorderLayout.NORTH);
            this.add(colorPanel, BorderLayout.CENTER);



            timer = new Timer(5000, this);
            timer.start();
        }
        
        private void initSliders(){
            red = new JSlider(MINVALUE, MAXVALUE, MINVALUE);
            red.setToolTipText("RED value");
            green = new JSlider(MINVALUE, MAXVALUE, MINVALUE);
            green.setToolTipText("GREEN value");
            blue = new JSlider(MINVALUE, MAXVALUE, MINVALUE);
            blue.setToolTipText("BLUE value");
            label = new JLabel();
            label.setText(color.toString());
            
            red.addChangeListener(this);
            green.addChangeListener(this);
            blue.addChangeListener(this);
           
        }

    @Override
    public void stateChanged(ChangeEvent e) {
        color = new Color(red.getValue(), green.getValue(), blue.getValue());
        repaint();
    }


    @Override
    public void actionPerformed(ActionEvent event){
        blue.setValue(0);
        red.setValue(0);
        green.setValue(0);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        label.setText(color.toString());
        colorPanel.setBackground(color);
    }

}
