<div><br class="Apple-interchange-newline">import java.util.*;
class Encapsulation
{
  private int a = 100;
  private int b = 20;

//to access private variable we use methods like "getter" and "setter"
  public int getterA ()
  {								//getter
	return this.a;
  }
  public int getterB()
  {
      return this.b;
  }
  public void setterA(int a) //setter
  {
      if(a<100){
          
          this.a=a;
          System.out.println("Value changed to: "+a);
      }
      else{
          System.out.println("value was not changed");
      }
  }

}
public class Main
{
  public static void main (String[]args)
  {
	Encapsulation e = new Encapsulation ();
	// System.out.println(e.a); //It's prints error because "a" has private access(we can't access private variable outside of a class)
	  System.out.println (e.getterA ());
	  System.out.println(e.getterB());
	  Scanner sc = new Scanner(System.in);
	  int a = sc.nextInt();
	  e.setterA(a);

  }

}</div>
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
import java.util.*;
class Encapsulation
{
  private int a = 100;
  private int b = 20;


//to access private variable we use methods like "getter" and "setter"
  public int getterA ()
  {								//getter
	return this.a;
  }
  public int getterB()
  {
      return this.b;
  }
  public void setterA(int a) //setter
  {
      if(a<100){
          
          this.a=a;
          System.out.println("Value changed to: "+a);
      }
      else{
          System.out.println("value was not changed");
      }
  }


}
public class Main
{
  public static void main (String[]args)
  {
	Encapsulation e = new Encapsulation ();
	// System.out.println(e.a); //It's prints error because "a" has private access(we can't access private variable outside of a class)
	  System.out.println (e.getterA ());
	  System.out.println(e.getterB());
	  Scanner sc = new Scanner(System.in);
	  int a = sc.nextInt();
	  e.setterA(a);


  }


}


