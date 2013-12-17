

package workshop9.util;

import java.util.Random;

/**
 *
 * @author remcoruijsenaars
 */
public class ArrayUtil {

    private static Random generator = new Random();
    
    
    public static int[] randomIntArray(int length, int n){
        
        int[] returner = new int[length];
        
        for(int i=0; i<returner.length; i++){
            returner[i] = generator.nextInt(n);
        }
        
        return returner;
    }
    
    public static void swap(int[] a, int i, int j){
        int tempValue = a[i];
        a[i] = a[j];
        a[j] = tempValue;
    }
    
    
}
