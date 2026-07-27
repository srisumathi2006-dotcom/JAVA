package day14;
abstract class animal{
    abstract public void makesound();
    void makingsound(){
        System.out.println("Making Sound");
    }
}

class dog extends animal{
    @Override
    public void makesound(){
        System.out.println("Bow Bow !");
    }
}
class cat extends animal{
    @Override
    public void makesound(){
        System.out.println("Meow Meow");
    }
}

public class abstract_method {
    public static void main(String[] args){
        animal dog=new dog();
        animal cat=new cat();
        dog.makesound();
        cat.makesound();
        dog.makingsound();
    }
}
