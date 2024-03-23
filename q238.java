import java.util.Arrays;

public class q238 {
    public static int[] productExceptSelf(int[] nums) {
        int[] ltor = new int[nums.length];
        int[] rtol = new int[nums.length];
        ltor[0] = 1;
        rtol[nums.length - 1] = 1;
        for (int i = 1; i < nums.length; i++) {
            ltor[i] = ltor[i-1]*nums[i-1];
        }
        for (int i = nums.length-2; i > -1; i--) {
            rtol[i] = rtol[i+1]*nums[i+1];
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = rtol[i] * ltor[i];
        }
        // System.out.println("LEFT TO RIGHT MULTIPLICATIONS:"+ Arrays.toString(ltor));
        // System.out.println("RIGHT TO LEFT MULTIPLICATIONS:"+ Arrays.toString(rtol));
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println("INPUT ARRAY: " + Arrays.toString(nums));
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
