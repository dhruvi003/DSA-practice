import java.util.*;
    // in this problem we're given r and c of pascal triangle, we need to find an element at that point

public class pascalFirstApproach {
    public static void main(String[] args) {
        // to find element at (r,c) of pascal triangle, formula is: r-1 c c-1
        // let's take nCr formula, and do calculation
        // for me, nCr = 
        int r = 5, c= 3;
        int n = r-1;
        int p = c-1; // we'll do nCp

        int num = 1; 
        for(int i = 0; i < p; i++){
            num *= n-i;
        }

        int den = 1;
        if (p != 0) {
            for(int j = 1; j <= p; j++){
                den *= j;
            }
        }

        int ans = num/den;
        System.out.println(ans);

    }
}
