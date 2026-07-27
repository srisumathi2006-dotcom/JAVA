package day13;
//Single Inheritance
class g{
    void display(){
        System.out.println("Hello.....");
    }
}

class l extends g{
    void show(){
        System.out.println("Welcome to all...");
    }
}

public class oops {
    public static void main(String[] args){
        g e=new g();
        l i=new l();
        i.display();
        i.show();
        e.display();
    }
}
