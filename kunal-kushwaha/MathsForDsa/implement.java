public class implement {
    
    public static void main(String[] args) {
        //check whether given number is odd or eve

        //every number is calculated in binary from internally
        // if 2^0(lsb) is 1 --> odd else even

        //2) in an array, every array is appearing twice except one number
        // find that number
    }

    static int questionTwo(int[] arr){
        // if we ^(XOR) any number with itself, it'll give the 0.
        int unique = 0;

        for(int element : arr){
            unique ^= element;
        }

        return unique;
    }

    static void questionThree(int[] arr){
        //given a number, find ith bit of that number

        //watch video number 25. time: 51:00 - 1:00:00
    }

    static void questionEight(int[] arr){
        //every number is appearing in array 3 times except one number. Find that number

        //if number is appearing 3 times, value of bits will also be appearing 3 times
        // the set bits will also appear 3 times
        // so set bits will be modulo of 3
        // 

        // if a number is appearing 5 times, we will do modulo of 5
    }

    static void questionFour(int[] arr){
        //find nth magic number
        
    }
}
