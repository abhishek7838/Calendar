package calendar;

import java.time.*;
public class Year2025Calendar 
{
	public static void monthCalendar(int year,int month)
	{
		LocalDate local=LocalDate.of(year,month,1);
		DayOfWeek startDayOfWeek=local.getDayOfWeek();
		int lengthOfMonth=local.lengthOfMonth();
		int dayOfMonth=1;
		System.out.println(local.getMonth()+" "+year+" ");
		System.out.println("su mo tu we th fr sat");
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<7;j++)
			{
				if(i==0 && j<startDayOfWeek.getValue() || dayOfMonth>lengthOfMonth)
				{
					System.out.print("   ");
				}
				else
				{
					System.out.printf("%2d ",dayOfMonth++);
				}
			}
			System.out.println();
			if(dayOfMonth>lengthOfMonth)
			{
				break;
			}
		}
		System.out.println("-------------------------------------");
		
	}

	public static void main(String[] args)
	{
		int year=2025;
		for(int month=1;month<=12;month++)
		{
			monthCalendar(year,month);
		}
		
	}

}
