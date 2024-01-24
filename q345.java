// 345. Reverse Vowels of a String
// Given a string s, reverse only all the vowels in the string and return it.
// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

import java.util.HashSet;

public class q345 {
    public static String reverseVowels(String s) {
        // int c = 0;
        // char ch;
        // String v = "";
        // for (int i = 0; i < s.length(); i++) {
        //     ch = s.charAt(i);
        //     if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        //         v = v+ch;
        //         c++;
        //     }
        // }
        // String n = "";
        // for (int i = 0; i < s.length(); i++) {
        //     ch = s.charAt(i);
        //     if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        //         n = n + v.charAt(--c);
        //         continue;
        //     }
        //     n = n + ch;
        // }
        // return n;
        int j = 0, k = s.length()-1;
        HashSet<Character> set = new HashSet<>();
        char[] ch = s.toCharArray();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        while (j<k) {
            if (set.contains(ch[j]) && set.contains(ch[k])) {
                char temp = ch[j];
                ch[j] = ch[k];
                ch[k] = temp;
            }
            j++;
            k--;
        }
        s = new String(ch);
        return s;
    }
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }
}
