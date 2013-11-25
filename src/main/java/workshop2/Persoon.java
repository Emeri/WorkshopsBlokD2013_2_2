package workshop2;

/**
 * Created with IntelliJ IDEA.
 * User: remcoruijsenaars
 * Date: 11/23/13
 * Time: 7:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class Persoon {

    private String naam;
    private String adres;

    private double salaris;

    public static double MINIMUMSALARIS = 1200;

    public Persoon(){}

    public Persoon(String naam, String adres, double salaris) {
        this.naam = naam;
        this.adres = adres;
        this.salaris = salaris;
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
        this.salaris = salaris;
    }
}
