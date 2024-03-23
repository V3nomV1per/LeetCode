import java.util.Arrays;
import java.util.HashMap;

public class q128 {
    public static int longestConsecutive(int[] nums) {
        int maxLength = 0;
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for (int i : nums) {
            map.put(i, Boolean.FALSE);
        }
        for (int i : nums) {
            int currentLength = 1;
            int nextNum = i + 1;
            while (map.containsKey(nextNum) && map.get(nextNum) == false) {
                currentLength++;
                map.put(nextNum, true);
                nextNum++;
            }
            int prevNum = i - 1;
            while (map.containsKey(prevNum) && map.get(prevNum) == false) {
                currentLength++;
                map.put(prevNum, true);
                prevNum--;
            }
            maxLength = Math.max(currentLength, maxLength);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = { 100, 4, 200, 1, 3, 2 };
        System.out.println(
                "Longest consecutive sequence length for " + Arrays.toString(nums) + ": " + longestConsecutive(nums));
        nums = new int[] { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
        System.out.println(
                "Longest consecutive sequence length for " + Arrays.toString(nums) + ": " + longestConsecutive(nums));
    }
}
