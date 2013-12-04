

package workshop5.coloredboxesexample;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author remcoruijsenaars
 */
public class ColorUtil {
    
    
    private static Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE};
    
    public static Color getRandomColor(){
        Random random = new Random();
        int randomIndex = random.nextInt(colors.length);
        return colors[randomIndex];
    }

}
