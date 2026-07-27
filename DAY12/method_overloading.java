package day12;

class met{
    int met(){
        return 1;
    }

    int add(int a,int b){
        return a+b;
    }

    int add(int a,int b, int c){
        return a+b+c;
    }

    void display(){
        System.out.println(" ");
    }
}

public class method_overloading {
    public static void main(String[]args){
        met a=new met();
        int e=a.met();
        System.out.println(e);
        System.out.println(a.add(1,2));
        System.out.println(a.add(1,2,3));
    }
}
