import java.util.HashMap;

public class q525 {
    public static int findMaxLength(int[] nums) {
        // int[] result = new int[nums.length];
        // result[0] = nums[0] == 1 ? 1 : -1;
        // for (int i = 1; i < nums.length; i++) {
        // if (nums[i] == 1) {
        // result[i] = result[i - 1] + 1;
        // } else {
        // result[i] = result[i - 1] - 1;
        // }
        // }
        // System.out.println(Arrays.toString(result));
        // for (int i = result.length - 1; i > -1; i--) {
        // if (result[i] == 0) {
        // return i + 1;
        // }
        // }
        // return 0;
        // =========================================================================
        // the above solution doesn't work since it never accounts for the sub-arrays
        // starting from other than the 0th index
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int maxLength = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                sum += -1;
            } else {
                sum += 1;
            }
            if (sum == 0) {
                maxLength = i + 1;
            } else if (map.containsKey(sum)) {
                if (maxLength < map.get(sum) - i) {
                    maxLength = map.get(sum) - i;
                }
            } else {
                map.put(sum, i);
            }
            System.out.println("When sum is "+sum+ "Length is "+ maxLength);
            System.out.println(map);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 0, 0, 0, 1, 1 };
        System.out.println(findMaxLength(nums));
    }
}
