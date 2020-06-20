// Implemented With List Queue

import java.util.*;

public class WRM2{
    private Queue q;
    int id = 1001;
    
    Scanner sc = new Scanner(System.in);
    
    public WRM2(){
        q = new ListQueue();
    }
    
    // RegisterPatient(): This method assigns an Id (which is auto-generated) 
    // to a patient and register him/her to the system.
    
    public void RegisterPatient(){
        Scanner n = new Scanner(System.in);
        
        System.out.println("Enter Name: ");
        String name = n.nextLine();
        
        System.out.println("Enter Age: ");
        int age = sc.nextInt();
        
        Scanner b = new Scanner(System.in);
        
        System.out.println("Enter Blood Group: ");
        String bg = b.nextLine();
        
        Patient p = new Patient(name, id, age, bg);
        
        id++;
        
        try{
            q.enqueue(p); 
        }catch(QueueOverflowException e){
            System.err.println("OVERFLOW!");
        }
        
        q.toString();
    }
    
    
    // ServePatient():This method calls a patient
    // to provide hospital service to him/her.
    
    public void ServePatient(){
        try{
            q.dequeue();
        }catch(QueueUnderflowException e){
            System.err.println("UNDERFLOW!");
        }
        
        q.toString();
        
    }
    
    // CancelAll():This method cancels all appointments of the patients 
    // so that the doctor can go to lunch.
    
    public void CancelAll(){
        
        int size = q.size();
        
        for(int i=0; i<size; i++){
            try{
                q.dequeue();
            }catch(QueueUnderflowException e){
                System.err.println("UNDERFLOW!");
            }
            
        }
        
        q.toString();
        
    }
    
    // CanDoctorGoHome():This method returns true if no one is waiting, 
    // otherwise, returns false.
    
    
    public boolean CanDoctorGoHome(){
        if(q.size()==0) return true;
        else return false;
    }
    
    // ShowAllPatient():This method shows all ids of the 
    // waiting patients in SORTED order.
    
    public Object[] ShowAllPatient(){
        
        Object newA [] = q.toArray();
        
        for(int i=0; i<newA.length; i++){
            
            Object frontal1 = newA[i];
            int frontal1Loc = i;
            
            for(int j=i+1; j<newA.length; j++){ 
                Object frontalT = newA[j];
                
                String s1 = frontal1.name;
                String s2 = frontal2.name;
                
                if((s2.compareTo(s1)<0)){
                    frontal1 = newA[j];
                    frontal1Loc = j;
                }
            }
            
            Object temp = newA[i];
            a[i] = frontal1;
            a[frontal1Loc] = temp; 
        }    
        
        return newA;
    }
    
    public void tempShow(){
        System.out.print(q.toString());
    }
    
}
