package workshop6._.HashMapExample;

/**
 *
 * @author remcoruijsenaars
 */
public class Student {
    
    private String naam;

    public Student(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public boolean equals(Object obj) {
        return naam.equals(((Student)obj).getNaam());
    }

    @Override
    public int hashCode() {
        return naam.hashCode();
    }
}
