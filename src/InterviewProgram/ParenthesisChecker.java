package InterviewProgram;

import java.util.Stack;

public class ParenthesisChecker {
    public static void main(String[] args) {
        String parenthesis = "[{()}]";//6
        Stack<Character> stack=new Stack<>();
        for (int i=0; i<parenthesis.length();i++)
        {
            char ch=parenthesis.charAt(i);
            if(stack.empty()){
                stack.push(ch); // [
            } else if (ch=='{' || ch=='(' ||ch=='[' ){
                stack.push(ch); // [ { (
            } else if (ch=='}' && stack.peek()=='{') {
                stack.pop();//)
            } else if (ch==')' && stack.peek()=='(') {
                stack.pop();//}
            } else if (ch==']' && stack.peek()=='[') {
                stack.pop();//]
            }
        }
        if(stack.empty()){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}
