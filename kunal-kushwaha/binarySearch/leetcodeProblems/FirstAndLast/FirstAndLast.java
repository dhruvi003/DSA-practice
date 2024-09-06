//solved by me

package binarySearch.leetcodeProblems.FirstAndLast;

public class FirstAndLast {
    public static void main(String[] args) {
          int[] arr = {1,2,3,3,3,4,5,6};
          int target = 3;
          int len = arr.length;

          int[] newarr = new int[len];

          int j = 0;
          int start =0, end = len-1;

          while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                newarr[j++] = mid;
                start = mid + 1;
            }else if(arr[mid] < target){
                start = mid+1;

            }else{
                end = mid -1 ;
            }
          }
        //   for(int i=0; i< arr.length; i++){
        //         if(target == arr[i]){
        //             newarr[j] = i;
        //             j++;
        //         }
        //   }
          int temp = newarr[0];
          for(int k=0; k< j; k++){
                if(temp < newarr[k]){
                    temp = newarr[k];
                }
          }
          System.out.println(newarr[0]);
          System.out.println(temp);
    }
}
