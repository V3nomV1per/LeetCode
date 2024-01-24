public class sqsort {
    public static int[] sortedSquares(int[] nums) {
        int[] neo = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            neo[i] = nums[i]*nums[i];
        }
        int temp = 0;
        for (int i = 0; i < neo.length; i++) {
            for (int j = 0; j < neo.length-1-i; j++) {
                if(neo[j]>neo[j+1]) {
                    temp = neo[j];
                    neo[j] = neo[j+1];
                    neo[j+1] = temp;
                }
            }
        }
        return neo;
//         class Solution {
//     public int[] sortedSquares(int[] nums) {
//         int[] result = new int[nums.length];
//         int left=0, right=result.length-1;
//         int pos=right;
//         while(left <= right){
//             if(Math.abs(nums[left]) > Math.abs(nums[right])){
//                 result[pos] = nums[left]*nums[left];
//                 left += 1;
//                 pos -= 1;
//             }
//             else{
//                 result[pos] = nums[right]*nums[right];
//                 right -= 1;
//                 pos -= 1;
//             }
//         }
//         return result;
//     }
// }
    }
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] n = sortedSquares(nums);
        for (int i : n) {
            System.out.println(i);
        }
    }
}
