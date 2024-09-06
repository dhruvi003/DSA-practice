public class Implement{
    public static void main(String[] args){

    }
    static int fibbonaci(int n){
        /*
         * fibo(n) = fibo(n-1) + fibo(n-2)
         */
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return fibbonaci(n-1) + fibbonaci(n-2);
        }
    }
}
/*
 * 1) Find recurrence relation
 * 2) Try to figure out the recurrence tree
 * 3) 
 */