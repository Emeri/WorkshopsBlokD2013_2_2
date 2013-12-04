package workshop5.coloredboxesexample;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author remcoruijsenaars
 */
public class ResultJPanel extends JPanel{
    
     private int aantalPogingen;
     private boolean finished;
    
     public ResultJPanel(){
        this.setBackground(Color.LIGHT_GRAY);
        this.setPreferredSize(new Dimension(160, 50));
     }
     
     public void increaseAantalPogingen(){
         aantalPogingen++;
     }
     
     public void setFinished(){
         finished = true;
     }
     
     @Override
     protected void paintComponent(Graphics g){
         super.paintComponent(g);
         g.setColor(Color.BLACK);
         if(finished){
             g.drawString("Finished: ( " + aantalPogingen + ")", 10, 20);
         }else{
             g.drawString("Aantal pogingen: " + aantalPogingen, 10, 10);
         }
         
     }

    
   
}
