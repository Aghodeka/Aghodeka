package practice;
 import java.util.Scanner;
public class expectationhandling {
	 static Scanner sc = new Scanner(System.in);
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		System.out.println("error");
		
		System.out.println("enter 1 number");
		int num1 = sc.nextInt();
		System.out.println("enter 2 number");
		int num2 = sc.nextInt();
		
		System.out.println(num1+ " "+num2);
		System.out.println(num1/num2);
		
		
       int[] intarr = {10,15,69,30};
       for(int i = 0 ; i<intarr.length;i++) {
    	   System.out.println(intarr[i]+ " ");
       }
	}

}
