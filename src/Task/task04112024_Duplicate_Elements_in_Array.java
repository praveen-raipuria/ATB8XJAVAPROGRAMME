package Task;

import java.util.HashSet;
//Duplicate Elements of an Array
public class task04112024_Duplicate_Elements_in_Array {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 1, 2};
        HashSet<Integer> nums = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for (int number : numbers) {
            if (!nums.add(number)) {
                duplicate.add(number);
            }
        }

        System.out.println("Duplicate elements: " + duplicate);
    }
}


