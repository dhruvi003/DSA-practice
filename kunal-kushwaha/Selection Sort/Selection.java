import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {6,5,3,4,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        // find maximum item in the array and swap with correct index
        for(int i=0; i< arr.length ; i++){
            
            int correctIndex = arr.length - i - 1;
            int maxElementIndex = getMaxIndex(arr, 0, correctIndex);
            swap(arr, maxElementIndex, correctIndex );
        }
        
    }

    static int getMaxIndex(int[] arr, int startIndex, int endIndex){
        int maxIndex = startIndex;
        
        for(int i = startIndex; i<= endIndex; i++){
            if(arr[maxIndex] < arr[i]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
