package questions.patternQue;

import java.util.Arrays;

public class selectionSort {
    // largest element from array and put it at the last index
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        implementSelection(arr, 5);
        System.out.println(Arrays.toString(arr));

    }
    static void implementSelection(int[] arr, int len){
        
        if (len == 1) {
            return;
        }
        int largeIndex = 0; // Initialize large with the first element of the array
        for (int i = 0; i < len - 1; i++) {
            if (arr[largeIndex] < arr[i + 1]) {
                largeIndex = i+1;
            }
        }

        // swap with the last element
        int temp = arr[len - 1];
        arr[len - 1] = arr[largeIndex];
        arr[largeIndex] = temp;
        implementSelection(arr, len - 1);
    }
}
