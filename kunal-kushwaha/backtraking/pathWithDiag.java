package backtraking;

public class pathWithDiag {
    public static void main(String[] args) {
        findPath("", 3, 3);

    }

    static void findPath(String path, int row, int col){
        // instead of two, we will call three recursion calls
        if(row == 1 && col == 1){
            System.out.println(path);
        }

        if( row > 1 && col > 1){
            findPath(path+ "D", row-1, col-1);
        }

        if( row > 1){
            findPath(path+'V', row-1, col);
        }

        if(col > 1){
            findPath(path+'H', row, col-1);
        }
    }
}
