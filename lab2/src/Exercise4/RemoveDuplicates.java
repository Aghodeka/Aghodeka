package Exercise4;
import java.util.Arrays;
import java.util.Scanner;
public class RemoveDuplicates {

		public static int modifyArray(int arr[], int n) {
			if(n==0 || n == 1) {
			return n;
			}
			int[] temp = new int[n];
			int j = 0;
			for (int i= 0; i<n-1;i++);
			{
				int i = 0;
				if(arr[i] != arr[i+1])
				{
					temp[j++] = arr[i];
					
				}
				
			}
			
           temp[j++] = arr[n-1];
           for(int i = 0; i<j; i++) {
        	   arr[i] = temp[i];
           }
           return j;
	}
		public static void main(String[]args) {
			int arr[] = {5,8,18,9,18,9,8,5,18};
			Arrays.sort(arr);
			int length = arr.length;
			length = modifyArray(arr, length);
			for(int i= 0; i<length; i++) {
				System.out.println(arr[i] +" ");
			}
		}
		

}
