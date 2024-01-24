
// class consec {
//     public static int findMaxConsecutiveOnes(int[] nums) {
        
//         int c=0, max = 0;
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == 1) {
//                 c++;
//             }
//             if(max>c)
//             continue;
//             else if (c>max && nums[i] == 0||i == nums.length-1) {
//                 max = c;
//                 c = 0;
//             }
//         }
//         return max;
//     }
//     public static void main(String[] args) {
//         int num[] = {1, 0, 1, 1, 0, 1};
//         int n = findMaxConsecutiveOnes(num);
//         System.out.println(n);
//     }
// }
class consec {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int c=0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                c++;
                if(c>max){
                    max = c ;

                }
            }
            else{
                c = 0 ;
            }

        }
        return max;
    }
    public static void main(String[] args) {
        int num[] = {1, 0, 1, 1, 0, 1};
        int n = findMaxConsecutiveOnes(num);
        System.out.println(n);;
    }
}