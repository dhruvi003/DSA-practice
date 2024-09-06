public class pascalFirstProblem {
    public static void main(String[] args) {
        // we need to calculate element at r,c in pascal triangle
        int r = 4;
        int c = 2;

        int res = 1;
        for(int i = 0; i < c; i++){
            res = res * (r-i); // eg. 10C3 -- numerator = 10*9*8 , so here first r = 10, res = 10-0 
            // after that r = 10, then i= 1, ---> 10 * (10-1 = 9) = 10* 9
            // for i++ --> i=2 , 10*9*(10-2) = 10*9*8

            res = res / (i+1);
            // numerator will be 2*1
        }

        System.out.println(res);
    }
}
