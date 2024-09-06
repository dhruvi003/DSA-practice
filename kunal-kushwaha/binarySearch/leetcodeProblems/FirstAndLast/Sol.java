//solved by kunal kushwaha

package binarySearch.leetcodeProblems.FirstAndLast;

public class Sol {
    public static void main(String[] args) {
        int[] nums = {2,3,4,4,4,4,5,6,7};
        int[] myans = searchIndex(nums, 4);
    }

    public static int[] searchIndex(int[] nums, int target){
        int[] ans = {-1,-1};
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);
       

        return ans;
    }

    static int search(int[] nums, int target, boolean findFirstIndex){
        int start = 0;
        int ans = -1;
        int end = nums.length - 1;
        
        while(start <= end){
            int mid = start + (end - start)/2;

            if(target == nums[mid]){
                ans = mid;

                if(findFirstIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
     }
}
