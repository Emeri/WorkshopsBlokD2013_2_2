

package workshop6._.StackExample;

import java.util.Date;

/**
 *
 * @author remcoruijsenaars
 */
public class Aktie {
    
    private String naam;
    private Date date;

    public Aktie(String naam, Date date) {
        this.naam = naam;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
    
    public String voeruit(){
        return "Aktie " + naam  + " aangemaakt op " + date.toString() +  " uitvoeren";
    }
    
    public String ongedaanMaken(){
        return "Aktie " + naam + " uitgevoerd op "  + date.toString() + " ongedaan maken";
    }
    
}
