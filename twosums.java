public class twosums {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            
        
            if (target - nums[i] == result[0]) {
                result[1] = i;
            }
            else
            result[0] = i;
        }
        return result;
    }
}
