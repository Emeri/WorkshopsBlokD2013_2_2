package workshop4;

import workshop4.interfaceExample.JavaDocent;
import workshop4.interfaceExample.JavaExpert;
import workshop4.interfaceExample.JavaProgrammeur;
import workshop4.interfaceExample.Student;

/**
 * Created with IntelliJ IDEA.
 * User: remcoruijsenaars
 * Date: 11/28/13
 * Time: 11:13 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args){

        JavaExpert expert1 = new JavaDocent("Remco", true);
        JavaExpert expert2 = new JavaProgrammeur("Alan");


        Student student = new Student("Mees", expert2);

        student.stelVraag("Wat is een interface?");

        student.setBegeleider(expert1);
        expert2.programmeerCodeSchrijven();
        expert2.programmeerCodeSchrijven();
        expert2.programmeerCodeSchrijven();
        expert2.programmeerCodeSchrijven();

        student.stelVraag("Wat is een interface?");

        expert1.programmeerCodeSchrijven();




    }
}
