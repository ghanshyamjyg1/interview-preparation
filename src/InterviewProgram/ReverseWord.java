package InterviewProgram;

public class ReverseWord {
    public static void main(String[] args) {
        String str= "Welcome to the java world kunal";
        char[] charArray = str.toCharArray();
        String[] s = str.split(" ");
        int count=0;
        if(str.charAt(0)!=' ')
        {
            count++;
        }
        for (int j=0;j< charArray.length;j++)
        {
            if ((str.charAt(j))==' ' && str.charAt(j+1)!=' ') {
                count++;
            }
        }


//        for (int i=0;i< s.length;i++)
//        {
//            System.out.print(s[s.length-1-i]+ " " );
//            count++;
//        }
        System.out.print("\nCount of word "+count);
        System.out.print("\nCount of space in sentence "+(count-1));
    }
}
