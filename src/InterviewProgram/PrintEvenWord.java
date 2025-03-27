package InterviewProgram;

public class PrintEvenWord {
    public static void main(String[] args) {
        String str="Hell World kunal Love";

//        System.out.println(s[0]);
//        System.out.println(s[1]);
        for (String s : str.split(" "))
        {
            if(s.length()%2==0)
            {
                System.out.println(s);
            }
        }
    }
}
