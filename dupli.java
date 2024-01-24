
import java.util.HashSet;
public class dupli {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            }
            else set.add(i);
        }
        return false;
        // for (int i = 0; i < nums.length-1; i++) {
        //     for (int j = i+1; j < nums.length; j++) {
        //         if (nums[i]==nums[j]) {
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }
}
