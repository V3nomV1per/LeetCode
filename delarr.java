// Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

// Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

// Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
// Return k.
public class delarr {
    public static int removeElement(int[] nums, int val) {
        int count = 0, temp = 0, left = nums.length-1, right = 0;
        while (left >= right) {
            if (nums[left] == val) {
                left--;
            }
            if (nums[right]==val && nums[left]!=val) {
                temp = nums[right];
                nums[right++] = nums[left];
                nums[left--] = temp;
            }
            
        }
        // for (int i = 0; i < nums.length; i++) {
        //     if(nums[left] == val) left--;
        //     if (nums[i] == val) {
        //         if (nums[i] == val) {
        //             count++;
        //             temp = nums[i];
        //             nums[i] = nums[left];
        //             nums[left] = temp;
        //         }
        //     }
        // }
        for (int i : nums) {
            System.out.println(i);
        }
        return count;
    }
        public static void main(String[] args) {
            int[] nums = {0,1,2,2,3,0,4,2};
            int val = 2;
            int count = removeElement(nums, val);
            System.out.println("Count of val:"+count);
    }
}