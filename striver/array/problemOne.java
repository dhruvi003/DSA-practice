// Java program to print the elements of
// a 2 D array or matrix using toString()
import java.io.*;
import java.util.*;
 
// Driver Class
class GFG {
 
    public static void print2D(int mat[][])
    {
        // Loop through all rows
        for (int[] row : mat)
 
            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }
 
    public static void main(String args[])
        throws IOException
    {
        long start = System.nanoTime();
        
        int mat[][] = { { 1, 2, 3, 0 },
                        { 5, 0, 7, 8 },
                        { 9, 10, 9, 12 } };
        print2D(mat);

        //find total number of 0's first
        // find index of each 0 number
        // loop through all rows of 0 and make them 0
        // loop through all columns of 0 and make them 0

        int totalZeros;
        
        for(int i =0 ; i< mat.length; i++){
            for(int j=0; j< mat[i].length; j++){
                if(mat[i][j] == 0){
                    // System.out.println("i" + i +" "+ "j:"+j);
                    //for each i and j, we will change values
                    for(int k = 0; k<mat.length; k++){
                        if(mat[k][i] != 0){
                            mat[k][i] = -1;
                        }
                        for(int l = 0; l < mat[k].length; l++){
                            if(mat[i][l] != 0){
                                mat[i][l] = -1;
                            }
                        }
                    }

                }
            }
        }
        //now replace -1 with 0
        for(int i=0; i< mat.length; i++){
            for(int j=0; j< mat[i].length; j++){
                if(mat[i][j] == -1){
                    mat[i][j] = 0;
                }
            }
        }
        print2D(mat);
        long stop = System.nanoTime();
        System.out.println((stop - start)/1000000 + " s");
    }
 


}