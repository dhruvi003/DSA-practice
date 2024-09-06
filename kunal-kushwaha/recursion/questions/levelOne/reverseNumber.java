package questions.levelOne;

public class reverseNumber {
    //n = 234, output = 432
    public static void main(String[] args) {
        reverseNum(234);
    }

    static void reverseNum(int n){
        if(n == 0){
            return ;
        }

        System.out.println(n%10);
        reverseNum(n/10);
    }
}
