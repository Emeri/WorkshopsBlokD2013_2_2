package workshop3.iteratie1.iteratie2;


import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: remcoruijsenaars
 * Date: 11/27/13
 * Time: 8:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args){
        Shape sr1= new Rectangle(Color.RED, 10, 10);
        Shape sr2 = new Rectangle(Color.RED, 10, 10);
        Shape sc1 = new Circle(Color.BLUE, 7);



        System.out.println(sr1 instanceof Rectangle);
        System.out.println(sr2 instanceof Shape);

        System.out.println(sc1 instanceof Rectangle);


        System.out.println(sc1 instanceof Object);





        System.out.println(sr1.equals(sr2));




    }
}
