package day12;

class A{
    int age;
    int id;
    String name;

    // Defalut constructor

    A(){
        System.out.println("Hello !");
    }
    A(int i){
        System.out.println(i+i+i);
    }
    A(int age,String name,int id){
        this.age=age;
        this.name=name;
        this.id=id;

        }
    void show(){
        System.out.println(age);
        System.out.println(name);
        System.out.println(id);
    }
}


public class constructor {
    public static void main(String[]args){
        A obj=new A(20,"santh",19);
        obj.show();
        A obj1=new A (5);
        A obj2 = new A();
    }
}
