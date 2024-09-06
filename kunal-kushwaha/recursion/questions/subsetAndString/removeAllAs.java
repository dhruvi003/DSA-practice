package questions.subsetAndString;

public class removeAllAs {
    // input: aayanaba
    // output: ynb
    // solve with recursion
    public static void main(String[] args) {
        approachOne("", "aabadfjk");
    }

    static void approachOne(String p, String up) {
        // p - processed
        // up - unprocessed

        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            approachOne(p + "y", up.substring(1));
            // skip it
        } else {
            // don't skip
            approachOne(p+ch, up.substring(1));
        }

    }

    static String approachTwo(String up){
        if( up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return approachTwo(up.substring(1));
        }else{
            return ch + approachTwo(up.substring(1));
        }
    }

}

/*
 * 1) one way to solve this is to pass array/string in argument
 * 2) approach 2: where we return a string
 */