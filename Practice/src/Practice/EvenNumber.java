package Practice;
@FunctionalInterface
interface Even{
	void check(int a);
}
public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Even even= (int a) -> {
    	 if(a % 2 == 0) {
    		 System.out.println("number "+ a +" is even.");
    	 }
     };
     
       even.check(56);
	}

}
