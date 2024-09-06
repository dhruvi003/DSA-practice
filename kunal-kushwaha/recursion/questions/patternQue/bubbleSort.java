package questions.patternQue;

import java.util.Arrays;

public class bubbleSort {
    // apply bubble sort through recursion
     public static void main(String[] args) {
        int[] arr = {5,43,2,3,1};
        
        System.out.println(Arrays.toString(bubble(arr, 5)));
     }

    static int[] bubble(int[] arr, int len)
    {
        
        if(len==1){
            return arr;
        }
        for(int i = 0; i< len-1; i++){
            if(arr[i] > arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        return bubble(arr, len-1);
    }

    static void kuunalApproch(int[] arr, int row, int col) {
         if(row == 0){
            return;
         }
         if(row > col){
            if(arr[col] > arr[col+1]) {
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            kuunalApproch(arr, row, col+1);
         }else{
            kuunalApproch(arr, row-1, 0);
         }
    }
}
