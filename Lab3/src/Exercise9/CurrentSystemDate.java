package Exercise9;
import java. util.Date;
import java .time.Month;
import java.time.LocalDate;

public class CurrentSystemDate {

	public static void getDayMonthyear(String date) {
		// TODO Auto-generated method stub
		LocalDate currentDate = LocalDate.parse(date);
		int day = currentDate.getDayOfMonth();
		Month month = currentDate.getMonth();
		int year = currentDate.getYear();
		System.out.println("Day: "+ day);
		System.out.println("month: "+ month);
		System.out.println("year:" + year);
	}
		public static void main (String args[])
		{
			String date = "2022-05-18";
			getDayMonthyear(date);
		}

	}


