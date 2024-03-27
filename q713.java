public class q713 {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1)
            return 0;
        int left = 0, right = 0, l = nums.length, prod = 1, result = 0;
        while (right < l) {
            prod *= nums[right];
            while (prod >= k) {
                prod /= nums[left];
                left++;
            }
            result += right - left + 1;
            right++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 10, 5, 2, 6 };
        System.out.println(numSubarrayProductLessThanK(nums, 100));
        nums = new int[] { 1, 2, 3 };
        System.out.println(numSubarrayProductLessThanK(nums, 0));
        nums = new int[] { 10, 9, 10, 4, 3, 8, 3, 3, 6, 2, 10, 10, 9, 3 };
        System.out.println(numSubarrayProductLessThanK(nums, 19));
    }
}
