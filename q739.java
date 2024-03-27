import java.util.Arrays;
import java.util.Stack;

public class q739 {
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> tempIndex = new Stack<Integer>();
        int l = temperatures.length;
        int[] result = new int[l];
        for (int i = l - 1; i >= 0; i--) {
            while (!tempIndex.isEmpty() && temperatures[i] >= temperatures[tempIndex.peek()]) {
                tempIndex.pop();
            }
            if (!tempIndex.isEmpty()) {
                result[i] = tempIndex.peek() - i;
            }
            tempIndex.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
        temperatures = new int[] {30,40,50,60};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
}
