package Practice;
 import java.io .*;
public class Practice {
	
	static int findSum(int n)
	{
		int sum = 0;
		for(int x = 1; x<= n; x++)
		sum = sum + x;		
		
		
		
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 5;
        System.out.println(findSum(n));
	}

}



interface StringFunc {
	String func(String n);

public static void main(String []args) {
	 StringFunc reverse = (str) -> {
	  String result = ("");
	  int i;
	  for(i = str.length() - 1; i>=0; i--)
	  result += str.charAt(i);
	
	  return result;
	  
  };
  System.out.println("lambda reverse is " + reverse.func("lambda"));
  System.out.println("Expression reversed is " + reverse.func("Expression"));
	   
		   
	   }
}
   






