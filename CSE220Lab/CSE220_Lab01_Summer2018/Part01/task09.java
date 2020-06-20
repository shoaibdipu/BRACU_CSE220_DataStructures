/*Task 9
 Write a Java Code of a program that declares an array of integer type of size 10 
 and takes input of your choice. Have the program print the values, 
 square all the values, and then display the new values. 
 Write a static method (in the same class as main method) to do the displaying and 
 a second static method to find out the squares. Have the methods take the array 
 name and the array size as arguments. 
 */

import java.util.*;

public class task09{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        int a [] = new int[10];
        
        for(int i=0; i<10; i++){
            System.out.print("Enter a number: ");
            a[i] = sc.nextInt();
        }
        
        print(a, a.length);
        square(a, a.length);
        print(a, a.length);
    }
    
    public static void print(int x[], int len){
        for(int i=0; i<len; i++){
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
    
    public static void square(int x[], int len){
        for(int i=0; i<len; i++){
            x[i] = (int)Math.pow(x[i],2);
        }
    }
}


