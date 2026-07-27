package day14;

abstract class emp{
    protected int id;
    protected String name;
    protected int salary;

    emp(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    abstract void bonus();

}

class manager extends emp{
    manager(int id,String name,int salary){
        super(id,name,salary);{

        }
    }
    @Override
    public void bonus() {
        System.out.println(salary+salary*0.10);
    }
}

class developer extends emp{
    developer(int id,String name,int salary){
        super(id,name,salary);{

        }
    }
    @Override
    public void bonus() {
        System.out.println(salary+salary*0.05);
    }
}

class intern extends emp{
    intern(int id,String name,int salary){
        super(id,name,salary);{

        }
    }
    @Override
    public void bonus() {
        System.out.println(id+" "+name+" "+salary);
    }
}

public class practice {
    public static void main(String[] args){
        emp man=new manager(101,"hari",10000);
        emp dev=new developer(102,"santh",2500);
        emp inter=new intern(100,"salai",800);
        man.bonus();
        dev.bonus();
        inter.bonus();
    }



}
