package InterviewProgram;

import java.util.Arrays;

public class CompareTwoStrings {
    public static void main(String[] args) {
        String str1="Sandeep";
        String str2="Sandeep";

        Boolean result=IsCompare(str1,str2);
        if (result)
        {
            System.out.println("Both string are same");
        }
        else {
            System.out.println("Both string are not same");
        }
    }

    private static boolean IsCompare(String str1, String str2) {
        int count = 0;
        if(str1.length()!=str2.length())
        {
            return false;
        }
        for (int i=0; i<str1.length();i++)
        {
            if(str1.charAt(i)==str2.charAt(i))
            {
                count++;
            }
        }
        if (count != str2.length())
        {
            return false;
        }
        return true;
    }
}
