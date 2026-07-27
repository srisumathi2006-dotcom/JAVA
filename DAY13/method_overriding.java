package day13;

class car{
    void station(){
        System.out.println("Petrol Station");
    }
}

class EVcar extends car{
    void station(){
        System.out.println("EV Station");
    }
}

class Petrolcar extends car{
    void station(){
        System.out.println("Petrol station not working");
    }
}

public class method_overriding {
    public static void main(String[]args){
        EVcar car=new EVcar();
        car.station();
        Petrolcar car1=new Petrolcar();
        car1.station();
    }
}
