package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_example {
    public static void main(String[] args) {
        ArrayList<Student> arr=new ArrayList<Student>();
        arr.add(new Student("Kunal",26,"Hyd"));
        arr.add(new Student("Mahesh",16,"Bgr"));
        arr.add(new Student("Dipesh",20,"Dbg"));
        System.out.println(arr);
        Collections.sort(arr,new AgeComparator());
        System.out.println("Sorting based on Age "+arr);
        Collections.sort(arr,new NameComparator());
        System.out.println("Sorting based on Name "+arr);
        Collections.sort(arr,new CityComparator());

        System.out.println("Sorting based on City "+arr);

    }
}
