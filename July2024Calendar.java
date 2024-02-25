package calendar;

import java.time.*;
public class July2024Calendar {

	public static void main(String[] args) 
	{
		//LocalDate local=LocalDate.now();
		
		LocalDate time=LocalDate.of(2024,7,1);
		DayOfWeek startDayOfWeek=time.getDayOfWeek();
		System.out.println("       "+time.getMonth()+" "+time.getYear());
		String week[]= {"sun","mon","tue","wed","thu","fri","sat"};
		int lengthMonth=time.lengthOfMonth();
		int startDayOfMonth=1;
		for(int i=0;i<week.length;i++)
		{
			System.out.print(week[i]+" ");
		}
		System.out.println();
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<7;j++)
			{
				if(i==0 && j<startDayOfWeek.getValue() || startDayOfMonth>lengthMonth)
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
