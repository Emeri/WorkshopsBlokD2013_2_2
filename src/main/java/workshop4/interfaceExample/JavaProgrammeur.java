package workshop4.interfaceExample;

/**
 * Created with IntelliJ IDEA.
 * User: remcoruijsenaars
 * Date: 11/28/13
 * Time: 10:59 AM
 * To change this template use File | Settings | File Templates.
 */
public class JavaProgrammeur extends Persoon implements JavaExpert{

    public JavaProgrammeur(String name){
        super(name);
    }

    @Override
    public String vragen(String vraag) {
        return getName()+ " antwoord: Op deze vraag kom ik terug. " +
                "Ik ben nu druk aan het programmeren voor een klant";
    }

    @Override
    public void programmeerCodeSchrijven() {
        System.out.println("Klop klop klop klop klop");
    }
}
