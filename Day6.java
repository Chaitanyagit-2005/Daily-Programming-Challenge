import java.util.*;

public class Day6 {
    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        int n = arr.length;
        int prefix = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();
        map.put(0, new ArrayList<>(Arrays.asList(-1)));

        for (int i = 0; i < n; i++) {
            prefix += arr[i];
            if (map.containsKey(prefix)) {
                for (int start : map.get(prefix)) {
                    result.add(new int[]{start + 1, i});
                }
            }
            map.computeIfAbsent(prefix, k -> new ArrayList<>()).add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 3, -1, 2};
        List<int[]> subarrays = findZeroSumSubarrays(arr);
        for (int[] sub : subarrays) {
            System.out.println("(" + sub[0] + ", " + sub[1] + ")");
        }
    }
}
