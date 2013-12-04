package workshop5.coloredboxesexample;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author remcoruijsenaars
 */
public class ColoredBoxesJFrame extends JFrame implements GameEventListener{
    
    
    private JButton buttonUL;
    private JButton buttonUR;
    private JButton buttonLL;
    private JButton buttonLR ;
    
    
    private JPanel upperPanel;
    private JPanel buttonPanel;
    private ResultJPanel resultPanel;
    private ColoredBoxesJPanel lowerPanel;
  
    
    public final static String UPPERLEFT = "UpperLeft";
    public final static String UPPERRIGHT = "UpperRight";
    public final static String LOWERLEFT = "LowerLeft";
    public final static String LOWERRIGHT = "LowerRight";
    
    public ColoredBoxesJFrame(){
        //Instantieren buttons
        buttonUL = new JButton();
        buttonUR = new JButton();
        buttonLL = new JButton();
        buttonLR = new JButton();
        
        //instantieren panels
        upperPanel =  new JPanel();
        resultPanel = new ResultJPanel();
        buttonPanel =  new JPanel();
        lowerPanel = new ColoredBoxesJPanel(this);
        
        
        //Layout setten button panel
        buttonPanel.setLayout(new GridLayout(2, 2));
        //Properties van het frame setten
        setBackground(Color.BLACK);
        setSize(new Dimension(400, 400));
        
        //bovenste Panel initieren
        initUpperPanel();
        //Toevoegen upperPanel en lowerPanel. Let BorderLayout paramaters!!
        this.add(upperPanel, BorderLayout.NORTH);
        this.add(lowerPanel, BorderLayout.CENTER);
        //frame zichtbaar maken
        setVisible(true);
    }
    
    
    private void initUpperPanel(){
        
    
        initButtons();
        
        //Toevoegen van buttonpanel en resultpanel aan upperPanel. (FlowLayout is defaut layouyt van een Panel)
        this.upperPanel.add(buttonPanel);
        this.upperPanel.add(resultPanel);
    }
    
    
    private void initButtons(){
       
        buttonUL.addActionListener(lowerPanel);
        buttonUL.setText(UPPERLEFT);
        
        buttonUR.setText(UPPERRIGHT);
        buttonUR.addActionListener(lowerPanel);
        
        buttonLL.setText(LOWERLEFT);
        buttonLL.addActionListener(lowerPanel);
        
        buttonLR.addActionListener(lowerPanel);
        buttonLR.setText(LOWERRIGHT);
        
        buttonPanel.add(buttonUL);
        buttonPanel.add(buttonUR);
        buttonPanel.add(buttonLL);
        buttonPanel.add(buttonLR);
    }
    
    @Override
    public void increaseAantalPogingen(){
       this.resultPanel.increaseAantalPogingen();
       this.resultPanel.repaint();
            
    }
    
    @Override
    public void finishGame() {
        this.resultPanel.setFinished();
        disableButtons();
    }
    
    private void disableButtons(){
        this.buttonLL.setEnabled(false);
        this.buttonLR.setEnabled(false);
        this.buttonUL.setEnabled(false);
        this.buttonUR.setEnabled(false);
        
    }

 

}
