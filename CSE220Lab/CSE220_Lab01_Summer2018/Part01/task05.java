/*Task 5
 Write a Java program that would ask the user to enter 15 numbers. 
 All the numbers are between 0 and 9. 
 The program should count how many time the number been given. */

import java.util.*;

public class task05{
    public static void main(String [] agrs){
        
        Scanner sc = new Scanner(System.in);
        
        int a [] = new int [10];
        
        for(int i=0; i<15; i++){
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            
            if(num==0) a[0]++;
            else if(num==1) a[1]++;
            else if(num==2) a[2]++;
            else if(num==3) a[3]++;
            else if(num==4) a[4]++;
            else if(num==5) a[5]++;
            else if(num==6) a[6]++;
            else if(num==7) a[7]++;
            else if(num==8) a[8]++;
            else if(num==9) a[9]++;
            
        }
        
        for(int i=0; i<10; i++){
            System.out.println(i +" was found "+ a[i] + " times");
        }
    }
}




