class Multiplication{
    void fun(int a, int b){
        System.out.println("Hi! i am from Class Multiplication my result is: "+a*b);
    }
}
class Addition extends Multiplication{
    void fun(int a, int b){
        System.out.println("Hi! i am from Class  Addition my result is: "+(a+b));
    }
}
public class Main{
    public static void main(String[]args){
        Addition b = new Addition();
        b.fun(5,10);
    }
}
