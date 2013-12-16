

package workshop8;

/**
 *
 * @author remcoruijsenaars
 */
public class FibonacciReeksRecursie {
    //f1 = 1
    //f2 = 1
    //fn = f(n-1) + f(n-2)
    
    
    public static void main(String[] args){
        System.out.println(fibNonRec(45));
        System.out.println(fibRec(45));
    }
    
    private static int fibRec(int getal){
        if(getal <= 2){ //Basisgeval(len)  
            return 1;
        }else{ //Recursie.
            return fibRec(getal-1) + fibRec(getal-2);
        }
    }
    
    public static long fibNonRec(int n)
    {  
         if (n <= 2) { return 1; } 
         else
         {
            long olderValue = 1;
            long oldValue = 1;
            long newValue = 1;
            for (int i = 3; i <= n; i++)
            {  
               newValue = oldValue + olderValue;
               olderValue = oldValue;
               oldValue = newValue;
            }
            return newValue;
         }
    }

    
}
