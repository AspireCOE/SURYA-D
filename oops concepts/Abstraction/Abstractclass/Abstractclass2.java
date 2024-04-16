package Abstraction.Abstractclass;
abstract class bank{
    abstract void run();

}
class Bank1 extends bank{
    void run(){
        System.out.println("executed");
    }
}

public class Abstractclass2 {
    public static void main(String args[]){
        bank obj=new Bank1();
        obj.run();
    }
    
}
