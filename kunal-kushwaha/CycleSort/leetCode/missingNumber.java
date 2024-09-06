// given array nums containing 'n' distinct numbers in range (0,n)
// return the only missing number in range

package CycleSort.leetCode;

public class missingNumber {
    public static void main(String[] args) {
        
    }

    static int returnNum(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != correctIndex){
                //swap
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            }else{
                i++;
            }
        }
        //search for first missing number

        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index ){
                return index;
            }
            
        }
        return arr.length;
    }
}
//here in sorted version, element == index

