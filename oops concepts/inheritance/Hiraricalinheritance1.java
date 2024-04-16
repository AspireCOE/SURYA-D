package inheritance;
import java.util.*;
class Employee{
    int salary=50000;
    void salary(){
        System.out.println("salary: "+salary);
    }

}
class Increment extends Employee{
    int inc(int hke){
        return salary*hke;
    }

}
class Bonus extends Employee{
    int bns(int am){
        return salary+am;
    }
}

public class Hiraricalinheritance1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Increment obj=new Increment();
        Bonus obj1=new Bonus();
        obj.salary();
        System.out.println("inc:");
        int inc=sc.nextInt();
        System.out.println("Increment:"+obj.inc(inc));
        System.out.println("Bonus:"+obj1.bns(1000));
        sc.close();


    }
    
}
