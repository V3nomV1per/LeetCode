import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class q496 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] greaterEle = new int[nums2.length];
        HashMap<Integer, Integer> indices = new HashMap<Integer, Integer>();
        Stack<Integer> greaterSt = new Stack<Integer>();
        for (int i = nums2.length - 1; i > -1; i--) {
            indices.putIfAbsent(nums2[i], i);
            int element = nums2[i];
            if (greaterSt.isEmpty()) {
                greaterSt.push(element);
                greaterEle[i] = -1;
                continue;
            }

            if (greaterSt.peek() > element) {
                greaterEle[i] = greaterSt.peek();
                greaterSt.push(element);
                continue;
            }

            while (!greaterSt.isEmpty() && greaterSt.peek() <= element) {
                greaterSt.pop();
            }
            if (greaterSt.isEmpty()) {
                greaterEle[i] = -1;
            } else {
                greaterEle[i] = greaterSt.peek();
            }
            greaterSt.push(element);
        }
        int[] res = new int[nums1.length];
        int k = 0;
        for (int i : nums1) {
            res[k++] = greaterEle[indices.get(i)];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = { 4, 1, 2 };
        int[] nums2 = { 1, 3, 4, 2 };
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
        nums1 = new int[] { 2, 4 };
        nums2 = new int[] { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
}
