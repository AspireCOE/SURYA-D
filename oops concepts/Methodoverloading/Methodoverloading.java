//compile time polymorphism
class Methodoverloading1{
    void basic(){
        System.out.println("Nothing");
    }
    void basic(int a){
        System.out.println(a);
    }
    void basic(int a,int b){
        System.out.println(a+ " " +b);
    }
}
class Methodoverloading{
    public static void main(String args[]){
        Methodoverloading1 obj=new Methodoverloading1();
        obj.basic();
        obj.basic(1);
        obj.basic(1,2);
    }

}