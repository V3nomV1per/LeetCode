/**
 * runningsum
 */
public class runningsum {

    public static int[] runningSum(int[] nums) {
            // int n, arr[] = new int[nums.length];
            // for (int i = 0; i < arr.length; i++) {
            //     n = i;
            //     while (n!=-1) {
            //         arr[i]=arr[i] + nums[n--];
            //     }
            // }
            // return arr;
            // UNBELIEVABLE!
            // ALSO THE RECEIVED ARRAY CAN BE OVER-WRITTEN REDUCING SPACE COMPLEXITY
            int[] results = new int[nums.length];
            results[0] = nums[0];
            for (int i = 1; i < results.length; i++) {
                results[i] = results[i-1] + nums[i];
            }
            return results;
        }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        arr = runningSum(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
