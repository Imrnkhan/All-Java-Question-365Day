package Zap;


import java.lang.reflect.Array;
import java.util.*;

//public class Practice {
//    public static void main(String[] args) {
////        int[] arr = {9,4,1,7};
////        List<Integer> numbers = new ArrayList<>(Arrays.asList(9, 4, 1, 7,4,4,4,4));
////        int frequency = Collections.frequency(numbers, 4);
////        System.out.println(frequency);
//
//        Map<String, Integer> scores = new HashMap<>();
//        scores.put("Alice", 90);
//        scores.put("Bob", 85);
//        scores.put("Charlie", 95);
//
//        // Iterate over the entries in the map
//        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
//            String name = entry.getKey();
//            int score = entry.getValue();
//
//            System.out.println("Name: " + name + ", Score: " + score);
//        }
//
//
//    }
//
//}
//

public class practice {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= arr.length; j++) {
                int[] subarray = Arrays.copyOfRange(arr, i, j);
                printSubarray(subarray);
            }
        }
    }

    public static void printSubarray(int[] subarray) {
        for (int i = 0; i < subarray.length; i++) {
            System.out.print(subarray[i] + " ");
        }
        System.out.println();
    }
}