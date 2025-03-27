package GFG_Program;

import java.util.*;

class ExtraElement {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            int n = sc.nextInt();
//            int[] a = new int[n];
//            int[] b = new int[n - 1];
//            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
//            for (int i = 0; i < n - 1; i++) b[i] = sc.nextInt();
       int n = 2, arr1[] = {11}, arr2[] = {11,22};
            Solution g=new Solution();
            System.out.println(g.findExtra(n, arr1, arr2));
        }

}