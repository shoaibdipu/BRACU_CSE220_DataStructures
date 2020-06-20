import java.util.*;
import java.lang.Integer;

public class MyReader{
    int readInteger(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        try{
            String s = sc.nextLine();
            int num = Integer.parseInt(s);
            return num;
        }catch(NumberFormatException n){
            return 0;
        }
        
    }
}