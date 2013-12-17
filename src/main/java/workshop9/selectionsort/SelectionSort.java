package workshop9.selectionsort;

import java.util.Arrays;
import workshop9.util.StopWatch;
import workshop9.util.ArrayUtil;

/**
 *
 * @author remcoruijsenaars
 */
public class SelectionSort {
    
    
    public static void main(String[] args){
        int[] testArray = ArrayUtil.randomIntArray(200000, 1000);
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        //Insertion sort
        sort(testArray);
        
        //The sorting algorithm is a Dual-Pivot Quicksort (zie api)
        //Arrays.sort(testArray);


        stopWatch.stop();
        System.out.println("Looptijd algoritme in milliseconde: "+ stopWatch.getElapsedTime());
    
    
    }
    
    public static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minPos = minimumPosition(a, i);
            ArrayUtil.swap(a, minPos, i); }
    }
    
  
    private static int minimumPosition(int[] a, int from) {
        int minPos = from;
        for (int i = from + 1; i < a.length; i++) {
            if (a[i] < a[minPos]){ 
                minPos = i; } 
        }
        
        return minPos; 
    }

}
