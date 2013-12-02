package workshop4.interfaceExample;

/**
 * Created with IntelliJ IDEA.
 * User: remcoruijsenaars
 * Date: 11/28/13
 * Time: 10:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class JavaDocent extends Persoon implements JavaExpert{

    private boolean ervaringInBedrijfsLeven;

    public JavaDocent(String name, boolean ervaringInBedrijfsLeven){
        super(name);
        this.ervaringInBedrijfsLeven = ervaringInBedrijfsLeven;
    }

    @Override
    public String vragen(String vraag) {
        return "Ik kijk even dit tentamen na, dan loop ik zo naar je toe om je vraag te beantwoorden";
    }

    @Override
    public void programmeerCodeSchrijven() {
        System.out.println("klop, lesgeven, practicum begeleiden, klop, klop");
    }
}
