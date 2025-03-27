package Arrays;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int a[]=new int[5];
        int i=0;
        do {
            System.out.println("Pleasse enter "+i +" marks of the student");
            a[i]=scan.nextInt();
            i++;
        }while (i<=a.length-1);

        System.out.println("Arrays content are !!!");
        int j=0;
        do {
            System.out.println("The "+j+" marks of the student is "+a[j]);
            j++;
        }while (j<=a.length-1);
    }
}
