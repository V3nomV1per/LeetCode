/*q20. Valid Parenthesis
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.
 */

import java.util.Stack;

public class q20 {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')' && !st.isEmpty() && st.peek() == '(') {
                st.pop();
            } else if (ch == '}' && !st.isEmpty() && st.peek() == '{') {
                st.pop();
            } else if (ch == ']' && !st.isEmpty() && st.peek() == '[') {
                st.pop();
            } else return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isValid("(){}}{"));
    }
}