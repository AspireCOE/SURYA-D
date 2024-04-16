package Abstraction.Interface;
//class can extends another another class and implement single or multiple interface

interface Trust1{
    void institute1();
}
interface Trust2{
    void institute2();
}
interface Trust3{
    void institute3();
}
class College11 implements Trust1{
    public void institute1(){
        System.out.println("Trust1");
    }
}

class College22  extends College11 implements Trust2,Trust3{
    public void institute2(){
        System.out.println("Trust2");
    }
    public void institute3(){
        System.out.println("Trust3");
    }

}

public class Interface3 {
    public static void main(String args[]){
        College22 obj=new College22();
        //College11 obj1=new College11();
        //obj1.institute1();
        obj.institute1();
        obj.institute2();
        obj.institute3();
    }
    
}
