package questions.levelTwo;

public class linearSearchWithRec {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,5};
        System.out.println(search(arr, 3, 0));
    }

    static int search(int arr[], int x, int index){  
        if(arr == null || index == arr.length-1){
            return -1;
        }
        if(x == arr[index]){
            return index;
        }
        return search(arr, x, index+1); 
    }

    static boolean kunalApproch(int arr[], int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || kunalApproch(arr, target, index+1);
    }
}
