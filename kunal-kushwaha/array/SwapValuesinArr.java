package array;

import java.util.Arrays;

public class SwapValuesinArr {
    public static void main(String[] args) {
        int[] arr = {34,5,2,4,322};

        swap(arr,1,2);
       
        System.out.println(Arrays.toString(arr));
    

    }

static void swap(int[] arr, int i1, int i2){
    int a = arr[i1];
    arr[i1] = arr[i2];
    arr[i2] = a;
}
    
    
}