package day10;

public class Palidrome_check {
    public static void main(String[]args){
        String a="HELLO WORLD !";
        char[]arr=a.toCharArray();
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        String s=new String(arr);
        System.out.println(a.equals(s)?"Palidrome":"Not Palidrome");
    }
}
