package workshop2;

/**
 * Created with IntelliJ IDEA.
 * User: remcoruijsenaars
 * Date: 11/24/13
 * Time: 7:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class TentamenResultaat {

    private Student student;
    private double cijfer;

    public TentamenResultaat(double cijfer, Student student) {
        this.cijfer = cijfer;
        this.student = student;
    }

    public double getCijfer() {
        return cijfer;
    }

    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString(){
        return student.getNaam() + " heeft een " + cijfer + " behaald";
    }
}
