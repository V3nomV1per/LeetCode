public class evnum {
    public static int evno(int[] nums) {
        int c=0, n=0;
        for (int i : nums) {
            while (i!=0) {
                i=i/10;
                c++;
            }
            if (c%2 == 0) {
                n++;
            }
            c = 0;
        }
        return n;
    }
    public static void main(String[] args) {
        int nums[] = {437,315,322,431,686,264,442};
        int n = evno(nums);
        System.out.println(n);;
    }
}
