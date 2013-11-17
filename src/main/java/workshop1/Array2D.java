package workshop1;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: remcoruijsenaars
 * Date: 11/16/13
 * Time: 1:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class Array2D {




    private static boolean[][] speelVeld = new boolean[6][4];

    public static void main(String[] args){

        int[] test = {3, 4, 5, 6};

        int[] test2 = Arrays.copyOf(test, 2);




        printSpeelVeld();
        System.out.println("zzzzzzzzzzzzzzzz");
        speelVeld[0][2] = true;
        speelVeld[1][1] = true;
        printSpeelVeld();
        System.out.println("zzzzzzzzzzzzzzzz");

    }

//    private static boolean opEenRij(int number){
//
//    }

    private static void printSpeelVeld(){
        for(int i=0; i<speelVeld.length; i++){
            for(int j=0; j<speelVeld[0].length; j++){
                if(speelVeld[i][j]){
                    System.out.print("*");
                }
                else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

}
