/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop8;

/**
 *
 * @author remcoruijsenaars
 */
public class PalindroomRecursie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(isPalindrome(". bob, "));
    }
    
    public static boolean isPalindrome(String text){
    
        int lengteInput = text.length();
        
        if(lengteInput <=1){ //Basisgeval 
            return true;
        }else{
            
            char eersteLetter = Character.toLowerCase(text.charAt(0));
            char laatsteLetter = Character.toLowerCase(text.charAt(text.length()-1));
            
            if(Character.isLetter(eersteLetter) && Character.isLetter(laatsteLetter)){
                if(eersteLetter == laatsteLetter){
                    String korter = text.substring(1, lengteInput-1); // eerste en laatste letter zijn geverifieerd. Kortere string construeren.
                    return isPalindrome(korter); //We gaan in recursie met korter (simpelere) string
                }else{
                    return false; // Geen palindrome, dus retourneren we false
                }
            }       
            else if(!Character.isLetter(laatsteLetter)){ //Checken of laatste char een letter is.
                String korter = text.substring(0, text.length() - 1); //Laatste char (is geen letter) verwijderen van string
                return isPalindrome(korter); //We gaan in recursie met korter (simpelere) string
            }
            else{ //Laatste letter is geen char
                String korter = text.substring(1); //Laatste char (is geen letter) verwijderen van string
                return isPalindrome(korter); //We gaan in recursie met korter (simpelere) string
            }
        }

    }
}
