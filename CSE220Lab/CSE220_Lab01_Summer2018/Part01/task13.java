/*Task 13
 Write the removeOdd method bellow which take in an array of numbers that has even and odd numbers mixed. 
 This function removes the odd numbers and returns a compact array which only has the even numbers.
 */

public class task13{
    
    public static void main(String [] args){
        int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
        for (int i = 0; i < mixedArray.length; i++) {
            System.out.print(mixedArray[i] + " ");
        }
        System.out.println();
        int [] noOdd = removeOdd(mixedArray);
        for (int i = 0; i < noOdd.length; i++) {
            System.out.print(noOdd[i] + " ");
        }    
    }
    public static int [] removeOdd (int [] input){
        
        int count = 0;
        
        for(int i=0; i<input.length; i++){
            if(input[i]%2==0) count++;
        }
        
        int noOdd [] = new int [count];
        
        int j = 0;
        
        for(int i=0; i<input.length; i++){
            if(input[i]%2==0){
                noOdd[j] = input[i];
                j++;
            }
        }
        
        return noOdd;
    }
    
}