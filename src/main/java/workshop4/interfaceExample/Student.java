package workshop4.interfaceExample;

/**
 * Created with IntelliJ IDEA.
 * User: remcoruijsenaars
 * Date: 11/28/13
 * Time: 11:20 AM
 * To change this template use File | Settings | File Templates.
 */
public class Student extends Persoon {

    private JavaExpert begeleider;

    public Student(String name, JavaExpert begeleider) {
        super(name);
        this.begeleider = begeleider;
    }

    public JavaExpert getBegeleider() {
        return begeleider;
    }

    public void setBegeleider(JavaExpert begeleider) {
        this.begeleider = begeleider;
    }

    public void stelVraag(String vraag){
        System.out.println(getName() + " vraagt aan expert : "  + vraag );
        System.out.println(begeleider.vragen(vraag));
    }

}
