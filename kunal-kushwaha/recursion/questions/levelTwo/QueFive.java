package questions.levelTwo;

import java.util.ArrayList;

public class QueFive {
    //return list but don't take argument
        //here return type is arraylist, and each call will have new list
    public static void main(String[] args) {
        
    }

    static ArrayList<Integer> findArray(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<Integer>();

        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCall = findArray(arr, target, index+1);
        list.addAll(ansFromBelowCall);

        return list;
    }
}
