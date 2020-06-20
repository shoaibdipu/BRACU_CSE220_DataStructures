// 2. Sort an array using insertion sort algorithm. 

public class lab08task02{
    public static void main(String [] args){
        
        int [] a = {50, 10, 20, 40, 30};
        
        for(int i=1; i<a.length; i++){
            
            int key = a[i];
            int j = i-1;
            
            while(j>=0 && a[j]>key){
                a[j+1] = a[j];
                j=j-1;
            }
            
            a[j+1] = key;
        }
        printArray(a);
    }
    
    public static void printArray(int a[]){
        for(int value : a) System.out.print(value + " ");
    }
}