package day13;

class R{
    R(){
       super(); // it is default keyword would you avoid use this() keyword only used i constructor
        System.out.println("Print class A");
    }
    R(int a){
        this();{
            System.out.println("Print the value of A "+a);
        }
    }
}

class U extends R{
    U(){

    }
    U(int a){
        this();{

            System.out.println("Print the value b "+a);
        }
    }
}

class I extends U{
    I(){

    }
    I(int a){
        this();{

            System.out.println("Print the value I " +a);
        }
    }
}

public class super_class {
    public static void main(String[]args){
        R a=new R();
        I i=new I(5);
        U u=new U(6);
    }
}
