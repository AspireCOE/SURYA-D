package inheritance;
class First{
    int a=3;
    int b=6;
    void sum(){
    System.out.println("a:"+ a+" "+"b:"+b+" "+"a+b="+(a+b) );
    }

}
class Second extends First{
    int a=2;
    void sum1(){
    System.out.println("a:"+ a+" "+"b:"+b+" "+"a+b="+(a+b) );

}
}

public class Inheritance {
    public static void main(String args[]){
        Second obj=new Second();
        obj.sum1();
        obj.sum();
    }
    
}
