package day10;

public class Replace {
    public static void main(String[] args){
        //replace methods

        String str ="Hello World";
        System.out.println(str.replace('o','x'));
        System.out.println(str.replaceAll("World","Java" ));
        System.out.println(str.replaceFirst("Hello","Hi"));
    }
}
