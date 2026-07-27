package day14;

interface S{
    void show();
}

interface K{
    void display();
}

class ds implements S,K{
    public void show(){
        System.out.println("Hello");
    }
    public void display(){
        System.out.println("Hello Joy!");
    }
}

public class interface_method {
    public static void main(String[]args){
        S a=new ds();
        K a1=new ds();
        a.show();
        a1.display();
    }
}
