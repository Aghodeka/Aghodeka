package Exercise1;
 import java.util.Scanner;
public class SecondSmallestElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n, min;
   Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number of elements: ");
    n = sc.nextInt();
    int a[] = new int [n];
    System.out.println("Enter the elements in arrays");
    for  (int i= 0; i<n; i++) {
    	a[i] = sc.nextInt();
    }
      for (int i= 0; i<n; i++ ) {
    	  for(int j =i +1; j<n; j++) {
    		  if(a[i]>a[j]) {
    			  min = a[i];
    			  a[i]=a[j];
    			  a[j]=min;
    			  
    		  }
    	  }
      }
      System.out.println("the Smallest elementin the array is :"+a[1]);
}

}
