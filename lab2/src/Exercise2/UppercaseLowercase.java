package Exercise2;
import java.util.Arrays;
import java .util.Scanner;
public class UppercaseLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc= new Scanner (System.in);
  System.out.println("enter the size of the array:");
  int size=Integer.parseInt( null, sc.nextInt());
   String []name=new String[size];
   System.out.println("Enter the name");
   for(int i=0;i<size;i++) {
	   name[i]=sc.nextLine();
	   
   }
   String s= sortString(name);
	}

	private static String sortString(String[] name) {
		// TODO Auto-generated method stub
		Arrays.sort(name);
		int len=name.length;
		int mid=len/2;
		System.out.println("Resultant array is :");
		if(len%2==0) {
			for(int i = 0;i<mid; i++) {
				System.out.println(name[i].toUpperCase());
				
			}
			for (int j=mid;j<len;j++) {
				System.out.println(name[j].toLowerCase());
				
			}
		}
		else {
			for(int i=0;i<(mid)+1;i++) {
				System.out.println(name[i].toUpperCase());
				
				
			}
			for(int j=(mid+1); j<len;j++) {
				System.out.println(name[j].toLowerCase());
				
			}
			
			
		}
		
		return null;
		
	}

}
