package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GenericArrayDemo1 {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<Student>();
        Student st1=new Student("Seema",40,"Mumbai");
        Student st2=new Student("Kajol",24,"Delhi");
        Student st3=new Student("Priya",30,"Hyderabad");

        al.add(st1);
        al.add(st2);
        al.add(st3);
        System.out.println(al);



    }
}
