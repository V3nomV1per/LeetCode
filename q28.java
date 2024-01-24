/*28. Find the Index of the First Occurrence in a String
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.

Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */
public class q28 {
    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        if (needle.length() == haystack.length() && needle.equals(haystack)) {
            return 0;
        }
        for (int i = 0; i <= haystack.length()-needle.length(); i++) {
            // subs = haystack.substring(i, i+window);
            if ((haystack.substring(i, i+needle.length())).equalsIgnoreCase(needle)) {
                return i;
            }
            System.out.println(haystack.substring(i, i+needle.length()));
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Index of the First Occurrence in a String is " + strStr("abc","c"));
    }
}