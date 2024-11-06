package Task;

import java.util.HashMap;
import java.util.Map;

public class task04112024_Frequency_of_Each_Element_in_Array {
    public static void main(String[] args) {
        //Find the Frequency of Each Element in an Array ( Hashmap)
        Integer[] numbers = {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};
        HashMap<Integer,Integer> hm=new HashMap();

        for (int num:numbers){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }

        for (Map.Entry<Integer,Integer> item: hm.entrySet()){
            System.out.println("Element: "+item.getKey()+" Frequency: "+ item.getValue());
        }

    }
}

