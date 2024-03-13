// 34. Find First and Last Position of Element in Sorted Array

// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.
public class q34 {
    
    public static int firstIndex(int[] arr, int target) {
        int res = -1;
        int high = arr.length-1;
        int low = 0;
        while (low<=high) {
            int mid = (high + low)/2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                res = mid;
                high = mid - 1;
            }
        }
        return res;
    }
    public static int lastIndex(int[] arr, int target) {
        int res = -1;
        int high = arr.length-1;
        int low = 0;
        while (low<=high) {
            int mid = (high + low)/2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                res = mid;
                low = mid + 1;
            }
        }
        return res;
    }

    public static int[] searchRange(int[] arr, int target) {
        int[] res = {-1, -1};
        res[0] = firstIndex(arr, target);
        res[1] = lastIndex(arr, target);
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 7;
        int[] result = searchRange(arr, target);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}