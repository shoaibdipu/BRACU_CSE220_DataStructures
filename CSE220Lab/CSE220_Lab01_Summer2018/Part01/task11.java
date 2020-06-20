/*Task 11
 Write a method named allDigitsOdd that returns whether every digit of a positive integer is odd. 
 Your method should return true if the number consists entirely of odd digits and 
 false if any of its digits are even. 0, 2, 4, 6, and 8 are even digits, and 1, 3, 5, 7, 9 are odd digits.
 For example, allDigitsOdd(135319) returns true but allDigitsOdd(9145293) returns false.
 */

import java.util.*;

public class task11{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check : ");
        int num = sc.nextInt();
        
        System.out.println(allDigitsOdd(num));
        
    }
    
    public static boolean allDigitsOdd(int num){
        
        int digitCount = 0;
        int oddCount = 0;
        
        while(num!=0){
            
            int mod = num%10;
            
            if(mod%2!=0) oddCount++;
            
            num/=10;
            
            digitCount++;
            
        }
        
        if(oddCount==digitCount) return true;
        else return false;
        
    }
}


