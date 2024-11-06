package Task;

import java.util.HashMap;
import java.util.Hashtable;

public class task04112024_Hashtable_Hashmap {
    public static void main(String[] args) {
        //What is a Hashtable in Java, and how does it differ from HashMap?
        //Hash Map-Allows null key once and null value
        //Hash Table-Does not Allow null value and key.Legacy class,Synchronised and slow

        HashMap<String,Integer> hm=new HashMap();
        hm.put("One",1);
        hm.put("Two",2);
        hm.put("Three",3);
        hm.put("Four",4);
        hm.put("Five",5);
        hm.put(null,6);
        hm.put("Seven",null);
        System.out.println(hm);

        Hashtable<String,Integer> ht=new Hashtable();
        ht.put("One",1);
        ht.put("Two",2);
        ht.put("Three",3);
        ht.put("Four",4);
        ht.put("Five",5);
//        ht.put(null,6); //java.lang.NullPointerException
//        ht.put("Seven",null); //java.lang.NullPointerException
        System.out.println(ht);
    }
    }

