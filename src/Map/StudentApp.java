package Map;

import java.util.*;

public class StudentApp {
    public static void main(String[] args) {
//        Student s1=new Student("siddu",21,"banglore","Male","siddu@gmail.com",88,975367877767923L);
//        Student s2=new Student("Abhi",18,"Hyderbad","Male","Abhi@gmail.com",98,8567678767923L);
//        Student s3=new Student("Piya",26,"Kolkata","Female","Piya@gmail.com",78,23454577767923L);

        HashMap hm=new HashMap();
        hm.put(100,12345);
        hm.put(200,67890);
        hm.put(300,475336);
        hm.put(400,9753457);
        System.out.println(hm);
        Set keys=hm.keySet();
        Iterator itr=keys.iterator();
        while (itr.hasNext()==true)
        {
            System.out.print(itr.next()+ " ");
        }
        System.out.println();
        Collection val =  hm.values();
        Iterator vitr=val.iterator();
        while (vitr.hasNext()==true)
        {
            System.out.print(vitr.next()+" ");
        }
        System.out.println();
        Set kv=hm.entrySet();
        Iterator kvitr=kv.iterator();
        while (kvitr.hasNext()==true)
        {
            System.out.print(kvitr.next()+" ");
        }

    }
}
