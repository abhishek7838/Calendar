package calendar;

import java.util.*;
import java.time.*;
public class Calendar2020 
{
	
	public static void calendar(int year,int month)
	{
		
		LocalDate time=LocalDate.of(year,month,1);
		DayOfWeek startDayOfWeek=time.getDayOfWeek();
		int lenghtOfMonth=time.lengthOfMonth();
		int startDayOfMonth=1;
		System.out.println("     "+time.getMonth());
		String weeks[]= {"sun","mon","tue","wed","thu","fri","sat"};
		for(int i=0;i<weeks.length;i++)
		{
			System.out.print(weeks[i]+" ");
		}
		System.out.println();
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<7;j++)
			{
				if(i==0 && j<startDayOfWeek.getValue() || startDayOfMonth>lenghtOfMonth)
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

	public static void main(String[] args) 
	{
		System.out.println("enter a calendar YEAR which you want to see CALENDAR: ");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		
		for(int month=1;month<=12;month++)
		{
			calendar(year,month);
		}
		sc.close();
		
		

	}

}
