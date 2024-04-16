class Example{
    int min(int a, int b){
        return a<b?1:0;
    }
    char min(char a, char b){
        return a<b? a: b;
    }
    double min(double a, double b){
        return a<b?a:b;
    }
    String min(String a,String b){
        return a.length()<b.length()?a:b;
    }
}
class Methodoverloading2{
    public static void main(String args[]){
        Example obj=new Example();
        System.out.println(obj.min(2,4));
        System.out.println(obj.min('e','k'));
        System.out.println(obj.min(1.00, 2.00));
        System.out.println(obj.min("hai", "hello"));
    }
}