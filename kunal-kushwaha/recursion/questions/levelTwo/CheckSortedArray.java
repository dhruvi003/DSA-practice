package questions.levelTwo;

//given an array and we need to find whether it is sorted or not
//with the help of recursion
// arr = [3,4,5,6] output is true

public class CheckSortedArray{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(checkArray(arr,0));

    };

    //recursion
    static boolean checkArray(int[] arr, int index){
        if(index == arr.length - 1){
            return true;
        }
        return arr[index] < arr[index+1] && checkArray(arr, index + 1);
    }
}

