/*
 * CSE 220
 * Assignment 05 : Parenthesis Balancing
 * Shoaib Ahmed Dipu
 * Id : 17 10 14 82
 * Sec 03, Summer 2018
 */

import java.util.*;

public class Assignment05Tester{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter choice: \n");
        System.out.print("1.ArrayBased Stack \n");
        System.out.print("2.StackBased Stack \n");
        int choice = sc.nextInt();
        
        
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter A String To Check: ");
        String s = sc2.nextLine();
        

        Stack st = null;
        
        if(choice==1){
            st = new ArrayStack();
        }else if(choice==2){
            st = new ListStack();
        }
        
        char ch [] = s.toCharArray();
        boolean b1 = false;
        
        for(int i=0; i<ch.length; i++){
            
            if(ch[i]== '[' || ch[i]== '{' || ch[i]=='('){
                try{
                    st.push(ch[i]);
                }catch(StackOverFlowException e){
                    System.err.println("Stack OverFlow Exception!");
                }
            }else if((ch[i]==']' || ch[i]=='}' || ch[i]==')') && (!st.isEmpty())){
                try{
                    if( ((char)st.peek() == '(' && ch[i]==')')
                           || ((char)st.peek() == '{' && ch[i]=='}')
                           || ((char)st.peek() == '[' && ch[i]==']')){
                        st.pop();
                        
                    }else{
                        System.out.print(s + "\n");
                        System.out.print("This expression is NOT correct. \n");
                        System.out.print("Error at character # " + (i+1) + ". " + "'" + ch[i] + "'" + "- not closed.");
                        b1 = true;
                        break;
                    }
                }catch(StackUnderFlowException e){
                    System.err.println("Stack Under Flow Exception");
                }
                
            }else if ((ch[i] == ']' || ch[i] == '}' || ch[i] == ')')){
                System.out.print(s + "\n");
                System.out.print("This expression is NOT correct. \n");
                System.out.print("Error at character # " + (i+1) + ". " + "'" + ch[i] + "'" + "- not opened.");
                b1 = true;
                break;
            }
        }
        
        if(b1==true){
        }else{
            
            if(st.isEmpty()){
                System.out.print(s + "\n" + "This expression is correct.");
            }
//        }else{
//            System.out.print(s + "\n" + "This expression is NOT correct.");
//            
//        }
        }
    }
}



