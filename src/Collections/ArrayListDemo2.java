package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList<>();
        al.add(100);
        al.add(50);
        al.add(44);
        al.add(130);
        al.add(11);
        al.add(200);
        al.add(126);
        al.add(200);
        System.out.println(al);
//        Collections.sort(al);
//        System.out.println(al);
//        Collections.reverse(al);
//        System.out.println(al);
        Comparator c=Collections.reverseOrder();
        Collections.sort(al,c);
        System.out.println(al);
        Collections.rotate(al,2);
        System.out.println(al);
        System.out.println(Collections.frequency(al,200));
        Collections.shuffle(al);
        System.out.println(al);


    }
}
