package Task;

import java.util.HashMap;
import java.util.Map;

public class task04112024_Iterate_Over_Map {
    public static void main(String[] args) {
        //How do you iterate over a Map in Java?

        HashMap<Integer,String> hm=new HashMap();
        hm.put(1,"One");
        hm.put(2,"Two");
        hm.put(3,"Three");
        hm.put(4,"Four");
        hm.put(5,"Five");
        hm.put(6,"Six");
        hm.put(7,"Seven");
        hm.put(8,"Eight");
        hm.put(null,null);
        hm.put(null,"Nine");
        System.out.println(hm);

        for (Map.Entry <Integer,String> item: hm.entrySet()){
            System.out.println(item.getKey()+" -> "+item.getValue());
        }

    }
}


