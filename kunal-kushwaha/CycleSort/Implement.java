package CycleSort;

import java.util.Arrays;

public class Implement {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr){
        // check, swap, move
        int n = arr.length;
        for(int i = 0; i< n; i++){
            int value = arr[i];
            if(i != value-1){
                //swap
                int temp = arr[value-1];
                arr[value-1] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
