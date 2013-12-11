

package workshop6._.HashMapExample;

import java.awt.Color;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author remcoruijsenaars
 */
public class MainHashMap {
    

    
    public static void main(String[] args){
        
        Map<Student, Color> favorieteKleurenStudenten = new HashMap();
        


        favorieteKleurenStudenten.put(new Student("Jan"), Color.blue);
        favorieteKleurenStudenten.put(new Student("Kees"), Color.red);
        favorieteKleurenStudenten.put(new Student("Truus"), Color.yellow);
        favorieteKleurenStudenten.put(new Student("Truus"), Color.yellow);

        //Inhoud Map uitprinten
        Set<Student> studenten = favorieteKleurenStudenten.keySet();

        for(Student student : studenten){
            Color value = favorieteKleurenStudenten.get(student);
            System.out.println(student.getNaam() + "->" + value);
        }

    }
}
