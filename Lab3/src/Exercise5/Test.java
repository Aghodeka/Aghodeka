package Exercise5;
import java.io.*;
public class Test {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
     {
		try
		{
			int lines = 0, chars = 0, words = 0;
			int code = 0;
			FileInputStream fis = new FileInputStream("sample .text");
			while(fis.available()!=0) {
				code = fis.read();
				if(code!=10);
					chars++;
					if(code==32);
					words++;
					if(code==13)
					{
						lines++;
						words++;
					}
						
			}
			System.out.println("no of characters = "+chars);
			System.out.println("no of words = "+(words+1));
			System.out.println("no of lines = "+(lines)+1);
			fis.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("cannot find the specified file....");
			
		}
	    catch(IOException i)
		{
	    	System.out.println("cannot read file");
		}

}
}
