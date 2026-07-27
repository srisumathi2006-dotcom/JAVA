package day10;

public class Split {
    public static void main(String[] args){
        //Split

        String s="apple,banana,orange";
        String []fruit=s.split(",");
        for(String c:fruit){
            System.out.println(c);
        }

        String d="Hello World !";
        String [] h=d.split(" ");
        for(String k:h){
            System.out.println(k);
        }
    }
}
