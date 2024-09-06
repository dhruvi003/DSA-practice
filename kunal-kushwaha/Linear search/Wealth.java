public class Wealth{
    public static void main(String[] args) {
        int[][] tdarr = {
            {34,55,32},
            {54,231,54},
            {5,4,2}
        };

        int totalCusomer = tdarr.length;
        int[] wealth = new int[totalCusomer];
        int sum = 0;

        for(int[] row : tdarr){
            int i =0;
            for(int item : row){
                sum += item;
                wealth[i] = sum;

            }
            i++;
        }

        int rich = wealth[0];
        for(int item : wealth){
            if(item > rich){
                rich = item;
            }
        }

        System.out.println(rich);
        
        // System.out.println(wealth);
    }
}