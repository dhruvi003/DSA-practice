package Strings;

public class Strring {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "Hello World";

        // == for string pool
        System.out.println(str1 == str2);
        // gives true
        // == checks if reference variable are pointing to same object



        String a = new String("hii");
        String b = new String("hii");
        // here a and b are created outside of pool but inside the heap

        System.out.println(a == b);
        // it will give false


        //string builder
        StringBuilder builder = new StringBuilder();
        builder.append("hiii");


    }
}

/*
 * name1.equals(name2) -- compare only values
 * name1.charAt(index) -- print character at index
 * 
 */ 