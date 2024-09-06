package mergeSort;

import java.util.Arrays;

public class Implement {
    public static void main(String[] args) {
        
    }

    static int[] mergesort(int[] arr){
        //divide the array into two parts
        // base condition
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;

        int[] right = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] left = mergesort(Arrays.copyOfRange(arr, mid, arr.length-1));

        return merge(right, left);
    }

    static int[] merge(int[] first, int[] second){
        int i = 0;
        int j = 0;
        int k = 0;

        int[] ans = new int[first.length + second.length];

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                ans[k] = first[i];
                i++;
        }else{
            ans[k] = second[j];
            j++;
        }
        k++;
    }

    if ( i < first.length){
        ans[k] = first[i];
        i++;
        k++;
    }

    if(j < second.length){
     ans[k] = second[j];
     j++;
     k++;
    }

    return ans;
}
}
