//Rotation of a string
//Approach 1

import java.util.*;
public class Main{
    
        public static boolean rotations(String s, String s1){
            if(s.length()!=s1.length())
            {
                return false;
            }
            s=s.toLowerCase();
            s1=s1.toLowerCase();
            for(int i=0; i<s1.length();i++)
            {
                s1 = s1.substring(1)+s1.substring(0,1);
                if(s.equals(s1))
                {
                    return true;
                }
            }
            return false;
        }
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String s1 = sc.nextLine();
            if(rotations(s,s1)){
                System.out.println("YES");
            }
            else{
                System.out.println("No");
            }
            
    }
}

//Approach 2
import java.util.*;
public class Main{
    
        public static boolean rotations(String s, String s1){
            if(s.length()!=s1.length())
            {
                return false;
            }
            s=s.toLowerCase();
            s1=s1.toLowerCase();
            String str = s+s;
            return str.contains(s1);
        }
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String s1 = sc.nextLine();
           
            if(rotations(s,s1)){
                System.out.println("YES");
            }
            else{
                System.out.println("No");
            }
            
    }
}
