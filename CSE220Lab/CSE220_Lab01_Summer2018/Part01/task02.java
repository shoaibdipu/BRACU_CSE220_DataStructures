/*Task 2
 Read in 10 input from the keyboard, and store them in an array. 
 Find the position (or index) of the maximum and minimum values in the array, 
 and swap them (move the biggest element to the position of the smallest, 
 and move the smallest element to the position of the biggest) 
 and print that again. If the user enters 7, 13, -5, 10, 6 
 then your program should print 7, -5, 13, 10, 6
 */

import java.util.*;

public class task02{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int len = sc.nextInt();
        
        int a [] = new int[len];
        
        for(int i=0; i<a.length; i++){
            System.out.print("Enter an element of array");
            a[i] = sc.nextInt();
        }
        
        int maxSoFar = a[0];
        int maxIndex = 0;
        int minSoFar = a[0];
        int minIndex = 0;
        
        for(int j=1; j<a.length; j++){
            
            if(a[j]>maxSoFar){
                maxIndex = j;
                maxSoFar = a[j];
            }
            
            if(a[j]<minSoFar){
                minIndex = j;
                minSoFar = a[j];
            }
        }
        
        int temp = maxSoFar;
        a[maxIndex] = minSoFar;
        a[minIndex] = temp;
        
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    
}



