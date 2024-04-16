package inheritance;
class Car{
    void type(){
        System.out.println("car");
    }
}
class Bmw extends Car{
    void brand(){
        System.out.println("BMW");
    }
}
class Speed extends Bmw{
    void speed(){
        System.out.println("200km/hr");
    }

}
public class Multilevelinheritance {
    public static void main(String args[]){
        Speed obj=new Speed();
        obj.type();
        obj.brand();
        obj.speed();
    }
    
}
