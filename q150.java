import java.util.Arrays;
import java.util.Stack;

public class q150 {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> numStack = new Stack<Integer>();
        for (String c : tokens) {
            if (isNumeric(c)) {
                numStack.push(Integer.parseInt(c));
            } else {
                int op1 = numStack.pop();
                int op2 = numStack.pop();
                if (c == "+") {
                    numStack.push(op1 + op2);
                } else if (c == "-") {
                    numStack.push(op1 - op2);
                } else if (c == "*") {
                    numStack.push(op1 * op2);
                } else if (c == "/") {
                    numStack.push(op2 / op1);
                }
            }
            System.out.println(numStack);
        }
        return numStack.peek();
    }
    //checks if string is a number or not
    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String[] tokens = { "2", "1", "+", "3", "*" };
        System.out.println("Result of " + Arrays.toString(tokens) + " is " + evalRPN(tokens));
        tokens = new String[] { "4", "13", "5", "/", "+" };
        System.out.println("Result of " + Arrays.toString(tokens) + " is " + evalRPN(tokens));
        tokens = new String[] { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
        System.out.println("Result of " + Arrays.toString(tokens) + " is " + evalRPN(tokens));
    }
}
