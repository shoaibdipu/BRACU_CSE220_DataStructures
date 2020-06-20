/*Task 3
 Write a program which reads 5 numbers into an array, sorts/arranges the numbers 
 from high to low and prints all numbers in the array and the even number in that list.
 If the user enters 7, 13, 2, 10, 6 
 then your program should print 13, 10, 7, 6, 2, 10, 6 , 2.*/

import java.util.*;

public class task03{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        int a [] = new int [5];
        
        for(int i=0; i<a.length; i++){
            System.out.println("Enter an element of array");
            a[i] = sc.nextInt();
        }
        
        
        for(int i=0; i<a.length-1; i++){
            int highestSoFar = a[i];
            int highestIndex = i;
            for(int j=i+1; j<a.length; j++){
                if(a[j]>highestSoFar){
                    highestSoFar = a[j];
                    highestIndex = j;
                }
            }
            int temp = a[i];
            a[i] = highestSoFar;
            a[highestIndex] = temp;
        }
        
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        
        for(int i=0; i<a.length; i++){
            if(a[i]%2==0){
                System.out.print(a[i] + " ");
            }
        }
    }
}


