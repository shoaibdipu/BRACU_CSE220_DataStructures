import java.util.*;

public class task03{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x,n=sc.nextInt();
        try{
            int a[]=new int[n];
            a[5]=99;
            x=n/0;
        }catch(ArrayIndexOutOfBoundsException a){
            System.err.println("Array Index Out Of Bounds Exception");
        }catch(ArithmeticException e){
            System.err.println("Arithmetic Exception");
        }finally{
            System.err.println("THE END");
        }
        
    }
}