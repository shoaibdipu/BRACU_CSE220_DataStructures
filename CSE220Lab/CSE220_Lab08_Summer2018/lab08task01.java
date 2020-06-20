// 1. Sort an array using selection sort algorithm.

public class lab08task01{
    public static void main(String [] args){
        
        int [] a = {50, 10, 20, 40, 30};
        
        for(int i=0; i<a.length-1; i++){
            int smallestSoFar = a[i];
            int smallestLocation = i;
            
            for(int j=i+1; j<a.length; j++){
                if(a[j]<smallestSoFar){
                    smallestSoFar = a[j];
                    smallestLocation = j;
                }
            }
            
            int temp = a[i];
            a[i] = smallestSoFar;
            a[smallestLocation] = temp;
        }
        
        printArray(a);
        
    }
    
    public static void printArray(int a[]){
        for(int value : a) System.out.print(value + " ");
    }
    
}
