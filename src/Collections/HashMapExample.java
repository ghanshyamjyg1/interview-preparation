package Collections;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("a",100);
        hm.put("d",20);
        hm.put("f",10);
        hm.put("g",200);
        hm.put("j",180);
        hm.put("dm",202);
        System.out.println(hm);
        System.out.println(hm.get("g"));
        hm.forEach((e,f)-> {
            System.out.println(e+" -> "+f);
        });

    }
}
