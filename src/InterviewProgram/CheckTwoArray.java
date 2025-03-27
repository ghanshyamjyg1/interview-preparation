package InterviewProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CheckTwoArray {
    public static void main(String[] args) {
        int[] array1 = {22, 33, 56, 66, 55, 44, 88};
        int[] array2 = {88, 22, 33, 44, 55, 66, 56};
//        Arrays.sort(array1);
//        Arrays.sort(array2);
        boolean result = areEqual(array1, array2);
        if (result) {
            System.out.println("Both arrays are same");
        } else {
            System.out.println("Both arrays are not same");
        }

    }

    private static boolean areEqual(int[] array1, int[] array2) {

        int m = array1.length;
        int n = array2.length;
        if (m != n) {
            return false;
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        for (int i = 0; i < m; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;

    }

}
