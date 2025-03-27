package Stream_api;

import java.util.Date;

public class Stuff {
    public static void doStuff(){
        System.out.println("First line of code");
        System.out.println("Second line of code");
        System.out.println(new Date());
    }
    public static void ThreadMethod()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println(i*2);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void printNumber()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
