

package workshop8;

import java.util.ArrayList;

/**
 *
 * @author remcoruijsenaars
 */
public class PermutatiesRecursie {
    
    public static void main(String[] args){
        
        
        ArrayList<String> results = perm("OPA");
        
        for(String s : results){
            System.out.println(s);
        }
    }
    
   
    
    public static ArrayList<String> perm(String woord){
        ArrayList<String> returner = new ArrayList();
        
        if(woord.length() <= 1){
            returner.add(woord);
            return returner;
        }else{
            for(int i=0 ; i<woord.length() ; i++){
                String shorter = woord.substring(0, i) + woord.substring(i + 1);
                
                ArrayList<String> shorterPermutations = perm(shorter);
                
                for(String s : shorterPermutations){
                    returner.add(woord.charAt(i) + s);
                }
            }
        }
        return returner;
    }
}
