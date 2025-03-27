package Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo1 {
    public static void main(String[] args) {
        CopyOnWriteArrayList al=new CopyOnWriteArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(11);
        al.add(12);

       Iterator itr=al.iterator();
        Iterator itr2=al.iterator();
       while (itr.hasNext()==true)
       {
           System.out.print(itr.next()+" ");
           al.add(999);
       }

    }


}
