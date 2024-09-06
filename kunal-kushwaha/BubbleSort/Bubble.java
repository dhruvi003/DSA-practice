package BubbleSort;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] myarr = {5,4,3,2,1};
        
        // System.out.println(bubbleSortImplementation(myarr));
        bubbleSortImplementation(myarr);
        System.out.println(Arrays.toString(myarr));
    }

    static void bubbleSortImplementation(int[] arr){

        boolean swapped;
        for(int i = 0; i< arr.length; i++){
            // i is step
            // for each i, run steps for n-i times
            swapped = false;
            for(int j = 1; j< arr.length - i; j++){
                if(arr[j]<arr[j-1]){
                    //swap elements if the previous one is greater than the current one
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            } 
            if(!swapped){
                break;
            }
        }

    }

}
