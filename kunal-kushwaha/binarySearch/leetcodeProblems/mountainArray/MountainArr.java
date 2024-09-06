package binarySearch.leetcodeProblems.mountainArray;
// by my own method
public class MountainArr {
    public static void main(String[] args) {
        
        int[] mountain = {1,2,3,5,8,5,4};

        int max = mountain[0];
        int maxIndex = 0;
        for(int i=0; i< mountain.length; i++){
            if(max < mountain[i]){
                max = mountain[i];
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
    }
}

//mountain array --> [1,2,3,4,6,8,5,6,4,3,2] here 8 is peak
//by trying to do linear search