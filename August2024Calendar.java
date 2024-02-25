package calendar;

import java.time.*;
public class August2024Calendar {

	public static void main(String[] args)
	{
		LocalDate localDate=LocalDate.of(2024,8,1);
		DayOfWeek startDayOfWeek=localDate.getDayOfWeek();
		int lengthOfMonth=localDate.lengthOfMonth();
		
		System.out.println("   "+localDate.getMonth()+" "+localDate.getYear());
		int startDayOfMonth=1;
		String daysWeek[]= {"sun","mon","tue","wed","thu","fri","sat"};
		for(int i=0;i<daysWeek.length;i++)
		{
			System.out.print(daysWeek[i]+" ");
		}
		System.out.println();
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<7;j++)
			{
				if(i==0&& j<startDayOfWeek.getValue() || startDayOfMonth>lengthOfMonth)
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
