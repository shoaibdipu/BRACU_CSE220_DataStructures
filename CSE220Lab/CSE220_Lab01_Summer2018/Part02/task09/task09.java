/*    
 Task 9
 Design a class for Quadratic equation named QuadEqn consisting of 3 coefficients, a,b,c
 a. Take input from user in main
 b. print this QuadEqn
 c. create a method to calculate 1st root
 d. print one of the roots from main. (assume all roots are real, use + instead of +/-)
 For example, if user gives 1, -5, 6
 then print the equation:  x2 - 5x + 6
 and 3  (the root/solution)
 */

import java.util.*;

public class task09{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the coefftcient 'a' for the eqn: ");
        int a = sc.nextInt();
        System.out.println("Enter the coefftcient 'b' for the eqn: ");
        int b = sc.nextInt();
        System.out.println("Enter the coefftcient 'c' for the eqn: ");
        int c = sc.nextInt();
        
        QuadEqn q = new QuadEqn(a,b,c);
        
        System.out.println(q);
        
        System.out.println("Root = " + root(a,b,c));
    }
    
    public static int root(int a, int b, int c){
        
        int r = (-b + (int)Math.sqrt(Math.pow(b,2)-4*a*c)) / 2*a;
        
        return r;
    }
    
}

