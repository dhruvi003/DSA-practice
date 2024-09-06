package binarySearch.leetcodeProblems.RotatedSearchArray;

public class RotatedSearchh {
    public static void main(String[] args) {
        
    }

    static int findPivot(int[] arr){
        int start = 0, end = arr.length-1;
        int mid = start + (end-start)/2;
        //4 cases
        //case 1: if arr[mid] > arr[mid+1]
        if(mid < end && arr[mid] > arr[mid+1]){
            return mid;
        }
        else if(mid > start && arr[mid] < arr[mid-1]){
            return mid-1;
        }

        if(arr[start] >= arr[mid]){
            end = mid-1;
        }else{
            start = mid+1;
        }
        return -1;
    }
}
//solution
//1) find pivot (in this case, the max element)
// --> when mid > mid+1 // condititon for pivot
// or mid < mid-1
//2) find element in first half
//3) or else find element in second half

//MUST RE-LEARN THIS