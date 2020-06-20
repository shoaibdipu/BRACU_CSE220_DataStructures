/*Task 10
 Array Left Rotate and Right Rotate: Consider the 1, 4, 8, 16, 25, 36, 49, 64, 81, 100. 
 Now, right and left rotate the array by the no. of position given by the user. 
 Example: If  user gives ‘4’ as no. of position to be rotated, your left rotate 
 should give output ‘25, 36, 49, 64, 81, 100, 1, 4, 8, 16’ and 
 right rotate should give output ‘49, 64, 81, 100, 1, 4, 8, 16, 25, 36’.
 */
import java.util.*;

public class task10{
    public static void main(String [] args){
        
        int a [] = {1, 4, 8, 16, 25, 36, 49, 64, 81, 100};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a position for rotating array");
        int pos = sc.nextInt();
        
        System.out.println("Array Rotation : Left");
        
        for(int i=pos; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        
        for(int i=0; i<=pos-1; i++){
            System.out.print(a[i] + " ");
        }
        
        
        System.out.println("\n" + "Array Rotation : Right");
        
        
        for(int i=a.length-pos; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        
        for(int i=0; i<=(a.length-pos)-1; i++){
            System.out.print(a[i] + " ");
        }
        
        
    }
}
