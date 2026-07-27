package day10;

public class Compare {
    public static void main(String[] args){
        //Using a string

        String s="Hello ";
        String s1="Hello";
        System.out.println(s.compareTo(s1));

        //Using a new string also

        String s2=new String("Hello");
        String s3=new String("Hello");
        System.out.println(s2.compareTo(s3));
    }
}
