package Generic;
import java.util.*;

public class BoxMain {
    public static void main(String[] args) {
        Box<Integer> box=new Box<Integer>(1233);
        System.out.println(box.getValue());
        System.out.println(box.container.getClass().getName());

        Box<String> box2=new Box<String>("Woow so beautiful");
        System.out.println(box2.getValue());
        System.out.println(box2.container.getClass().getName());

        box.getTask();
        box2.getTask();


    }
}
