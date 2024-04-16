package Encapsulation.Encapsulation1;
//binding data and code together
// helps to protect private data
//private data can be accessed through public method
//only access the variable through method
//variable should be private and method we access the variable should be public
//we use getter and setter concept
//main goal is to protect data
import java.util.*;
class Student{
    private int rollnum;
    private String name;
    public void getRollnum(int r){
         rollnum=r;
    }
    public int setrollnum(){
        return rollnum;

    }
    public void getName(String n){
        name=n;
    }
    public String setName(){
        return name;
    }

}
public class Encaplsulation11{
    public static void main (String args[]){
        Student obj=new Student();
        obj.getRollnum(2);
        obj.getName("Hari");
       // obj.setrollnum();
        System.out.println(obj.setrollnum());
        System.out.println(obj.setName());

    }
}