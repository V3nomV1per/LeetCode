public class noofstep {
    public static int numberOfSteps(int num) {
        int n = 0;
        while (num>0) {
            boolean e = num % 2 == 0;
            if (e) {
                num/=2;
            } else {
                num--;
            }
            n++;
        }
        return n;
    }
    public static void main(String[] args) {
        int steps = numberOfSteps(123);
        System.out.println("The number of steps required = "+ steps);
    }
}
