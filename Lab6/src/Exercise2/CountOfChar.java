package Exercise2;
import java.util.HashMap;
public class CountOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str = "AbhishekGhodekar";
    HashMap<Character,Integer> Countchar = new HashMap<>();
    for (int i = str.length()-1; i>=0; i--)
    {
    	if( Countchar.containsKey(str.charAt(i)))
    	{
    		int count = Countchar.get(str.charAt(i));
    		Countchar.put(str.charAt(i),++count);
    	}
    	else
    	{
    		Countchar.put(str.charAt(i),1);
    		
    	}
    }
    System.out.println(Countchar);
	}

}
