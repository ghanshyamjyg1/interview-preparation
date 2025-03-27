package InterviewProgram;

import java.util.Arrays;

public class TwoStringAnagram {
    public static void main(String[] args) {
        String str1 = "Race";
        String str2 = "Care";
        str1=str1.toLowerCase();//race
        str2=str2.toLowerCase(); //care

        boolean result=isAnagram(str1,str2);
        if(result)
        {
            System.out.println("Both strings are Anagram");
        }
        else {
            System.out.println("Both String are Not anagram");
        }
    }

    private static boolean isAnagram(String str1, String str2) {


        if(str1.length()!=str2.length())
        {
            return false;
        }
        char[] charArray1 = str1.toCharArray();// r a c e
        char[] charArray2 = str2.toCharArray();// c a r e
        Arrays.sort(charArray1); // a c e r
        Arrays.sort(charArray2); // a c e r

        boolean res=Arrays.equals(charArray1,charArray2);
        if(res!=true)
        {
            return false;
        }
        return true;

    }
}
