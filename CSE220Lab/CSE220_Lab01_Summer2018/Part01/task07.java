/*
 Task 7
 Read 10 input from the user, and store them in an array. 
 Then ask the user to give another input between 0 and 9 for choosing an array cell. 
 'Display a line with that many "*" characters.
 */

import java.util.*;

public class task07{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        int [] a = new int [10];
        for(int i=0; i<a.length; i++){
            System.out.print("Enter a element of an array");
            a[i] = sc.nextInt();
        }
        
        System.out.println("Enter a number");
        int num = sc.nextInt();
        
        int noOfStar = a[num-1];
        
        for(int i=0; i<noOfStar; i++){
            System.out.print("*");
        }
    }
}
