package day10;

public class Strings {
    public static void main(String[]args){

        String s="Hello";
        String s1="Hello";

        System.out.print(s==s1);

        String s2=new String("Hello");
        String s3=new String("Hello");

        System.out.println(s2==s3);
        System.out.println(s2.equals(s3));

        //StringBuilder

        StringBuilder name=new StringBuilder("Hello");
        StringBuilder name1=new StringBuilder("Hello");

        String n=name.toString();
        String n1=name1.toString();

        System.out.println(name.equals(name1));
        System.out.println(n.equals(n1));


















    }
}
