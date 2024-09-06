//find position of element in sorted array of infinite numbers

/*
 * as array is infinite, we cannot use .length function
 */

// we can solve this question by dividing array into the chunks. 
// In each chunk, we will see whether the target element lies in the
// array or not. 

// by each iteration, we will increase the size of the chunk exponentially
// it is just like the reverse of binary search where we divide the array, 
// here we'll multiply the array. 

// The time complexity will be O(logn)

package binarySearch.leetcodeProblems.InfiniteArray;

public class Position {
    public static void main(String[] args) {
        int[] anss = {2,3,4,5,6,7,545,667};
        System.out.println(findAns(anss, 545));
    }

    static int findAns(int[] nums, int target){
        //first start with size 2
        int start = 0;
        int end = 1;
        //now we can double the size till we find the target > nums[end]
        while(target > nums[end]){

            // we took newstart variable as we're using the prev start to update the end value
            
            int newstart = end+1;
            //double the chunk value
            // end = previous end + double the chunk size
            end = end + (end-start + 1) * 2 ;

            start = newstart;


        }
        // now we have a valid subarray [start , end]
        // so we do normal binary search on this subarray
        return binarySearch(nums, target, start, end);
    }

    static int binarySearch(int[] nums, int target, int start, int end){
        int ans = -1;
        while (start <= end) {
            
            int mid = start + (end-start)/2;

            if(target < nums[mid]){
                end = mid-1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                ans = mid;

                start = mid + 1;
                // end = mid-1;
            }
        }
        return ans;
    }
}
// there is a little problem in this code