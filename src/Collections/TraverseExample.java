package Collections;

import java.util.*;

public class TraverseExample {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<String>();
        names.add("Kunal");
        names.add("Sanjay");
        names.add("Rajesh");
        names.add("Bikash");
        names.add("Rajendra");
        names.add("Kunal");

        //Print list with the help of forEach
        for (String str:names)
        {
            System.out.print(str +"\t"+str.length()+ "\t");
            StringBuilder stringBuilder=new StringBuilder(str);
            System.out.println(stringBuilder.reverse());
        }
        System.out.println("-----------------------");

        //traversing using Iterator : Forward iterator

        Iterator<String> itr = names.iterator();
        while (itr.hasNext())
        {
            String next = itr.next();
            System.out.println(next);
        }
        System.out.println("+++++++++++++++++++++++++++++");
        //traversing using list Iterator : Backward iterator
        ListIterator<String> stringListIterator = names.listIterator(names.size());
        while (stringListIterator.hasPrevious())
        {
            System.out.println(stringListIterator.previous());
        }
        System.out.println("########################");
        //foreach method
        names.forEach(s->System.out.println(s));
        System.out.println("************************");
        //forEach with the help of stream
        names.stream().forEach(System.out::println);
System.out.println("_______TreeSet method__________");
        //Sorting the list with Treeset
        TreeSet<String > ts=new TreeSet<>();
        ts.addAll(names);
        ts.forEach(s->System.out.println(s));
        System.out.println("=====Find duplicate item=========");
        // Creating an object of TreeSet
        TreeSet<String> dupliCheckr = new TreeSet<String>();
        for (String dd : names)
        {
            if (!dupliCheckr.add(dd))
            {
                System.out.println("Duplicate elements "+dd);
            }
        }


    }
}
