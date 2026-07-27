package day12;

import java.util.Scanner;

class i{
    int a(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int a=sc.nextInt();
        int rev=0;
        while(a!=0){
            int p=a%10;
            rev=rev*10+p;
            a/=10;
        }
        return rev;
    }
}

public class reverse_integer {
    public static void main(String[] args){
        i a=new i();
        System.out.println(a.a());
    }
}
