package workshop2;

/**
 * Created with IntelliJ IDEA.
 * User: remcoruijsenaars
 * Date: 11/23/13
 * Time: 7:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class PersoonUitgewerkt {

    private String naam;
    private String adres;

    private double salaris;

    public static double MINIMUMSALARIS = 1200;

    public PersoonUitgewerkt(){
        this.salaris = MINIMUMSALARIS;
    }

    public PersoonUitgewerkt(String naam, String adres, double salaris) {
        this.naam = naam;
        this.adres = adres;
        setSalaris(salaris);
    }


    public String persoonsGegevens(){
      return naam + " " + adres + " " + salaris;
    }

    @Override
    public String toString(){
        return persoonsGegevens();
    }


    //TODO implementeren
    public void verhoogSalaris(double percentage){
        double bedrag = salaris * (percentage / 100);
        setSalaris(salaris + bedrag);
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public double getSalaris() {
        return salaris;
    }

    public void setSalaris(double salaris) {
        if(salaris < MINIMUMSALARIS){
            this.salaris = MINIMUMSALARIS;
        }else{
            this.salaris = salaris;
        }


    }
}
