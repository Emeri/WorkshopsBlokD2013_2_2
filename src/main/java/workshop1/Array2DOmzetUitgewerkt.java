package workshop1;

import java.util.Calendar;


/**
 * Created with IntelliJ IDEA.
 * User: remcoruijsenaars
 * Date: 11/16/13
 * Time: 4:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class Array2DOmzetUitgewerkt {

    public static void main(String[] args){
        double[][] omzetCijfers = {
                                    {1220, 2345, 6700, 3000}, //huidig jaar
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


    private static int meesteOmzetInKwartaal(double[][] input){

        final int JAREN = input.length;
        final int KWARTALEN = input[0].length;

        double maxOmzetPerKwartaal = Integer.MIN_VALUE;
        int indexKwartaal = 0;

        for(int j = 0; j<KWARTALEN;j++){
            double omzetKwartaal = 0;
            for(int i=0; i<JAREN; i++){
                omzetKwartaal+=input[i][j];
            }
            if(omzetKwartaal > maxOmzetPerKwartaal){
                maxOmzetPerKwartaal = omzetKwartaal;
                indexKwartaal = j;
            }
        }

        return indexKwartaal + 1;
    }


    private static int meesteOmzetInJaar(double[][] input){

        int huidigJaar = Calendar.getInstance().get(Calendar.YEAR);

        double maxOmzetPerJaar = Integer.MIN_VALUE;
        int indexJaar = 0;
        for(int i=0; i<input.length; i++){
            double omzetIter = 0;
            for(int j=0; j<input[i].length; j++){
                omzetIter+= input[i][j];
            }
            if(omzetIter > maxOmzetPerJaar){
                indexJaar = i;
                maxOmzetPerJaar = omzetIter;
            }
        }

        return huidigJaar - indexJaar;

    }
}
