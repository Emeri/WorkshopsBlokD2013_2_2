

package workshop6._.StackExample;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author remcoruijsenaars
 */
public class StackMain {
    
    
    public static void main(String[] args){
        AktieStack aktieStack = new AktieStack();
        boolean isFinished = false;
        
        System.out.println("q == quit \t u == aktie ongedaan maken \t d==aktie aanmaken en uitvoeren." );
        
        Scanner scanner = new Scanner(System.in);
        
        while(!isFinished){
            
            
            char invoer = scanner.next().charAt(0);
            
            switch (invoer){
                case 'q' :
                    isFinished = true;
                    break;
                case 'u' :
                    Aktie aktieOngedaan = aktieStack.haalAktieVanStack();
                    if(aktieOngedaan == null){
                        System.out.println("Geen akties meer aanwezig om ongedaan te maken.");
                    }else{
                        System.out.println(aktieOngedaan.ongedaanMaken());
                    }
                    
                    break;
                case 'd':
                    System.out.println("Voer aktienaam in:");
                    
                    String aktieNaam = scanner.next();
                    Aktie nieuweAktie = new Aktie(aktieNaam, new Date());
                    aktieStack.voegAktieToe(nieuweAktie);
                    System.out.println(nieuweAktie.voeruit());
                    break;
                    
            }
        }
    }
    
    
}
