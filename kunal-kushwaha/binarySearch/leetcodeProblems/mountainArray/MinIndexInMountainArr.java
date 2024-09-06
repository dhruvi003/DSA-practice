package binarySearch.leetcodeProblems.mountainArray;

public class MinIndexInMountainArr {
    public static void main(String[] args) {
        int[] mountain = {1,2,3,4,5,4,3,1};
        int target = 3;

        int peak;
        int start = 0, end = mountain.length-1;

        while(start < end){
            int mid = start + (end-start)/2;

            if(mountain[mid] > mountain[mid+1]){
                // in desc part of array
                end = mid;
            }else{
                start = mid+1;
            }
        }
        peak = start;
        int ans = -1;
        // let's search in the first half
        start = 0;
        while(start < end){
            int mid = start + (peak-start)/2;

            if(target > mountain[mid]){
                start = mid+1;
            }else if(target < mountain[mid]){
                end = mid-1;
            }else{
                ans = mid;
            }
        }
        
        if(ans == -1){
            start = peak;
            int mid = start + (end-start)/2;
            while(start < end){

                if(target < mountain[mid]){
                    start = mid+1;
                }else if(target > mountain[mid]){
                    end = mid-1;
                }else{
                    ans = mid;
                }
            }
        }


    }
}
//solution
//kunal kushwaha : video : binary search interview questions
// video from : 2:25:41

// 1) find peak element
// 2) binary serch in the first half of array
// 3) if not found, then binary search in the second half of array
