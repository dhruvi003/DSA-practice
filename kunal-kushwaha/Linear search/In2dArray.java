public class In2dArray {
    public static void main(String[] args) {
        int[][] newArr = {
            {2,3,5},
            {64,2,22},
            {23,56,65}
        };

        int target = 22;
        
        for(int row = 0; row < newArr.length; row++){
            for(int col = 0 ; col < newArr[row].length; col++){
                if(newArr[row][col] == target){
                    System.out.println(true);
                }
            }
        }

        System.out.println(minElement(newArr));

       
    }

    static int minElement(int[][] arr){
        int min = arr[0][0];
        for(int[] row : arr ){
            for(int element : row){
                if(element < min){
                    min = element;
                }
            }
        }


        return min;
    }

    
}
