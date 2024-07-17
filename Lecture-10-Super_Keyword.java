class Iphone{
    String Model_name;
    String Org_name;
    Iphone(String Model_name,String Org_name)
    {
        this.Model_name=Model_name;
        this.Org_name=Org_name;
    }
    void show()
    {
        System.out.println(Model_name+" "+Org_name);
    }
}
class XR extends Iphone{
    double price;
    XR(String Model_name,String Org_name,double p)
    {
        super(Model_name,Org_name);  //to call the parent class constructor
        price=p;                    //super must be the first statement
    }                               //rather initializing lets call parent class constructor using super keyword
    void show()
    {
        super.show();               //call the parent class method using super rather than writing println again who is already printing same stuff
        System.out.println(price);
    }
}
class SuperKeyword{
    public static void main(String[]args)
    {
        new XR("Iphone 10","Apple",89900).show();
    }
}
