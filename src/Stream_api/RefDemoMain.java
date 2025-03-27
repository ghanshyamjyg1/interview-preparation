package Stream_api;

public class RefDemoMain {
    public static void main(String[] kunal){
        System.out.println("main class started");
        //Reffering static method
        // className::methodName
        WorkInter workInter= Stuff::doStuff;
        workInter.doTask();

        Runnable runnable=Stuff::ThreadMethod;

        Thread t=new Thread(runnable);
        t.start();

        //Reffering non-static method
        // classObject::methodName
        Stuff stuff=new Stuff();
        Runnable runnable1=stuff::printNumber;

        Thread t1=new Thread(runnable1);
        t1.start();
    }
}
