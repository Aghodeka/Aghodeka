package Exercise2;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) throws InvalidName {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first name");
		String firstName=sc.nextLine();
		System.out.println("Enter last name");
        String lastName=sc.nextLine();
        String fullName=firstName+" "+lastName;
        
        if(firstName.length()==0)
        {
        	throw new InvalidName("First name is blank,enter the name ");
        	
        }
        System.out.println("full Name: "+fullName);
	}

}
