

public class EvenNoOfDigit {
    public static void main(String[] args) {
        int[] arr = {34,23,1222,422,34};
        int count =0;

        for(int element : arr){
            String mynum = String.valueOf(element);
            if(mynum.length() %2 == 0){
                count ++;
            }


        }
        System.out.println(count);

        int digits=0;
        for(int num : arr){
            while(num > 0){
                digits ++;
                num = num/10;
            }
        }
    }
}
