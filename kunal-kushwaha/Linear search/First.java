public class First{
    public static void main(String[] args){
        int[] myarr = {4,3,54,7,4};

        System.out.println(linearSearch(myarr, 3));
    }

    static boolean linearSearch(int[] arr, int element){
        boolean found = false;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == element){
                found = true;
            }
        }
        return found;
    }
}