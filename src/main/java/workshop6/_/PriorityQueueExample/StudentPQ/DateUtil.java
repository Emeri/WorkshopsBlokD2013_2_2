

package workshop6._.PriorityQueueExample.StudentPQ;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author remcoruijsenaars
 */
public class DateUtil {
    
    public static Date getDateInstance(int year, int month, int day){
        Calendar c = Calendar.getInstance();
        try{
            c.set(year,month,day);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            return null;
        }
        
        return c.getTime();
    }

}
