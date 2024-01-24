public class q1071 {
    // public String gcdOfStrings(String str1, String str2) {
    //     int len = Math.min(str1.length(), str2.length());
    //     for (int i = len; i > 0; i--) {
    //         if (isDivisor(str1.substring(0, i), str1, str2)) {
    //             return str1.substring(0, i);
    //         }
    //     }
    //     return "";
    // }
    // public boolean isDivisor(String x, String str1, String str2) {
    //     int l = x.length(), len1 = str1.length(), len2 = str2.length();
    //     if (len1%l!=0 || len2%l!=0) {
    //         return false;
    //     }
    //     int f1 = len1/l, f2 = len2/l;
    //     String c1 = "", c2 = "";
    //     for (int i = 1; i < f1; i++) {
    //         c1 = c1 + x;
    //     }
    //     for (int i = 1; i < f2; i++) {
    //         c2 = c2 + x;
    //     }
    //     return c1==str1 && c2 == str2;
    // }
    public String gcdOfStrings(String str1, String str2) {
        if ((str1+str2).equals(str2+str1)) {
            return str1.substring(0, gcd(str1.length(), str2.length()));
        } else {
            return "";
        }
    }
    public int gcd(int a, int b) {
        if (b==0)
        return a;
        return gcd(b,a%b);
    }
}