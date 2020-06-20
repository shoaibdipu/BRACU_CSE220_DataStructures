import java.util.*;

public class task04{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        try{
            int x,n=sc.nextInt();
            int a[]=new int[n];
            a[5]=99;
            x=n/0;
        }catch(ArrayIndexOutOfBoundsException a){
            System.err.println("Array Index Out Of Bounds Exception");
        }catch(ArithmeticException e){
            System.err.println("Arithmetic Exception");
        }catch(InputMismatchException i){
            System.err.println("Input Mismatch Exception");
        }catch(Exception g){
            System.err.println("Generic Exception");
        }finally{
            System.err.println("THE END");
        }
        
    }
}