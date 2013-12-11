

package workshop6._.PriorityQueueExample.StudentPQ;

import java.util.Date;

/**
 *
 * @author remcoruijsenaars
 */
public class Student implements Comparable {
    
    private int idNummer;
    private Date geboorteDatum;

    public Student(int idNummer, Date geboorteDatum) {
        this.idNummer = idNummer;
        this.geboorteDatum = geboorteDatum;
    }

    public Date getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setGeboorteDatum(Date geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }

    public int getIdNummer() {
        return idNummer;
    }

    public void setIdNummer(int idNummer) {
        this.idNummer = idNummer;
    }

    //@Override
    public int compareTo(Object o) {

        Student other = (Student)o;
        if(other.getGeboorteDatum().before(geboorteDatum)){
            return 1;
        }else if(other.getGeboorteDatum().equals(geboorteDatum)){
            return 0;
        }else{
            return -1;
        }
    }
    
}
