package binarySearch.leetcodeProblems.mountainArray;

//here, first half is sorted in ascending
//second half is sorted in descending

public class MountainArrByBinary {
    public static void main(String[] args) {
        int[] arr = {1,2,34,5,67,6,5,3};

        int start = 0, end = arr.length-1;

        while(start < end){
            int mid = start + (end-start)/2;

            if(arr[mid] > arr[mid+1]){
                //this is desc part of array 
                end = mid;
            }else{
                //(arr[mid] < arr[mid+1]) -- condition
                //asc part of array
                start = mid + 1;
            }
            // at the end start and end will point at same index which is max

           
        //  return start; //we can also return end
         

        }
        System.out.println(start);  
    }
}
