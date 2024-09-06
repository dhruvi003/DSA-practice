package InsertionSort;

import java.util.Arrays;

public class Implementation {
    public static void main(String[] args) {
        int[] arr = {6,5,4,2,1};
        Insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Insertion(int[] arr){
        for(int i =0 ; i<= arr.length - 2; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else{
                    break;
                }
            }
        }
    }
}
