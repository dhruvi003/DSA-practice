package backtraking;

public class printPathOfMaze {
    // paths are permutations so we'll do it by processed and unprocessed
    public static void main(String[] args) {
        printPath("", 3, 3);
    }

    static void printPath(String path, int row, int col){
        if(row == 1 && col == 1){
            System.out.println(path);
            return;
        }
        if(row > 1){
            printPath(path+"D", row-1, col);
        }

        if(col > 1){
            printPath(path+"R", row, col-1);
        }
        
    }


}
