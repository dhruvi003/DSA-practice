import java.util.Arrays;

public class problemOneWithBetter {
     public static void print2D(int mat[][])
    {
        // Loop through all rows
        for (int[] row : mat)
 
            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }
    public static void main(String[] args) {
        long start = System.nanoTime();
        
        int mat[][] = { { 1, 2, 3, 0 },
                        { 5, 0, 7, 8 },
                        { 9, 10, 9, 12 } };
        print2D(mat);

        //create two diff array to store the marking
        //compare those marking with matrix / array

        int row[] = new int[7];
        int col[] = new int[7];

        for(int i = 0; i < mat.length; i++){
            for(int j=0; j< mat[i].length; j++){
                if(mat[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }

            }
        }

        for(int i = 0; i< mat.length; i++){
            for(int j = 0; j< mat[i].length; j++){
                if(row[i] == 1 || col[j] == 1){
                    mat[i][j] = 0;
                }
            }
        }
        print2D(mat);

        long stop = System.nanoTime();
        System.out.println((stop - start)/1000000 + " s");
    }
}

/*
 * https://takeuforward.org/data-structure/set-matrix-zero/
 */