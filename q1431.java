// 1431. Kids With the Greatest Number of Candies
// There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
// Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
// Note that multiple kids can have the greatest number of candies.

import java.util.ArrayList;
import java.util.List;

public class q1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        List<Boolean> l = new ArrayList<>();
        for (int i : candies) {
            if (max<i) {
                max = i;
            }
        }
        int s = 0;
        for (int i : candies) {
            s = i+extraCandies;
            if (s>=max) {
                l.add(true);
            }
            else l.add(false);
        }
        return l;
    }
}
