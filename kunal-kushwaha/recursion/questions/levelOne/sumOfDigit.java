package questions.levelOne;

public class sumOfDigit {
    //if n = 1324, output = 1+3+2+4 =10
    public static void main(String[] args) {
        System.out.println(sumOfDigitz(1234));
    }

    public static int sumOfDigitz(int n){
        if(n==0) return 0;

        return sumOfDigitz(n/10)+(n%10);
    }
}
