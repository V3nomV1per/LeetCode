// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

// Merge nums1 and nums2 into a single array sorted in non-decreasing order.

// The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

public class mergearr {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i : nums2) {
            nums1[m++]=i;
        }
        int temp = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums1.length-1-i; j++) {
                if (nums1[j]>nums1[j+1]) {
                    temp = nums1[j];
                    nums1[j] = nums1[j+1];
                    nums1[j+1] = temp;
                }
            }
        }
        for (int i : nums1) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int n = nums2.length;
        int m = nums1.length-n;
        merge(nums1, m, nums2, n);
    }
}
