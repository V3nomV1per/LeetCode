/**
 * maxwealth
 */
public class maxwealth {

    public static int maximumWealth(int[][] accounts) {
        int max = 0, lmax = 0;
        for (int i = 0; i < accounts.length; i++) {
            lmax = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                lmax += accounts[i][j];
            }
            if (lmax>max) {
                max = lmax;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 5}, {7, 3}, {3, 5}};
        int max = maximumWealth(arr);
        System.out.println(max);
    }
}