//this is wrong method

package binarySearch.leetcodeProblems.CeilingOfNumber;

public class CeilingOfNumberMethod2 {
    static int com(int[] arr, int target){
        int ans = 0;
        int start = 0, end = arr.length - 1;
        
        while(start <= end){
            int mid = start + (end-start)/2;

            
            if(target < arr[mid]){
                // finding maximum element
                ans = arr[mid-1];
                
            }else if(target > arr[mid]){
                //finding min element
                ans = arr[mid+1];
            }else{
                ans = arr[mid];
            }
        }
            return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,8,9,33};
        System.out.println("Ceiling of number 5 is : " + com(arr,10));
    }
}
