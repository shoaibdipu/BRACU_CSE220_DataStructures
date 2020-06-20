/*Task 8
 Ask user for dimension/size of two row matrices, 
 take all values in each matrix and print the summation. 
 If matrices are A and B, then you need to calculate C=5A-B. 
 For example, if the user enters 3, then size of each matrix is 3. 
 Then you need to take 3 values for first matrix which will form A = [5 6 7].
 Then take 3 values for second matrix, B = [2 3 4]. You need to print result, 
 C = [23 27 31]. The output will be 23 27 31. 
 You must use array, loop (while or for), and array.length for this program. 
 */

import java.util.*;

public class task08{
    public static void main(String [] agrs){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the dimention of row matrices");
        int dim = sc.nextInt();
        
        int a [] = new int [dim];
        int b [] = new int [dim];
        int c [] = new int [dim];
        
        System.out.println("Enter the elements of Array A");
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        
        System.out.println("Emter the elements of Array B");
        for(int i=0; i<b.length; i++){
            b[i] = sc.nextInt();
        }
        
        for(int i=0; i<c.length; i++){
            c[i] = 5*a[i] - b[i];
        }
        
        for(int i=0; i<dim; i++){
            System.out.print(c[i] + " ");
        }
    }
}


