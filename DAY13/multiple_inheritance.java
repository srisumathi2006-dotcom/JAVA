package day13;

class y{
    void sid(){
        System.out.println("Hello...");
    }
}

class o extends y{
    void hi(){
        System.out.println("Good Morning");
    }
}

class e extends y{
    void kj(){
        System.out.println("Welcome...");
    }
}
public class multiple_inheritance {
    public static void main(String[]args){
        o i=new o();
        y u=new y();
        e j=new e();
        u.sid();
        i.hi();
        i.sid();
        j.kj();
        j.sid();
    }
}
