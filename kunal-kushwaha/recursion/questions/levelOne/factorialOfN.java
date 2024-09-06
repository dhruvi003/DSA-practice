package questions.levelOne;

public class factorialOfN {
    public static void main(String[] args) {
        System.out.println(printFact(4));
    }

    static int printFact(int n){
        if(n == 1){
            return 1;
        }
        return n * printFact(n-1);
    }
}
