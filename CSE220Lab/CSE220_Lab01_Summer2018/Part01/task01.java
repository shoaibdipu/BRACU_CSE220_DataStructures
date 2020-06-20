/*Task 1:
 Given an array of ints, return true if 6 appears as either the first or. 
 Last element in the array. The array will be length 1 or more. 
 
 firstLast6 ({1, 2, 6}) ? true
 firstLast6 ({6, 1, 2, 3}) ? true
 firstLast6 ({13, 6, 1, 2, 3}) ? false
 */

public class task01{
    public static boolean firstLast6(int a[]){
        int len = a.length;
        if(a[0]==6) return true;
        else if(a[a.length-1]==6) return true;
        else return false;
    }
    
    public static void main(String [] args){
        
        int a [] = {5, 7, 8, 9, 6};
        System.out.println(firstLast6(a));
        
    }
}
