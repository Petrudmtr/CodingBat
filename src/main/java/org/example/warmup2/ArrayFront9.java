package org.example.warmup2;

/*
Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less
than 4.

arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false
 */

public class ArrayFront9 {
    public boolean arrayFront9(int[] nums) {
        int firstElements = 0;
        if (nums.length < 4) {
            firstElements = nums.length;
        } else {
            firstElements = 4;
        }
        int count = 0;
        for (int i = 0; i < firstElements; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return (count > 0);
    }
}
