package backtraking;

public class mazeProblem {
    public static void main(String[] args) {
        System.out.println(countWays(3, 3));
    }

    static int countWays(int row, int col){
        if( row == 1 | col == 1){
            return 1;
        }
        int left = countWays(row-1, col);
        int right = countWays(row, col - 1);
    
        return left + right;
    }
}
