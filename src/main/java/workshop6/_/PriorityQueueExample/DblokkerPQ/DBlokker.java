package workshop6._.PriorityQueueExample.DblokkerPQ;

/**
 * Created with IntelliJ IDEA.
 * User: remcoruijsenaars
 * Date: 12/9/13
 * Time: 11:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class DBlokker implements Comparable<DBlokker> {

    private String name;
    private int studieUren;
    private boolean komtWelEenstTeLaat;


    public DBlokker(String name, int studieUren, boolean komtWelEenstTeLaat) {
        this.name = name;
        this.studieUren = studieUren;
        this.komtWelEenstTeLaat = komtWelEenstTeLaat;
    }


    @Override
    public int compareTo(DBlokker other) {
        if(other.komtWelEenstTeLaat & !this.komtWelEenstTeLaat){
            return -1;
        }else if(!other.komtWelEenstTeLaat & this.komtWelEenstTeLaat){
            return 1;
        }
        else{
            if(other.studieUren > this.studieUren){
                return 1;
            }
            else if (other.studieUren < this.studieUren){
                return -1;
            }else{
                return 0;
            }
        }

    }




    @Override
    public String toString() {
        return String.format("%s komt %s te laat en studeert %d uur per week", name, komtWelEenstTeLaat? "weleens": "nooit", studieUren  );
    }


}
