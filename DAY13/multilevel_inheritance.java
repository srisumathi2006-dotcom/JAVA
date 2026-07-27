package day13;

class ya{
    void sid(){
        System.out.println("Hello...");
    }
}

class og extends ya{
    void hi(){
        System.out.println("Good Morning");
    }
}

class ej extends og{
    void kj(){
        System.out.println("Welcome...");
    }
}

public class multilevel_inheritance {
    public static void main(String[]args){
        og i=new og();
        ya u=new ya();
        ej j=new ej();
        u.sid();
        i.hi();
        i.sid();
        j.kj();
        j.sid();
        j.hi();
    }
}
