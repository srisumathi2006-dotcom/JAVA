package day13;

class C{
    int id=100;
    private int a=10;
    private int b=20;
    private String name="A";


    void setId(int a,int b, String name){
        this.a=a;
        this.b=b;
        this.name=name;
    }

    int getA(){
        return this.a;
    }
    int getB(){
        return this.b;
    }
    void show(){
        System.out.println(a+" "+b+" "+name);
    }
}

public class encapsulation {
    public static void main(String[] args){
        C d=new C();
        d.setId(10,20,"Name");
        d.getA();
    }
}
