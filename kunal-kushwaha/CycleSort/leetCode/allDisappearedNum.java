// given an array nums of n integers where nums[i] is in range [1,n]
// return array of all integers in range [1,n] that do not appear in nums


package CycleSort.leetCode;

import java.util.Arrays;

public class allDisappearedNum {
    public static void main(String[] args) {
        int[] newarr = {6,3,4,3,2};
        findMissingNumbers(newarr);
    }

    static void findMissingNumbers(int[] arr){
        //check swap
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != correctIndex){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
                
            } //index = value - 1
            else{
                i++;
            }
        }

        int[] newArr = new int[arr.length];
        for(int j=0;j<arr.length;j++){
            if(arr[j] != j + 1){
                newArr[j] = arr[j];
            } 
        }
        System.out.println(Arrays.toString(newArr));
    }
}
