package StreamProgram;

import java.util.*;

public class StreamJava8Program {
    public static void main(String[] args) {
        int[] num={12,19,20,88,00,9};
        OptionalInt asInt = Arrays.stream(num).max();
        System.out.println(asInt.getAsInt());

    }
}
