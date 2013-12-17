/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop9;


import workshop9.util.ArrayUtil;
import workshop9.util.StopWatch;

import java.util.Arrays;


/**
 *
 * @author remcoruijsenaars
 */
public class MostOccurences {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = ArrayUtil.randomIntArray(10000, 10);
        System.out.println(Arrays.toString(a));
        
        StopWatch watch = new StopWatch();
        watch.start();
        System.out.println(mostOccurenceValueSlow(a));
        watch.stop();
        System.out.println("Looptijd algoritme in milliseconde langzaam: " + watch.getElapsedTime());
        
        watch.reset();
        
        watch.start();

        System.out.println(Arrays.toString(a));
        System.out.println(mostOccurenceValueFast(a));
        watch.stop();
        System.out.println("Looptijd algoritme in milliseconde snel: " + watch.getElapsedTime());
    }
    
    private static int mostOccurenceValueFast(int[] values){

        Arrays.sort(values);
        int[] counts = new int[values.length];

        int count = 0;
        for (int i = 0; i < values.length; i++) {        
            count++;
            if (i == values.length - 1 || values[i] != values[i + 1]) {
                counts[i] = count;
                count = 0; 
            }
        }

        int currentMax = 0;
        int currentMaxIndex = 0;
        for(int k=0 ; k<counts.length;k++){
            if(counts[k] > currentMax){
                currentMax = counts[k];
                currentMaxIndex = k;
            }
        }

        return values[currentMaxIndex];
    }
    
    private static int mostOccurenceValueSlow(int[] values){


        int[] counts = new int[values.length];
        
        for(int i=0; i< values.length; i++)
        {
           int currentValue = values[i];
           int helpCounter = 0;
           for(int j=0 ; j<values.length; j++){
               
               if(values[j] == currentValue){
                   helpCounter++;
               }
           }
           counts[i] = helpCounter;
        
        }
        
        
        int currentMax = 0;
        int currentMaxIndex = 0;
        for(int k=0 ; k<counts.length;k++){
            if(counts[k] > currentMax){
                currentMax = counts[k];
                currentMaxIndex = k;
            }
        }
         
        return values[currentMaxIndex];
    }
    
    
}
