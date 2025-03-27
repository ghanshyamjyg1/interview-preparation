package Stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {
        List list123=new ArrayList<>();
        list123.add(1);
        list123.add("mahi");
        list123.add(true);
        System.out.println(list123);

        List<Integer> list1=List.of(22,1,3,4,55,66);
        List<Integer> list2=new ArrayList<>();
        list2.add(33);
        list2.add(24);
        list2.add(3);
        list2.add(77);
        list2.add(24);
        List<Integer> list3=Arrays.asList(22,11,44,33,12);

        List<Integer> listEven=new ArrayList<>();

        //Without stream
        for (Integer i:list1) {
            if(i%2==0)
            {
                listEven.add(i);
            }
        }
//        System.out.println(listEven);

        //With stream Api
        /*Stream<Integer> stream = list1.stream();
        List<Integer> newList = stream.filter(i -> i % 2 != 0).collect(Collectors.toList());
        System.out.println(newList);*/
        List<Integer> newList1 = list1.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
//        System.out.println(newList1);
        //find the number which is more than 50 from list1
        List<Integer> newList2 = list1.stream().filter(i -> i > 50).collect(Collectors.toList());
//        newList2.forEach(e->System.out.print(" "+e));
//        System.out.println("Number more than 50 "+newList2);

        List<String> names=List.of("Amit","Kunal","Akash","Abhijeet","Ajay","Dipesh");
//        first way to print the element
//        names.stream().filter(e->e.startsWith("A")).forEach(System.out::println);
//        Second way to print element
        List<String> Names2 = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
//        System.out.println(Names2);
        List<Integer> collect1 = list2.stream().map(i -> i * i).sorted((x,y)->y.compareTo(x)).collect(Collectors.toList());
        collect1.stream().forEach(ii->{
            System.out.println(ii);
        });
//        Integer i = list2.stream().min((x, y) -> x.compareTo(y)).get();
//        System.out.println("Minimum "+i);
//        Integer i1 = list2.stream().max((x, y) -> x.compareTo(y)).get();
//        System.out.println("Maximum "+i1);


    }
}
