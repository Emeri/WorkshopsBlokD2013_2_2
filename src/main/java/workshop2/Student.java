package workshop2;

/**
 * Created with IntelliJ IDEA.
 * User: remcoruijsenaars
 * Date: 11/24/13
 * Time: 7:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class Student {
    private String naam;
    private String studentNummer;

    public Student(String studentNummer, String naam) {
        this.studentNummer = studentNummer;
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getStudentNummer() {
        return studentNummer;
    }

    public void setStudentNummer(String studentNummer) {
        this.studentNummer = studentNummer;
    }
}
