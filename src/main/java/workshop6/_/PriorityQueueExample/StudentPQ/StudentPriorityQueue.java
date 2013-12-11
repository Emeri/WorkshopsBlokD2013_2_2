package workshop6._.PriorityQueueExample.StudentPQ;

import java.util.PriorityQueue;


/**
 *
 * @author remcoruijsenaars
 */
public class StudentPriorityQueue {

    public static void main(String[] args){
        PriorityQueue<Student> studenten = new PriorityQueue();
        
        Student s1 = new Student(1, DateUtil.getDateInstance(1978, 3, 18));
        Student s2 = new Student(2, DateUtil.getDateInstance(1962, 1, 24));
        Student s3 = new Student(3, DateUtil.getDateInstance(1978, 5, 31));
        
        studenten.add(s1);
        studenten.add(s2);
        studenten.add(s3);
        
        System.out.println(studenten.poll().getGeboorteDatum());
        System.out.println(studenten.poll().getGeboorteDatum());
        System.out.println(studenten.poll().getGeboorteDatum());
        
    }
}
