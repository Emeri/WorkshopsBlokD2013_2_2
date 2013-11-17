package workshop1;


import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * User: remcoruijsenaars
 * Date: 11/16/13
 * Time: 4:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class Array2DOmzetStart {

    public static void main(String[] args){
        double[][] omzetCijfers = {
                                    {1220, 2345, 6700, 3000}, //current year
                                    {5300, 2000, 1000, 5500},
                                    {2316, 6244, 2445, 6255},
                                    {4225, 1425, 2677, 6777},
                                    {4524, 3616, 4352, 5344},
                                    {3452, 25377, 5200, 7000}
                                };






        int jaar = meesteOmzetInJaar(omzetCijfers);
        System.out.println("Meeste omzet in jaar: " + jaar);

        int kwartaal = meesteOmzetInKwartaal(omzetCijfers);
        System.out.println("Meeste omzet in kwartaal: " + kwartaal);
    }


    //TODO implement
    private static int meesteOmzetInKwartaal(double[][] input){
         return 0;

    }

    //TODO implement
    private static int meesteOmzetInJaar(double[][] input){
         return 0;
    }
}
