package binarySearch.leetcodeProblems.CeilingOfNumber;

import java.util.Arrays;

public class CeilingOfNumber {
    
    public boolean hasOneElement(int[] arr) {
        return arr.length == 1;
    }

    public int binary(int start, int end, int[] arr, int target) {
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
                ans = arr[mid];
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid]; // Target found, no need to continue searching
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        CeilingOfNumber ceilingFinder = new CeilingOfNumber();
        int[] sortedArray = {1, 2, 8, 10, 10, 12, 19};

        int target = 2;
        int result = ceilingFinder.binary(0, sortedArray.length - 1, sortedArray, target);
        System.out.println("Ceiling of " + target + " is: " + result);
    }
}


// in a given array, we have to find ceiling of a target number. 
// ceiling of a given number means =
// smallest element in array which is greater or equal to target