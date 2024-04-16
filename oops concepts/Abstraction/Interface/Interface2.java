package Abstraction.Interface;
//interface can extends another interface


interface Institute{
    void Admin();
}
interface Trust extends Institute{
    void Admin1();
}
class College implements Trust{
    public void Admin1(){
        System.out.println("Admin 1");
    }
    public void Admin(){
        System.out.println("Admin");
    }
}

public class Interface2 {
    public static void main(String args[]){
         Trust obj=new College();//or we use College obj=new College()
         obj.Admin();
         obj.Admin1();
    }
    
}
