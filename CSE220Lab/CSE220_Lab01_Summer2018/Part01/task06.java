/*Task 6
 Write a program that reads in an array and checks if it is a palindrome*/

import java.util.*;

public class task06{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();
        
        int a [] = new int [len];
        
        for(int i=0; i<a.length; i++){
            System.out.print("Enter an element: ");
            a[i] = sc.nextInt();
        }
        
        int count = 0;
        
        for(int i=0, j=a.length-1; i<a.length; i++,j--){
            if(a[i]==a[j]) count++;
            
        }
        
        if(count==a.length) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
        
    }
}


