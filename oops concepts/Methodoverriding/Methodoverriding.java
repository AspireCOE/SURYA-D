//run time polymorphism
class First{
    void value(){
        System.out.println("hai");
    }

}
class Second extends First{
    void value(){
        System.out.println("hello");
    }
}
public class Methodoverriding {
    public static void main(String args[]){
        Second obj=new Second();
        obj.value();
        First obj1=new First();
        obj1.value();
    }
    
}
