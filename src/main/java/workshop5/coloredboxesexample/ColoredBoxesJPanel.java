package workshop5.coloredboxesexample;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author remcoruijsenaars
 */
public class ColoredBoxesJPanel extends JPanel implements ActionListener {
    
     private GameEventListener gameEventListener;
    
  
     private JPanel upperLeft = new JPanel();
     private JPanel upperRight = new JPanel();
     private JPanel lowerLeft = new JPanel();
     private JPanel lowerRight = new JPanel();
        
    
     public ColoredBoxesJPanel(GameEventListener gameEventListener){
         
        this.gameEventListener = gameEventListener;
        this.setPreferredSize(new Dimension(200, 200));
        
        this.setLayout(new GridLayout(2, 2));
       
        upperLeft.setBackground(ColorUtil.getRandomColor());
        upperLeft.setPreferredSize(new Dimension(100, 100));
        upperRight.setBackground(ColorUtil.getRandomColor());
        upperRight.setPreferredSize(new Dimension(100, 100));
        lowerLeft.setBackground(ColorUtil.getRandomColor());
        lowerLeft.setPreferredSize(new Dimension(100, 100));
        lowerRight.setBackground(ColorUtil.getRandomColor());
        lowerRight.setPreferredSize(new Dimension(100, 100));
        
        
        this.add(upperLeft);
        this.add(upperRight);
        this.add(lowerLeft);
        this.add(lowerRight);
                
     }
     
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        Color randomColor = ColorUtil.getRandomColor();
        String s = ae.getActionCommand();
        if (s.equals(ColoredBoxesJFrame.UPPERLEFT)) {
            this.upperLeft.setBackground(randomColor);
            this.upperLeft.repaint();

        } else if (s.equals(ColoredBoxesJFrame.UPPERRIGHT)) {
            this.upperRight.setBackground(randomColor);
            this.upperRight.repaint();

        } else if (s.equals(ColoredBoxesJFrame.LOWERLEFT)) {
            this.lowerLeft.setBackground(randomColor);
            this.lowerLeft.repaint();

        } else if (s.equals(ColoredBoxesJFrame.LOWERRIGHT)) {
            this.lowerRight.setBackground(randomColor);
            this.lowerRight.repaint();

        }
        
        
        if(theSameColors()){
            this.gameEventListener.finishGame();
        }
        
        //aantal pogingen ophogen
        this.gameEventListener.increaseAantalPogingen();
    }
    
    private boolean theSameColors(){
        
        Color ul = this.upperLeft.getBackground();
        Color ur = this.upperRight.getBackground();
        Color lr = this.lowerRight.getBackground();
        Color ll = this.lowerLeft.getBackground();
        
        return ul.equals(ur) & ul.equals(lr) & ul.equals(ll);
    }

   
}
