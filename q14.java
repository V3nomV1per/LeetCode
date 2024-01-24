//Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string "".
public class q14 {
    public static String longestCommonPrefix(String[] strs) {
        String s = "";
        int n = strs[0].length();
        for (String str : strs) {
            n = n>str.length()?str.length():n;
        }
        int flag = 0;
        for (int i = 0; i < n; i++) {
            flag = 1;
            char check = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) == check) {
                    continue;
                }
                flag = 0;
            }
            if (flag == 1) {
                s = s+check;
            }
            else break;
        }
        return s;
    }
}
