package inheritance;
import java.util.*;
class Bank{
    int bal=50000;
    void baln(){
        System.out.println("Balance:"+bal);
    }
}
class Deposit extends Bank{
    int deposit(int dpt){
        bal=bal+dpt;
        return bal;
    }
}
class Withdraw extends Bank{
    int whdraw(int wd){
        if(wd<=bal){
            System.out.println("possible");
            bal=bal-wd;
        }
        else{
            System.out.println("Not available funds");
        }
        return bal;
    }
}
class Hiraricalinheritance{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=0;
        Bank obj2=new Bank();
        Withdraw obj=new Withdraw();
        Deposit obj1=new Deposit();
        while(i==0){
            System.out.println("1-balance\n2-deposit\n3-withdraw\n4-exit");
            int ch=sc.nextInt();
            switch(ch){
                case 1:{
                    obj2.baln();
                    break;
                }
                case 2:{
                    System.out.println("Amount:");
                    int amnt=sc.nextInt();
                    System.out.println("Balance:"+obj1.deposit(amnt));
                    break;
                }
                case 3:{
                    System.out.println("Amount:");
                    int amnt1=sc.nextInt();
                    System.out.println("Balance:"+obj.whdraw(amnt1));
                    break;
                }
                case 4:{
                    i=1;
                }
            }
        }
    }
}