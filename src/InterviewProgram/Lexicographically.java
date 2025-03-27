package InterviewProgram;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Lexicographically {
    public static void main(String[] args) {
//        String A="hello";
//        String B="java";
//        System.out.println(A.length()+B.length());
//        char AA = A.toUpperCase().charAt(0);// H
//        char BB = B.toUpperCase().charAt(0);//J
//        if(AA>BB)
//        {
//            System.out.println("Yes");
//        }
//        else {
//            System.out.println("No");
//        }
//        String replaceA = A.replace(A.charAt(0), AA);
//
//        String replaceB = B.replace(B.charAt(0), BB);
//        System.out.println(replaceA+" "+replaceB);

        String s="welcometojava";
        System.out.println(s.length());
        ArrayList<String > arrayList=new ArrayList<>();
        for (int i=0; i<s.length()-2;i++)
        {
            arrayList.add(s.substring(i,i+3));
        }

        arrayList.stream().sorted();
        arrayList.stream().forEach(System.out::println);
        String smallest=arrayList.getLast();
        String largest= arrayList.getFirst();
        System.out.println(smallest+" "+largest);

    }
}
