/*Task 4
 Write a Java program that would ask the user to enter ten numbers. 
 As the user enters the ten numbers the program will make sure that 
 all the numbers entered by the user are unique. For example 
 if the user enters 2, 3, 4, 6, and then tries to enter 3 again the program will 
 display that 3 is already in among the entered numbers and would ask the user to enter a new number.
 */
import java.util.*;

public class task04{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int [] a = new int[10];
        
        System.out.println("Enter A Number:");
        int firstNum =sc.nextInt();
        
        a[0]=firstNum;
        
        for(int i=1; i<=9; i++){
            System.out.println("Enter Another Number:");
            int anotherNum = sc.nextInt();
            for(int j=i; j>=1; j--){
                if(anotherNum==a[j-1]){
                    System.out.println("Already Exists!");
                    i--;
                }else{ 
                    a[i]=anotherNum;
                }
            }
        }
    }
}








