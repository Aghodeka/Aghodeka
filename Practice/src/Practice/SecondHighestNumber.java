package Practice;
import java.util.Arrays;
@FunctionalInterface
interface Intf4{
	void second(int[]a);
}
public class SecondHighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr = {11,29,31,45,5};
       Intf4 intf4=(int [] a) ->{
    	   Arrays.sort(arr);
    	  
    	   System.out.println("second highest number in a given array: "+arr[arr.length-2]);
       };
       intf4.second(arr);
       
	}

}
