package workshop6._.LinkedListExample;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created with IntelliJ IDEA.
 * User: remcoruijsenaars
 * Date: 12/10/13
 * Time: 10:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args){
        LinkedList<String> namen = new LinkedList<String>();


        namen.add("Thom");
        namen.add("Diana");
        namen.add("Romeo");
        namen.add("Harry");

        ListIterator<String> iterator = namen.listIterator();

        /**Doorlopen met behulp van een ListIterator, omdat we tijdens het doorlopen
        *elementen aan de lijst willen toevoegen of verwijderen.
        */
        while(iterator.hasNext()){
            String nameIter = iterator.next();

            if(nameIter.equals("Romeo")){
                iterator.add("Julia");
            }
        }

        //Uitprinten met behulp van een enhanced for lus omdat we de elementen alleen willen bezoeken.
        for(String naam : namen){
            System.out.println(naam);
        }
    }
}
