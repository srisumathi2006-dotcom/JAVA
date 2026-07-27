package day12;

class r{
    int a;
    int b;
    String c;
    String d;
    r(int a){
        this.a=a;
    }
    void display(int a){
        System.out.println(a);
    }

    r(int a,int b){
        this.a=a;
        this.b=b;
    }
    void display(int a,int b){
        System.out.println(a+" "+b);
    }

    r(String c){
        this.c=c;
    }
    void displaty(String c){
        System.out.println(c);
    }

    r(String c, String d){
        this.c=c;
        this.d=d;
    }
    void display(String c, String d){
        System.out.println(c+" "+d);
    }

    r(int a,String c, String d){
        this.a=a;
        this.c=c;
        this.d=d;
    }
    void display(int a,String c, String d){
        System.out.println(a+" "+c+" "+d);
    }

    r(int a,int b,String c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void display(int a,int b,String c){
        System.out.println(a+" "+b+" "+c);
    }
}

public class void_class {
    public static void main(String[]args){

    }
}
