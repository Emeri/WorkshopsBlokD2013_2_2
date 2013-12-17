package workshop9.sortComparableInterface;

import workshop6._.PriorityQueueExample.DblokkerPQ.DBlokker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 * User: remcoruijsenaars
 * Date: 12/17/13
 * Time: 8:39 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args){
        ArrayList<DBlokker> dBlokkers = new ArrayList();

        DBlokker dBlokkerTom = new DBlokker("Tom", 120, false);
        DBlokker dBlokkerGuus = new DBlokker("Guus", 378, true);
        DBlokker dBlokkerYannick = new DBlokker("Yannick", 12, true);
        DBlokker dBlokkerYme = new DBlokker("Yme", 180, true);

        dBlokkers.add(dBlokkerTom);
        dBlokkers.add(dBlokkerGuus);
        dBlokkers.add(dBlokkerYannick);
        dBlokkers.add(dBlokkerYme);

        Collections.sort(dBlokkers);

        for(DBlokker d : dBlokkers){
            System.out.println(d);
        }

    }
}
