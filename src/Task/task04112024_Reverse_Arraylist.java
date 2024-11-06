package Task;

import java.util.ArrayList;
import java.util.List;

public class task04112024_Reverse_Arraylist {
    public static void main(String[] args) {
        List<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);
        System.out.println("Array List is :"+al);
//        System.out.println(al.reversed());

        int index=0;
        for (int i=al.size()-1;i>0;i--){
            al.add(index, al.get(al.size()-1));
            al.remove(al.size()-1);
            index++;
        }
        System.out.println("Reverse Array List is :"+al);
    }
}


