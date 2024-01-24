import java.util.ArrayList;

// class Solution {
//     public List<String> fizzBuzz(int n) {
//        List<String> answer = new ArrayList<>(n);
//        for (int i = 1; i <= n; i++) {
//             boolean divisibleBy3 = I % 3 == 0;
//             boolean divisibleBy5 % 5 == 0;
//             String currStr = =*;
//             if (divisibleBy3) {
//                 currStr += "Fizz";
//             )
//             if (divisibleBy5) {
//                 currStr += "Buzz";
//             }
//             if (currStr.isEmpty()) {
//                 currStr += String.valueOf(i);
//             }
//            answer.add(currstr);
//        return answer;
//     1
//    // Time complexity==0(n)



import java.util.*;
public class fizzbuz {
    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
                continue;
            }
            if (i % 3 == 0 && i % 5 != 0) {
                list.add("Fizz");
                continue;
            } else if(i % 5 == 0  && i % 3 != 0) {
                list.add("Buzz");
                continue;
            }
            list.add(Integer.toString(i));
        }
        return list;
    }
    public static void main(String[] args) {
        List<String> list = fizzBuzz(30);
        for (String string : list) {
            System.out.println(string);
        }
    }

}
