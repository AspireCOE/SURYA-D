package inheritance;
import java.util.*;
class Balance{
    int bl=50000;
    int blnce(){
        return bl;
    }
}
class Withdraw extends Balance{
    int with_draw(int wd){
        if(wd<=bl){
            System.out.println("Possible\n cash withdrawed:"+wd);
            bl=bl-wd;
            
        }
        else{
            System.out.println("not enough fund");
        }
        return bl;
    }
}


public class Singleinheritance {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Amount:");
        int wd=sc.nextInt();
        Withdraw obj=new Withdraw();
        System.out.println("Balance:"+obj.blnce());
        System.out.println(obj.with_draw(wd));
        sc.close();
    }
    
}
