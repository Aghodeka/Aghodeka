package Exercise5;

public class SecondSmallestNo {
	public static int getSecondSmallest(int[]a, int total)
	{
		int temp;
		for(int i= 0 ; i<total; i++)
		{
			for (int j = i+1; j<total; j++)
			{
				if (a[i]>a[j])
				{
					temp = a [i];
					a[i] = a[j];
					a[j]= temp;
				}
			}
		}
		return a[1];
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[] = {1,2,3,4,5,6};
    int b[] = {44,66,99,22,33};
    System.out.println("SecondSmallest:" +getSecondSmallest(a,6));
    System.out.println("SecondSmallest:" +getSecondSmallest(b,5));
	}

}
