package array;
import java.util.*;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //2D array
        int [][] arr = new int[4][];
        //here number of rows adding is mandatory
        arr[0] = new int [3];//number of columns can be changed dynamically

        int[][] arr1 = {
            {1,2,3},
            {2,3,4}
        };

        int [][] arr2d= new int[2][];

        for(int i=0; i< arr2d.length; i++){
            for(int col = 0; col < arr2d[i].length; col++){

                arr2d[i][col] = in.nextInt();
            }
        }
    }
}
