package backtraking;

public class mazeWithObstacle {
    public static void main(String[] args) {
        boolean[][] board = {
            {true, true, true},{true, false, true},{true,true,true}
        };

        pathRestriction("", board, 0, 0); // startig from (0,0)
        
    }

    static void pathRestriction(String path, boolean[][] maze, int row, int col){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(path);
            return;
        }

        if(!maze[row][col]){
            return;
        }

        if(row < maze.length - 1){
            pathRestriction(path+'D', maze, row+1, col);
        }

        if(col < maze[0].length - 1){
            pathRestriction(path+'R', maze, row, col+1);
        }

    }
    
}
// boolean matrix is given and in tha 'false' value, we cannot go over there.
// so whenever we land, it'll check whether it is river or not.
// if false, just return from false value.
// so it is not backtracking, it is just stoping recursion at that point
