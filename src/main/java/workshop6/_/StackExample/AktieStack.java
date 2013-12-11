

package workshop6._.StackExample;

import java.util.Stack;

/**
 *
 * @author remcoruijsenaars
 */
public class AktieStack {
    
    private Stack<Aktie> stack;
    
    public AktieStack(){
        stack = new Stack();
    }
    
    public void voegAktieToe(Aktie aktie){
        stack.add(aktie);
    }
    
    public Aktie haalAktieVanStack(){
        if (!stack.isEmpty()){
            return stack.pop();
        }else{
            return null;
        }
    }

}
