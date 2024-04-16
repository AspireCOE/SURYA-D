package Abstraction.Abstractclass;
//->Abstract method-method have only declaration
//->definition will be written in derived class
//->Abstract class- contain atleast one abstract method
//   ->we cannot create object for abstract calss
//->concrete class- does not contain any abstract method
//->Abstract class can contain both abstract method and normal method(concrete method) 



abstract class Member{
    abstract void details();//abstract method(should not contain method declaration)

}
class Student extends Member{
       void details(){
        System.out.println("Student class");
       }
}
class Teachers extends Member{//if any class extends the abstract class should contain the definition of the abstract method
    void subject(){
        System.out.println("Subject method");
    }
    void details(){
        System.out.println("Teachers class");
    }
}
public class Abstactclass {
    public static void main(String args[]){
        Student obj=new Student();
        Teachers obj1=new Teachers();
        obj.details();
        obj1.subject();
        obj1.details();
    }
    
}
 