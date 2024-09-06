//find all the duplicate elements in an array

package CycleSort.leetCode.findAllDuplicate;
import java.util.*;

public class implementByMe {

    public static void main(String[] args) {
        int[] arr = {2,3,5,4,6,4,5,1};
        System.out.println(findDuplicates(arr));
    }

    static List<Integer> findDuplicates(int[] nums) {
        int i =0;
        List<Integer> l1 = new ArrayList<Integer>();
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[correctIndex] != i + 1){
                if(nums[correctIndex] != nums[i]){
                    //swap
                    int temp = nums[i];
                    nums[i] = nums[correctIndex];
                    nums[correctIndex] = temp;
                }else{
                    l1.add(nums[i]);
                }  
            }else{
                i++;
            }
            

        }
        return l1;
    }
}
