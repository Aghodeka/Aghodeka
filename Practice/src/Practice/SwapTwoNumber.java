package Practice;
import java.util.Scanner;
interface intf{
	void swap(int a,int b);
}
public class SwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner (System.in);
         System.out.println("Enter the 1 number:");
         int m=sc.nextInt();
         System.out.println("Enter the 2 number:");
         int n= sc.nextInt();
         
         System.out.println("After Swapping");
         intf Intf=(int a, int b )->{
        	 int temp = a;
        	 a=b;
        	 b=temp;
        	 System.out.println("1 number="+a);
        	 System.out.println("2 number="+b);
         };
         Intf.swap(m, n);
	}

}
