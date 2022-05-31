package Exercise3;
import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;
public class Exercise3 {

	public static void main(String[] args) throws EmployeeException {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter your sallery of employee");
      long sal=sc.nextLong();
      if(sal<3000)
      {
    	  throw new com.cg.eis.exception.EmployeeException("sallery less than 3000");
      }
	}

}
