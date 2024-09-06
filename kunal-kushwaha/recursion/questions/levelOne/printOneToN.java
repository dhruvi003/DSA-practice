package questions.levelOne;

public class printOneToN {
    //if n = 5
    // output : 1 2 3 4 5
    public static void main(String[] args) {
        
    }

    static void printN(int n){
        
        if(n== 0){
            return;
        }
        printN(n-1);
        System.out.println(n);

    }
}
