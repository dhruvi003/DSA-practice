//given array of integers nums containig n + 1
// integers where each integer is in range [1,n] inclusive

// there is only one repeated number in nums, return this number
// must solve without modifying the array nums and using constant extra space.

//by my own 


package CycleSort.leetCode.findDuplicatee;
import java.util.*;

public class findDuplicateNum {
    public static void main(String[] args) {
        int[] myarr = {3,4,2,2,1,44};
        System.out.println(duplicateNum(myarr));

    }

    static int duplicateNum(int[] arr){
        List<Integer> l1 = new ArrayList<Integer>();
        int repeatedNum = -1;
        for(int element : arr){
            if(!l1.contains(element)){
                l1.add(element);
            }else{
                repeatedNum = element;
            }
        }
        return repeatedNum;
    }
}
