package day12;

class con{
    int id;
    String name;
    String name1;
    float num;

    con(int id) {
        this.id=id;
    }

    con(float num){
        this.num=num;
    }
    con(String name){
        this.name =name;
    }

    con(String name,String name1){
        this.name=name;
        this.name1=name1;
    }

    con(int id,String name,String name1,float num){
        this.id=id;
        this.name=name;
        this.name1=name1;
        this.num=num;
    }
    void display(){
        System.out.println(id+" "+name+" "+name1+" "+num);
    }
}

public class constructor_overloading {
    public static void main(String [] args){
        con i=new con(1);
        con i1=new con("Pandi","Santh");
        con i2=new con(5f);
        con i3=new con(1,"aravinth","santh",5);
        con i4=new con("Santh");
        i.display();
        i1.display();
        i2.display();
        i3.display();
        i4.display();

    }
}
