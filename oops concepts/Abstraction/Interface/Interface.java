package Abstraction.Interface;
//collection of abstract method
//interface- says what to do but not how to do
//interface should contain method declaration(abstract method)
//interface block contains only an abstract method
//interface is not extended by class it is implemented by class
//can implement multiple interface but extends only one class
//can implement one or more interface with extends only one class
//implemented class should contain all the method definition which are declared in interface block
//cannot able to create object for interface
//helps to achieve multiple interface
//interface can extends another interface



interface Department{//interface contains only abstrct method
    void company();
    void Manager();
}
class Employee implements Department{
    public void company(){   //abstract method declaration should be in public
            System.out.println("ABC");
    }
    public void Manager(){
            System.out.println("Ragu");
    }

}

public class Interface {
    public static void main(String args[]){
        Employee emp=new Employee();// or we use  Department obj=new Employee();
       
        emp.company();
        emp.Manager();
    }
    
}
