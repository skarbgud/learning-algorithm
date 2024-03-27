import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergeNums = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).toArray();
        Arrays.sort(mergeNums);
        int num1 = mergeNums[(mergeNums.length / 2)];
        if (mergeNums.length % 2 == 0) {
            int num2 = mergeNums[(mergeNums.length / 2) - 1];
            return (num1 + num2) / (double) 2;
        } else {
            return num1;
        }
    }
}