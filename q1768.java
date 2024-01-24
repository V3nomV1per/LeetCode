// 1768. Merge Strings Alternately

// You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

// Return the merged string.
public class q1768 {
    public String mergeAlternately(String word1, String word2) {
        String merge = "";
        int l1 = 0, l2 = 0;
        while (!(l1==word1.length() && l2==word2.length())){
            if(l1<word1.length()) {
                merge = merge+word1.charAt(l1++);
            }
            if(l2<word2.length()) {
                merge = merge+word2.charAt(l2++);
            }
        }
        return merge;
    }
}