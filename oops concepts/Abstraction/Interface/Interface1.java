package Abstraction.Interface;
interface School1{
    void Admin();
}
interface School2{
    void admin1();
}
class Teacher implements School1,School2{
    public void Admin(){
        System.out.println("School1");
    }
    public void admin1(){
        System.out.println("School 2");
    }
}

public class Interface1 {
    public static void main(String args[]){
        Teacher obj=new Teacher();
        obj.Admin();
        obj.admin1();
    }
    
}
