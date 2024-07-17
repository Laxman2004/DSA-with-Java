class Demo{
    void fun(){
        System.out.println("I have 0 parameters");
    }
    void fun(int a){
        System.out.println("I have 1 parameter containing datatype int: "+a);
    }
    void fun(String s){
        System.out.println("I have 1 parameter containing  datatype String: "+s);
    }
    void fun(int a, int b){
        System.out.println("I have 2 parameters containing  datatypes int: "+a+", "+b);
    }
    void fun(String s, int b){
        System.out.println("I have 2 parameters containing  datatypes String & int: "+s+", "+b);

    }
    void fun(int a, String s, float b){
        System.out.println("I have 3 parameters containing  datatypes int, String & float: "+a+", "+s+", "+b);
    }
}
public class Main{
    public static void main(String[]args){
        Demo d = new Demo();
        d.fun();
        d.fun(5);
        d.fun("Hello");
        d.fun(10,20);
        d.fun("Vijay",30);
        d.fun(40,"Ajay",21.0f);
    }
}
