package questions.subsetAndString;

public class skipOnPerticularCon {
    // only skip app only when string is not equal to apple
    //input: heilapptoapple
    //output: heiltoapple
    public static void main(String[] args) {
        System.out.println(skipAppButNotApple("heilappbutnotapple"));
    }

    static String skipAppButNotApple(String s){
        if(s.isEmpty()){
            return "";
        }

        if(s.startsWith("app") && !s.startsWith("apple")){
            return skipAppButNotApple(s.substring(3));
        }else{
            return  s.charAt(0) + skipAppButNotApple(s.substring(1)) ;
        }
    }

}
