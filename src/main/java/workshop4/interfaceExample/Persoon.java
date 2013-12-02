package workshop4.interfaceExample;

/**
 * Created with IntelliJ IDEA.
 * User: remcoruijsenaars
 * Date: 11/28/13
 * Time: 10:49 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Persoon {

    private String name;

    protected Persoon(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
