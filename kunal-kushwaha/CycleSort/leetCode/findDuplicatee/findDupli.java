//given array of integers nums containig n + 1
// integers where each integer is in range [1,n] inclusive

// there is only one repeated number in nums, return this number
// must solve without modifying the array nums and using constant extra space.

//by kunal kushwaha

package CycleSort.leetCode.findDuplicatee;

public class findDupli {
    public static void main(String[] args) {
        int[] newarr = {5,3,2,4,2,1};
        System.out.println(solution(newarr));
            
    }
    static int solution(int[] arr){

        int i = 0 ;

        while(i < arr.length){

            if(arr[i] != i +1){ // if array is not at the correct index
                
                int correctIndex = arr[i] - 1;
                
                if(arr[correctIndex] != arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[correctIndex];
                    arr[correctIndex] = temp;
                }else{ // we have found the answer
                    return arr[i];
                }
            } else{
                i++;
            }
           
        }
        return -1; //in case of no duplicate
    }
}
// in case of duplicate
// if element != index + 1
// swap with correct index
// else we've found our answer