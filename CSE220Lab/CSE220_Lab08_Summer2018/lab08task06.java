// 6. Implement binary search algorithm.


public class lab08task06{
    
    public static void main(String[]args){
        
        int [] a = {50, 10, 20, 40, 30, 60, 70};
        
        System.out.println(binarySearch(a, 70));
        
        System.out.println(binarySearch(a, 80));
        
    }
    
    public static int binarySearch(int a[], int elem){
        
        int start = 0;
        int end = a.length-1;
        
        
        int i = 0;
        
        while(start<=end){
            int mid = (start+end)/2;
            
            if(a[mid]==elem) return mid;
            
            if(a[mid]<elem) start = mid+1;
            else end = mid-1;
        }
        
        return -1;
    }
}

       
        
        
    
    