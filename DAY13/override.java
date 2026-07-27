package day13;

class animal{
    void makingsound(){
        System.out.println("sound made by animal");
    }
}

class dog extends animal{
    @Override
    void makingsound(){
        System.out.println("Sound made by dog");
    }
}

public class override {
    public static void main(String[]args){
        dog d=new dog();
        animal d1=new animal();
        d.makingsound();
        d1.makingsound();
    }
}
