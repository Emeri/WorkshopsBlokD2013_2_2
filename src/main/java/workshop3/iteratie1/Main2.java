package workshop3.iteratie1;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: remcoruijsenaars
 * Date: 11/26/13
 * Time: 7:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main2 {

    public static void main (String[] args){

        Shape r1 = new Rectangle(Color.RED, 10, 10);
        Shape c1 = new Circle(Color.RED,9);

        Rectangle r2 = new Rectangle(Color.BLUE, 5, 6);

        Persoon guus = new Persoon("Guus", r1);
        System.out.println(guus);
        guus.setFavoriteShape(c1);
        System.out.println(guus);


        //r2 = r1; //Incompatible types

        r2 = (Rectangle)r1;
        //r2 = (Rectangle)c1; //ClassCastException


    }
}
