package Practice;
import java.util.Scanner;
@FunctionalInterface
interface Intf1{
	int sum(int n);
}

      public class NaturalNumber {
    	  public static void main(String[]args) {
    		  Scanner sc = new Scanner(System.in);
    		  System.out.println("Enter the number:");
    		  int m = sc.nextInt();
    		  Intf1 intf=(int n) -> {
    			  return n*(n+1)/2;
    			  
    		  };
    		  System.out.println("the sum of "+m+" Natural Number:");
    		  System.out.println(intf.sum(m));
    	  }
      }
	


