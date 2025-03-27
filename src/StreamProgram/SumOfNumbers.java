package StreamProgram;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,5,6,7,8);
        Optional<Integer> sum = numbers.stream().filter(i->i%2==0).reduce((a, b) -> a + b);
        System.out.println("Sum of numbers : "+sum.get());

        double average = numbers.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println("Average of numbers : "+ average);

        double avg = numbers.stream()
                .map(i -> i * i)
                .filter(i -> i > 25)
                .mapToInt(i -> i)
                .average().getAsDouble();
        System.out.println(avg);
        //find odd and even numbers from list
        List<Integer> evenNumber = numbers.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());

        List<Integer> oddNumber = numbers.stream()
                        .filter(e->e%2!=0)
                                .collect(Collectors.toList());
        System.out.println("Even numbers : "+evenNumber);
        System.out.println("Odd Numbers : "+oddNumber);

        List<Integer> Num = Arrays.asList(112, -222, 234,567,890,432,236,211,22);
        //Collect the numbers which start with '2'
        List<Integer> StartWith=Num.stream()
                .map(e->String.valueOf(e))
                .filter(e->e.startsWith("2")|| e.startsWith("-2"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println("Numbers start with 2 : "+StartWith);

        //Duplicate numbers 1 way
        List<Integer> list1 = Arrays.asList (1,3,10,0,20,30,2,15,1,13,1111,2,2,10,30,19,3);
//        Set<Integer> DuplicateNumbers = list1.stream()
//                        .filter(e-> Collections.frequency(list1,e)>1)
//                                .collect(Collectors.toSet());
        //Duplicate numbers 2nd way
        Set<Integer> set1=new HashSet<>();

        Set<Integer> DuplicateNumbers=list1.stream()
                                        .filter(e->!set1.add(e))
                                            .collect(Collectors.toSet());

        System.out.println("Duplicate numbers : "+DuplicateNumbers);

        //Find max and min numbers
        Integer max=list1.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Maximum of number : "+max);
       Integer min= list1.stream().min((a,b)->a.compareTo(b)).get();
       System.out.println("Minimum of number : "+min);

       //Sort the numbers in ascd or dscn order
        List<Integer> assending = list1.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Ascending Order : "+assending);
        List<Integer> desending =  list1.stream()
                        .sorted(Collections.reverseOrder()).toList();
        System.out.println("Descending order : "+desending);

        //Get first 5 numbers from the list
        List<Integer> Nnumbers = list1.stream().limit(5).toList();
        System.out.println("First N numbers from list : "+Nnumbers);
        Integer sumOfNumbers =list1.stream().limit(5).reduce((p,q)->p+q).get();
        System.out.println("Sum of N Numbers : "+sumOfNumbers);

        //Skip first N numbers from the list
        List<Integer> sk=list1.stream().skip(5).toList();
        System.out.println("Skip first 5 Number from list : "+sk);

        //Get second highest and lowest number from the list

        int SecH=list1.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println("Second highest number : "+SecH);
        int SecL=list1.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println("Second Lowest number : "+SecL);


    }
}
