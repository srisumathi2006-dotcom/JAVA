package day12;

class over{
    int id;
    String name;
    over(int id,String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println(id);
        System.out.println(name);
    }
}


public class this_keyword {
    public static void main(String[]args){
        over a=new over(1,"Hi");
        a.display();
    }
}
