package DSA100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrFindDuplicates {

    public static List<Integer> findduplicates(Integer[] arr) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);

        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }

        if(result.isEmpty()){
             result.add(-1);
        }

        return result;
    }

    public static List<Integer> removeDuplicates(Integer[] arr) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Boolean> map = new HashMap<>();
        for (int num : arr) {

            if (!map.containsKey(num)) {
                result.add(num);
                map.put(num, true);
            }
        }

        return result;

    }

    public static void main(String[] args) {
        Integer[] arr = { 1, 5, 3, 3, 5, 64, 9 };
        List<Integer> duplicates = findduplicates(arr);
        for (int n : duplicates) {
            System.out.println(n + " ");
        }
        
        System.out.println(removeDuplicates(arr));
    }
}
