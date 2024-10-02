package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Rank_Transform_Of_An_Array_Leetcode_1331 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayRankTransform(new int[]{10,10,10})));
    }
    public  static int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> valueToRank = new HashMap<>();
        int[] sortedUniqueNumbers = Arrays.stream(arr).distinct().sorted().toArray();
        for (int i = 0; i < sortedUniqueNumbers.length; i++) {
            valueToRank.put(sortedUniqueNumbers[i], i + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = valueToRank.get(arr[i]);
        }
        return arr;
    }
}
