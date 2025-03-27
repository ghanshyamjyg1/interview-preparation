package InterviewProgram;

import java.util.ArrayList;

public class OccurenceOfString {
    public static void main(String[] args) {
        String str="CloudTech";
        ArrayList<Character> characterArrayList=new ArrayList<>();

        String lowerCase = str.toLowerCase();
//        ArrayList<Character> originalCharacterArrayList=new ArrayList<>();
//        originalCharacterArrayList.addAll(originalCharacterArrayList);

        char c='c';
        char[] charArray = lowerCase.toCharArray();
        System.out.println(lowerCase);
        for (int i=0; i<charArray.length;i++){
            if(charArray[i]!=c)
            {
                characterArrayList.add(charArray[i]);

            }
        }
        System.out.println("String after removing "+c);
        characterArrayList.forEach(System.out::print);

    }
}
