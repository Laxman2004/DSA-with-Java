

public class Main
{
	public static void main(String[] args) {
		String name = "Hello there!";          //substring
		String s = name.substring(4,9);
		System.out.println(s);
		System.out.println(name.charAt(2));    //Finding Character at given index
		
		//String to charArray
		char a[] = name.toCharArray();
		for(int i=0;i<a.length;i++){
		    System.out.print(a[i]);
		}
		System.out.println();
		
		//String is empty
		
		String s1 = "";
		String s2 = "    ";
		System.out.println(s1.isEmpty());         //Blank String is not empty but every empty string is blank;
		System.out.println(s2.isEmpty());
		System.out.println(s1.isBlank());
		System.out.println(s2.isBlank());
		
 		//comparing alphabatically
 		String s3 = "Hey";
 		String s4 = "Bye";
 		System.out.println(s3.compareTo(s2));
 		System.out.println(s3.compareTo(s3));
 		
 		//Trimming 
 		String b = "        hello    ";
 		String b1 = "    hello       there   ";
 		System.out.println(b.trim());
 		System.out.println(b1.trim());     //Trim function only trim first and last white spaces;
 		
 		//Replacing character
 		
 		  String c = "hallo are you there?";
 		System.out.println(c.replace('a','e'));  // replace every 'a' character to 'e';
 		String c1 = c.replaceFirst("a","e");     //replace first occurence of 'a' character
 		System.out.println(c1);                  
 	}
}
