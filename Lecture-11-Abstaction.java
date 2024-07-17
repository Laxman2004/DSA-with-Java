// if we print with class name staff it will print the staff elements if we run with"HR" it will print the methods in that class;
abstract class staff{
    staff()
    {
        System.out.println("Yes we can create a constructor with abstract class");
    }
    abstract void increment(int sal,int exp);
    void details()
    {
        System.out.println("yes we can create non static member");
        
    }
    static void call()
    {
        System.out.println("yes we can create static member");
    }
    public static void main(String[]args)
    {
        call();             //this is how you call static function;
        new HR();           //if its is non static we can call abstract class with the help of "inheritance"(child class),As we know when we call child class it will also print parentclass;
    }
}
class HR extends staff{     //it is mandatory for HR to override the abstract method

    void increment(int sal,int exp)  //yes we need to override the abstract method of class else declare class as abstract (abstract class HR);
    {
        if(exp>15)
        {
            sal+=10000;
            System.out.println(sal);
        }
        else{
            System.out.println(sal);
        }
    }
    public static void main(String[]args)
    {
        staff s=new HR();                     // as i said we cannot call abstract class so we call children class;
        s.increment(70000,16);
    }
}
