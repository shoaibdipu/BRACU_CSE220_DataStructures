/*Task 12
 Write a method before that takes as parameters two month/day combinations and 
 that returns whether or not the first date comes before the second date 
 (true if the first month/day comes before the second month/day,false if it does not). 
 The method will take four integers as parameters that represent the two month/day combinations.
 The first integer in each pair represents the month and will be a value 
 between 1 and 12 (1 for January, 2 for February, etc, up to 12 for December). 
 The second integer in each pair represents the day of the month (a value between 1 and 31). 
 One date is considered to come before another if it comes earlier in the year.
 */
import java.util.*;

public class task12{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a month :");
        int month1 = sc.nextInt();
        System.out.print("Enter a day of the month: ");
        int day1 = sc.nextInt();
        
        System.out.print("Enter another month: ");
        int month2 = sc.nextInt();
        System.out.print("Enter a day of the month: ");
        int day2 = sc.nextInt();
        
        System.out.println(dateChecker(month1, day1, month2, day2));
        
    }
    
    public static boolean dateChecker(int month1, int day1, int month2, int day2){
        
        if(month1!=month2){
            if(month1<month2) return true;
            else return false;
        }else{
            if(day1<day2) return true;
            else return false;
        }
    }
}



