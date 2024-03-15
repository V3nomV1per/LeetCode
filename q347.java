// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class q347 {
    @SuppressWarnings("unchecked")
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for (int key : freqMap.keySet()) {
            int freq = freqMap.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int[] result = new int[k];
        int counter = 0;
        for (int i = bucket.length-1; i >= 0 && counter < k; i--) {
            if (bucket[i] != null) {
                for (Integer buckVal : bucket[i]) {
                    result[counter++] += buckVal; 
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
}

