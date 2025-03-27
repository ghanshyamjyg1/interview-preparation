package FunctionalInterface;

import Lambda.SumInter;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class ConsumerExam {
    public static void main(String[] args) {
        //It take single input but it will not return anything
        Consumer<String> c=s -> System.out.println(s);
        c.accept("Hello");
        c.accept("DURGASOFT");

        //It take single input and return boolean data
        Predicate<Integer> p= k->k.equals(5);
        Boolean temp1=p.test(4);
        System.out.println(temp1);
        System.out.println(p.test(5));

        // It take input and return output
        Function<String,Integer> f=l->l.length();
        int temp2=f.apply("Kunal");
        System.out.println(temp2);
        System.out.println(f.apply("Priyam"));
        System.out.println("---------------------------------");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.stream().filter(s->s>=5).forEach(System.out::println);
        System.out.println("----Find all repeat element from the array-----");
        int[] arr1 = {5, 13, 4, 21, 13, 27, 2, 59, 59, 34};
        Set<Integer> item=new HashSet<>();
        Arrays.stream(arr1).filter(s -> !item.add(s)).forEach(System.out::println);
        System.out.println(item.stream().max(Integer::compare));


    }


}
