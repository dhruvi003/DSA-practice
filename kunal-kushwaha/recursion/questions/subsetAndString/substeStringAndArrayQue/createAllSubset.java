package questions.subsetAndString.substeStringAndArrayQue;

public class createAllSubset {
    public static void main(String[] args) {
        //input: "abc"
        //output: 'a', 'b', 'c', 'ab', 'ac', 'bc', 'abc'
        // here 'ac' = 'ca'

        // it may be taking any element or removing an element
        // this pattern of taking some and removing some element is known as subset pattern
        subseq("", "abc");

    }

     static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = p.charAt(0);

        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));

     }

}
