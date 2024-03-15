public class q2485 {
    public static int pivotInteger(int n) {
        if(n == 1) return 1;
        int sum = (n*(n+1))/2;
        int result = -1;
        for(int i = 1; i<n;i++) {
            if(sum == i*i) result = i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(pivotInteger(8));
    }
}
