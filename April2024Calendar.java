package calendar;

import java.time.*;
public class April2024Calendar
{

	public static void main(String[] args)
	{
        LocalDate localDate=LocalDate.now();
//		int currentMonth=localDate.getMonthValue();
//		int currentYear=localDate.getYear();
		LocalDate date=LocalDate.of(2024,3,1);
		DayOfWeek startDayOfWeek=date.getDayOfWeek();
		int lengthOfMonth=date.lengthOfMonth();
		System.out.println("  "+date.getMonth()+" "+date.getYear());
		String daysName[]= {"sun","mon","tue" ,"wed" ,"thu" ,"fri" ,"sat"};
		int startDayOfMonth=1;
		System.out.println("length"+daysName.length);
		for(int i=0;i<daysName.length;i++)
		{
			System.out.print(daysName[i]+" ");
		}
		System.out.println();
         System.out.println("sun mon tue wed thu fri sat");
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<7;j++)
			{
				if(i==0 && j<startDayOfWeek.getValue() || startDayOfMonth>lengthOfMonth)
				{
					System.out.print("    ");
				}
				else
				{
					System.out.printf("%3d ",startDayOfMonth++);
				}
			}
			System.out.println();
		}	
	}

}
