//Write a Java program to check whether a string is palindrome or not.
import java.util.*;
public class StringPalindrome {
    public static void main(String[] args) {
        //code  to get the string and pass it
        String str;
        Scanner s= new Scanner(System.in);
        try{
                System.out.println("Enter the String : ");
                if(check(str=s.nextLine()))
                    System.out.println("String is palindrome");
                else    
                    System.out.println("String aint Palindrome");
        }
        catch(Exception e){}
        finally{
            s.close();
        }
    }
    public static boolean check(String str){
        String st="";
      //  System.out.println(str.length());
      int i,len = str.length();
      for(i=len-1;i>=0;i--){
            st=st+str.charAt(i);
      }
      System.out.println("Rev :  "+ st);
      if(st.equals(str))
        return true;
      else
        return false;


    }
    
}
