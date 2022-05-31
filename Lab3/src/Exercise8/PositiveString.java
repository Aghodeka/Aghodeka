package Exercise8;
import java.util.Arrays;
public class PositiveString 
{
  static boolean isAlphabaticOrder(String s)
{
	int n = s.length();
	for(int i = 1; i< n ; i++)
	{
		if(s.charAt(i)<s.charAt(i-1))
		{
				
	
	return false;
		}
	}

	return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s = "aabbcc";
		 if(isAlphabaticOrder(s))
		 {
			 System.out.println("yes");
		 }
		 else
		 {
			 System.out.println("nos");
		 }
	}

}
