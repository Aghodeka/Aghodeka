package Practice;
import java.util.Scanner;

interface Intf3{
	void rev(String t);
}
public class StringReverse {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the String: ");
        String s1=sc.nextLine();
        
         Intf3 intf3=(String t) ->{
        	 String s2="";
        	 char ch;
        	 for(int i=0; i<s1.length();i++)
        	 {
        		ch=s1.charAt(i);
        		s2= ch+s2;
        		
        	 }
        	 System.out.println("thr reversed String :"+s2);
        		
        };
        intf3.rev(s1);
     
        }
	}


