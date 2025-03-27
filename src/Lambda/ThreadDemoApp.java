package Lambda;

public class ThreadDemoApp {
    public static void main(String[] args) {
        // Our first thread program using lambda expression

        Runnable r1=()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("The value of iterator "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
//        r1.run();
        Thread t1=new Thread(r1);
        t1.setName("JOHN");
        t1.start();

        Runnable r2=()->{
            for (int i = 1; i <=10 ; i++) {
                System.out.println(i*2);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t2=new Thread(r2);
        t2.setName("Table");
        t2.start();
    }
}
