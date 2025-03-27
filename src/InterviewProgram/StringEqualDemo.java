package InterviewProgram;

import java.util.Objects;

public class StringEqualDemo {
    public static void main(String[] args) {
        String s1=new String("Kunal");
        String s2=new String("Kunal");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        int b1=s1.compareTo(s2);
        if(b1==0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        int b2=s1.compareToIgnoreCase(s2);
        if(b2==0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        boolean equals = Objects.equals(s1, s2);
        if(equals == true)
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }


    }
}
