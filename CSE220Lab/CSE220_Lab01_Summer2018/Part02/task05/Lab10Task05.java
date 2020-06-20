/*Task 5
 Change and complete the MyReader class so that you can create your own exception 
 ‘EitaIntegerNoiException’. There will be a method int readInteger( ). 
 This method will take a String form the user. Then it will check 
 if the number was ‘int’ or ‘float’ by checking presence of the decimal point in the input. 
 It will throw an exception when a floating-point number is entered. 
 Otherwise, it will return the integer number.
 */

import java.util.*;
import java.lang.Integer;

public class Lab10Task05{
    public static void main(String args[]){
        
        MyReader m = new MyReader();
        int x;
        try{
            x=m.readInteger(); 
            if(x==0){
                EitaIntegerNoiException i = new EitaIntegerNoiException();
                throw i;
            }else{
                System.out.println("User Input Type : Int" + "\n" + "Value : " + x);
            }
        }catch(EitaIntegerNoiException e){
            System.out.println("User Input : Double" + "\n" + "Exception Type : " + e);
        }
        
    }
}
