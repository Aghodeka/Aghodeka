package Exercise1;

import java.util.Scanner;

public class Ecercise1 {

	public static void main(String[] args) throws InvalidAge {
		// TODO Auto-generated method stub
		System.out.println("Enter age: ");
	    Scanner sc = new Scanner(System.in);
	    int age = sc.nextInt();
	    if(age<15) {
	    	throw new InvalidAge("Enter age greater than 15");

	}

}
}
