package binarySearch.BinarySearchIn2DArray;

public class TwoDSearch {
    public static void main(String[] args) {
        // here the array is row wise and col wise sorted
        int[][] myarr = {
            {10,20,30,40},
            {15, 25, 35, 45},
            {28, 30, 37,49},
            {33,34,38,50}
        };

        int target = 25;
        System.out.println(search(myarr,target));
    }

    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length-1;

        if(matrix[r][c] == target){
            return new int[] {r,c};
        }else if(matrix[r][c] > target){
            c--;
        }else{ //matrix[r][c] < target
            r ++;
        }

        return new int[] {-1,-1};

    }
}
