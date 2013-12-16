package workshop8.GrootseGetal;

/**
 * Created with IntelliJ IDEA.
 * User: remcoruijsenaars
 * Date: 12/15/13
 * Time: 8:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class GrootsteGetalCalc {


    public int grootste (int[] lijst){
        return grootste(lijst, 0);
    }


    private int grootste (int[] lijst, int start) {
        if ( start == lijst.length - 1)   //basis
            return lijst[start];
        else {//recursie
            int max = grootste (lijst, start+1);
            if (max > lijst[start])
                return max;
            else
                return lijst[start];
        }
    }

}
