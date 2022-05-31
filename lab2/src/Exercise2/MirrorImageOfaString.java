package Exercise2;
 import java.util.Scanner;
public class MirrorImageOfaString {

	public static String getImage(String str) {
		// TODO Auto-generated method stub
     StringBuffer sbr =new StringBuffer(str);
     sbr.append('|');
     StringBuffer sb = new StringBuffer(str);
     sb.reverse();
     sbr.append(sb);
     return sbr.toString();
     
	}
	public static void main(String[]args) {
		MirrorImageOfaString m = new MirrorImageOfaString();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = s.next();
		System.out.println(m.getImage(str));
	}
	

}
