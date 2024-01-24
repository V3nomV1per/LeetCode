//Given an integer x, return true if x is a palindrome, and false otherwise.
public class q9 {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        String s1 = "";
        for (char ch : s.toCharArray()) {
            s1 = ch + s1;
        }
        return s1.equals(s);
    }
}
