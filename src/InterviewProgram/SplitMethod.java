package InterviewProgram;

import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SplitMethod {
    public static void main(String[] args) {
        String s="091-1234567890";
        String[] split1 = s.split("-");

        printString(split1,"Split by split method");
        List<String> collect = Pattern.compile("-").splitAsStream(s).collect(Collectors.toList());
        System.out.println("Split by pattern method");
       collect.forEach(System.out::println);

        StringTokenizer stringTokenizer=new StringTokenizer(s,"-");
        System.out.println("Split by StringTokenizer class");
        while (stringTokenizer.hasMoreTokens())
        {
            String s1 = stringTokenizer.nextToken();
            System.out.println(s1);
        }
    }

    private static void printString(String[] split, String splitBySplitMethod) {
        System.out.println(splitBySplitMethod);
        for(String str : split)
        {
            System.out.println(str);
        }
    }
}
