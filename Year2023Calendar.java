package calendar;
import java.time.DayOfWeek;
import java.time.LocalDate;
public class Year2023Calendar 
{
    public static void main(String[] args) 
    {
        int year = 2023;
        System.out.println("Year " + year + " Calendar");
        for (int month = 1; month <= 12; month++)
        {
            printMonthCalendar(year, month);
            System.out.println();
        }
    }
    
    public static void printMonthCalendar(int year, int month) 
    {
       
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        
        DayOfWeek startDayOfWeek = firstDayOfMonth.getDayOfWeek();
      
        int lengthOfMonth = firstDayOfMonth.lengthOfMonth();
      
        System.out.println(firstDayOfMonth.getMonth() + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");
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
                    System.out.printf("%2d ", dayOfMonth++); 
                }
            }
            System.out.println();
            if (dayOfMonth > lengthOfMonth) 
            {
                break;
            }
        }
    }
}

