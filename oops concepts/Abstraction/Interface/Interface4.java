package Abstraction.Interface;
interface inter1{
    void run1();
    void run2();
}
class A1 implements inter1{
    public void run1(){
        System.out.println("run1 get executed");
    }
    public void run2(){
        System.out.println("run2 get executed");
    }
   
}


public class Interface4 {
    public static void main(String args[]){
      A1 obj=new A1();
      obj.run1();
    }
    
}
