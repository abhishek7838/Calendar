package calendar;

import java.time.DayOfWeek;
import java.time.LocalDate;
public class February2024 {
	    public static void main(String[] args) 
	    {
	        LocalDate currentDate = LocalDate.now();
	     
	        int currentMonth = currentDate.getMonthValue();
	        int currentYear = currentDate.getYear();
	       
	        System.out.println("    " + currentDate.getMonth() + " " + currentYear);
	        System.out.println("Su Mo Tu We Th Fr Sa");
	        
	        LocalDate firstDayOfMonth = LocalDate.of(currentYear, currentMonth, 1);
	        
	        DayOfWeek startDayOfWeek = firstDayOfMonth.getDayOfWeek();
	       
	        int lengthOfMonth = firstDayOfMonth.lengthOfMonth();
	        
	        int dayOfMonth = 1;
	        for (int i = 0; i < 6; i++) 
	        {
	            for (int j = 0; j < 7; j++) 
	            {
	                if (i == 0 && j < startDayOfWeek.getValue() || dayOfMonth > lengthOfMonth)
	                {
	                    System.out.print("   "); 
	                } 
	                else 
	                {
	                    System.out.printf("%2d ",dayOfMonth++);
	                }
	            }
	            System.out.println();
	           
	        }
	    }
	}


