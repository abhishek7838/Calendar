package calendar;

import java.time.*;

public class CurrentMonth {

	public static void main(String[] args) 
	{
		LocalDate local=LocalDate.now();
		
		int currentMonth=local.getMonthValue();
		
		int currentYear=local.getYear();
		
		int currentDay=local.getDayOfMonth();
		
		DayOfWeek dayOfWeek=local.getDayOfWeek();
		int week=dayOfWeek.getValue();
		System.out.println("week=> "+week);
		
		String sb= dayOfWeek.toString();
		
		
		System.out.println("  "+local.getMonth()+" "+currentYear);
		
		System.out.println("sun mon t wed t fri sat");
		
		LocalDate firstDayOfMonth=LocalDate.of(currentYear,currentMonth,1);
		
		DayOfWeek startDayOfWeek=firstDayOfMonth.getDayOfWeek();
		int size=startDayOfWeek.getValue();
		int totalDay=firstDayOfMonth.lengthOfMonth();
		
		System.out.println();
		System.out.println("================================");
		System.out.println("size=> "+size);
		System.out.println("totalDayOfCurrentMonth=>"+totalDay);
		System.out.println("String=>"+sb);
		System.out.println("currentMonth=>"+currentMonth+"  month name=>"+local.getMonth());
		
		System.out.println("currentYear=>"+currentYear);
		
		System.out.println("currentDay=>"+currentDay);
		
		System.out.println("dayOfWeek=>"+dayOfWeek);
		
		System.out.println("firstDayOfMonth=>"+firstDayOfMonth);
		
		System.out.println("startDayOfWeek=>"+startDayOfWeek);
		System.out.println("=====================================");
		
		
	}

}
