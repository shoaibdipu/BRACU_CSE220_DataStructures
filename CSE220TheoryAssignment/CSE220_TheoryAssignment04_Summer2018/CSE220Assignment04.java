/*
 * CSE 220
 * Assignment 04: Postfix Builder and Evaluator
 * Shoaib Ahmed Dipu
 * Id : 17 10 14 82
 * Sec 03, Summer 2018
 */

import java.util.Scanner;
import java.util.*;

public class CSE220Assignment04{
    
    public static void main(String[]args){
        String exp=new Scanner(System.in).next();
        String postFixExp = postFixBuilder(exp);
        System.out.println("Post Fix Expression: "+postFixExp);
        int result = postFixEvaluator(postFixExp);
        System.out.println("Answer: "+result);
    }
    
    public static String postFixBuilder(String s){
        
        Stack<Character> st = new Stack<>();
        
        String postfix = "";
        
        char ch [] = s.toCharArray();
        
        for(int i = 0 ; i <ch.length; i++){
            
            if((int)ch[i]>=48 && (int)ch[i]<=57){
                postfix = postfix + ch[i];
            }
            else if (ch[i] == '('){
                st.push(ch[i]);
            }
            else if (ch[i] == ')'){
                while (!st.isEmpty() && (char)st.peek() != '('){
                    postfix = postfix + st.pop();
                }
                if (!st.isEmpty() && (char)st.peek() != '('){
                    return "Invalid Expression"; }         
                else{
                    st.pop();
                }
                
            }
            else{ 
                while (!st.isEmpty() && precedence(ch[i])<=precedence((char)st.peek())){
                    postfix = postfix + st.pop();
                }
                st.push(ch[i]);
                
            }
        }
        while (!st.isEmpty()){
            postfix = postfix + st.pop();
        }
        return postfix;
    }
    public static int precedence (char ch){
        
        if(ch == '+' || ch == '-'){
            return 1;
        }
        else if(ch == '*' || ch == '/' || ch == '%'){
            return 2;
        }
        return 0;
    }
    public static int postFixEvaluator(String s){
        
        char ch [] = s.toCharArray();
        
        Stack<Integer> eval = new Stack<>();
        
        for(int i=0; i<ch.length; i++){
            if(ch[i]=='+' || ch[i]=='-' || ch[i]=='*' || ch[i]=='/' || ch[i]=='%'){
                int second = eval.pop();
                int first = eval.pop();
                if(ch[i]=='+') eval.push(first+second);
                else if(ch[i]=='-') eval.push(first-second);
                else if(ch[i]=='*') eval.push(first*second);
                else if(ch[i]=='/') eval.push(first/second);
                else if(ch[i]=='%') eval.push(first%second);
            }else{
                eval.push(ch[i] - '0');
            }
        }
        
        return eval.pop();  
    }
}
